import java.util.*;

class WordDistance {

    public static Map<Set<String>,Integer> map ;

    public WordDistance(String[] wordsDict) {
        Set<String> set = new HashSet<>(Arrays.asList(wordsDict));
        List<String> list = new ArrayList<>(set);
        map = new HashMap<>();
        for(int i = 0; i < list.size(); i++){
            for(int j = i+1; j<list.size(); j++){
                Set<String> curSet = new HashSet<>();
                curSet.add(list.get(i));
                curSet.add(list.get(j));

                map.put(curSet, findMin(wordsDict,list.get(i),list.get(j)));
            }
        }


    }

    public int shortest(String word1, String word2) {
        Set<String> curSet = new HashSet<>();
        curSet.add(word1);
        curSet.add(word2);
        return  map.get(curSet) == null? 0: map.get(curSet);

    }

    private int findMin(String[] array, String a, String b){
        int left = -1;
        int right = -1;
        int res = Integer.MAX_VALUE;
        for(int i = 0; i< array.length; i++){
            if(array[i].equals(a)){
                left =i;
            }
            if(array[i].equals(b)){
                right = i;
            }
            if(left !=-1 && right != -1){
                res = Math.min(res, Math.abs(left-right));
            }
        }
        return res;
    }
}