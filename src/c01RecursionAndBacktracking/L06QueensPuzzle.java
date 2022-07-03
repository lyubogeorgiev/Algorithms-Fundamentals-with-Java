package c01RecursionAndBacktracking;

public class L06QueensPuzzle {
    static char[][] board= new char[][]{
        {'-', '-', '-', '-', '-', '-', '-', '-'},
        {'-', '-', '-', '-', '-', '-', '-', '-'},
        {'-', '-', '-', '-', '-', '-', '-', '-'},
        {'-', '-', '-', '-', '-', '-', '-', '-'},
        {'-', '-', '-', '-', '-', '-', '-', '-'},
        {'-', '-', '-', '-', '-', '-', '-', '-'},
        {'-', '-', '-', '-', '-', '-', '-', '-'},
        {'-', '-', '-', '-', '-', '-', '-', '-'}
    };

    public static void main(String[] args) {
        recursiveQueen(0);
    }

    public static void recursiveQueen(int row){
        if (row > 7){
            print(board);
        } else {
            for (int col = 0; col < 8; col++) {
                if (canPlaceQueen(row, col)){
                    putQueen(row, col);
                    recursiveQueen(row + 1);
                    removeQueen(row, col);
                }
            }
        }
    }

    public static void removeQueen(int row, int col){
        board[row][col] = '-';
    }

    public static void putQueen(int row, int col){
        board[row][col] = '*';
    }

    public static boolean canPlaceQueen(int row, int col){
        //check col
        for (int r = 0; r < 8; r++) {
            if (board[r][col] == '*'){
                return false;
            }
        }

        //check main diagonal
        int r = row, c = col;

        while(r >= 0 && c >= 0){
            if (board[r][c] == '*'){
                return false;
            }

            r--;
            c--;
        }

        r= row;
        c = col;

        while (r < board.length && c < board[r].length){
            if (board[r][c] == '*'){
                return false;
            }

            r++;
            c++;
        }
        //check second diagonal
        r = row;
        c = col;

        while(r < board.length && c >= 0){
            if (board[r][c] == '*'){
                return false;
            }

            r++;
            c--;
        }

        r = row;
        c = col;

        while (r >= 0 && c < board[r].length){
            if (board[r][c] == '*'){
                return false;
            }

            r--;
            c++;
        }
        return true;
    }

    public static void print(char[][] result){
        for (char[] chars : result) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }

            System.out.println();
        }

        System.out.println();
    }
}
