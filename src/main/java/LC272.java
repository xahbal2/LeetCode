import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
class Solution {
    public List<Integer> closestKValues(TreeNode root, double target, int k) {
        List<Double> list = new ArrayList<>();

        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode cur = root;
        while(cur!=null ||!stack.isEmpty()){
            if(cur!=null){
                stack.offerFirst(cur);
                cur = cur.left;
            }else{
                cur = stack.pollFirst();
                list.add((double) cur.val);
                cur= cur.right;
            }



        }
        int targetIndex = 0;
        int left = 0;
        int right = list.size()-1;
        while(left<right-1){
            int mid =(right-left)/2;
            if(list.get(mid) == target){
                targetIndex = mid;
                break;
            }else if(list.get(mid)< target){
                left = mid;
            }else {
                right = mid;
            }
        }

        if(list.get(targetIndex)!= target){
            if (Math.abs(list.get(left) - target) >= Math.abs(list.get(right)-target)){
                targetIndex = right;
            }else{
                targetIndex = left;
            }
        }

        List<Integer> res = new ArrayList<>();

        int start = targetIndex;
        int end = targetIndex;
        while((start>=0 || end < list.size()-1 )&& res.size()<=7) {
            if (start >= 0 && end < list.size() - 1) {
                if (Math.abs(list.get(start) - target) >= Math.abs(list.get(end) - target)) {
                    double current = list.get(end);
                    res.add((int) current);
                    end++;
                } else if (Math.abs(list.get(start) - target) < Math.abs(list.get(end) - target)) {
                    double current = list.get(start);
                    res.add((int) current);
                    start--;

                }
            }


        }



        return res;


    }
}
