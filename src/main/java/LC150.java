import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int evalRPN(String[] tokens) {
        int cur = 0;
        Deque<Integer> deque = new LinkedList<>();
        while (cur< tokens.length){
            while(!"-=*/".contains(tokens[cur])){
                deque.offerFirst(Integer.parseInt(tokens[cur]));
                cur++;
            }
            int right = deque.pollFirst();
            int left = deque.pollFirst();
            deque.offerFirst(op(left,right,tokens[cur]));
            cur++;

        }
        return deque.pollFirst();

    }
    private int op(int left, int right, String operation){
        switch (operation) {
            case "+" : return left+right;
            case "-" : return left-right;
            case "*" : return left*right;
            case "/" : return left/right;
            default: System.out.println(operation);
            return 0;
        }
    }
}
