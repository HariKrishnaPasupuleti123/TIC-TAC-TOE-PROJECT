import java.util.*;

class TicTacToe {
    static char[][] board;

    public TicTacToe() {
        board = new char[3][3];
        initialize();
    }

    void initialize() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    void display() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    static void placeMark(int row, int col, char mark) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            board[row][col] = mark;
        } else {
            System.out.println("Invalid Position");
        }
    }

    static boolean checkColWin() {
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) return true;
        }
        return false;
    }

    static boolean checkRowWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) return true;
        }
        return false;
    }

    static boolean checkDiagWin() {
        if ((board[1][1] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
            (board[1][1] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0])) return true;
        return false;
    }

    static boolean checkDraw() {
        int c = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') c++;
            }
        }
        return c == 0;
    }
}

class HumanPlayer {
    String name;
    char mark;

    HumanPlayer(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    void makeMove() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column");
        int row, col;
        do {
            row = sc.nextInt();
            col = sc.nextInt();
        } while (!isValidMove(row, col));
        TicTacToe.placeMark(row, col, mark);
    }

    boolean isValidMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            if (TicTacToe.board[row][col] == ' ') return true;
        }
        System.out.println("Invalid Move");
        return false;
    }
}

class Launch2Players {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        HumanPlayer p1 = new HumanPlayer("Hari", 'X');
        HumanPlayer p2 = new HumanPlayer("Krishna", 'O');
        HumanPlayer cp = p1;
        t.display();

        while (true) {
            System.out.println(cp.name + " Turn");
            cp.makeMove();
            t.display();
            if (TicTacToe.checkColWin() || TicTacToe.checkRowWin() || TicTacToe.checkDiagWin()) {
                System.out.println(cp.name + " has won");
                break;
            } else if (TicTacToe.checkDraw()) {
                System.out.println("Draw");
                break;
            } else {
                cp = (cp == p1) ? p2 : p1;
            }
        }
    }
}
