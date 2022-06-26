public class LC256 {
    public static void main(String[] args) {
        int[][] test = {{10000,1,3},{2,2,3}, {0,0,1}};
        System.out.println(paintHouse(test));

    }

    public static int paintHouse(int[][] cost) {
        int[] min = {Integer.MAX_VALUE};

        findCheapest(min, cost, 0, -1,0);
        return min[0];
    }

    private static void findCheapest(int[] min,int[][] cost,int index, int previousColor, int curCost ){
        if(index == cost.length){
            System.out.println(curCost);
           min[0] = Math.min(curCost, min[0]);
            return;
        }
        for(int i =0; i < 3; i++ ){
            if(i == previousColor){
                continue;
            }
            curCost+= cost[index][i];
            findCheapest(min,cost,index+1,i,curCost);
            curCost-= cost[index][i];
        }
    }

}
