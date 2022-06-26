import java.util.ArrayList;
import java.util.List;

public class LC373 {
    public static void main(String[] args) {

    }

    private static List<Integer> kSmalls(int[] arr1, int[] arr2, int k) {
        List<List<Integer>> result = new ArrayList<>();

        int cur = k;
        int p1 = 0;
        int p2 = 0;

        while (cur >= 0 && p1 > arr1.length-1 && p2 > arr2.length-1) {
             if(arr1[p1]+arr2[p2+1]>= arr1[p1+1] + arr1[p2]){
                 p1++;
             }else {
                 p2++;
             }
             List<Integer> curResult = new ArrayList<>();
             curResult.add(arr1[p1]);
             curResult.add(arr2[p2]);
             cur--;

        }

        if(cur== 0 )

        while()
        return null;
    }
}



}

