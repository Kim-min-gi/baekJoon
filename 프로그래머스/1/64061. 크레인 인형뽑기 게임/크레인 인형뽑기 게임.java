import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int move;
        int count = 0;

        for (int i =0; i<moves.length; i++){
            move = moves[i] - 1;
            for (int j=0; j<board.length; j++){
                if(board[j][move] != 0){
                    if (!stack.isEmpty() && stack.peek() == board[j][move]) {
                        count++;
                        stack.pop();
                    }else {
                        stack.push(board[j][move]);
                    }
                    board[j][move] = 0;
                    break;
                }
            }
        }

        return count * 2;
    }
}