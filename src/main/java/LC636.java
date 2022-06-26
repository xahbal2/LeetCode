import java.util.Deque;
import java.util.LinkedList;

public class LC636 {
    public int[] time(String[] log , int n) {
        Deque<Integer> stack = new LinkedList<>();
        int[] res = new int[n];
        for(String a : log){
            String[] cur = a.split(":");
            if(cur[1].equals("end")){
                res[Integer.parseInt(cur[0])] += (Integer.parseInt(stack.pollFirst())+ Integer.parseInt(cur[2]));
            }else{

            }
        }

    }



}
