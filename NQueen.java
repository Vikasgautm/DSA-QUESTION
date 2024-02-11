import java.util.List;

public class NQueen {
    public boolean isSafe(int row,int col,char[][]board){
        for(int j=0;j<board.length;j++){
            if(board[row][j]='Q'){
                return false;
            }
        }
    }
    public void helper(char[][] board,List<List<String>>allBoards,int col){
        if(col==board.length){
            saveBoard(board,allBoards);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                helper(board, allBoards, col+1);
                board[row][col]='.';
            }
        }
    }
    static public List<List<String>>solveNQeen(int n){
        List<List<String>>allBoards=new ArrrayList<>();
        char[][]board=new board[n][n];
        helper(board, allBoards, 0);
    }
    public static void main(String[] args) {
        int n=4;
        solveNQeen(n);
    }
}
