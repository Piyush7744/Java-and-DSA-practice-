public class trappedwater{

    public static void trappedWater(int number[]){
        int n = number.length;
        int trappedwater=0,waterlevel=0;
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = number[0];
        for(int i = 1; i < n ; i++){
            left[i] = Math.max(number[i],left[i-1]);
        }

        right[n-1] = number[n-1];
        for(int j = n-2; j>=0;j--){
            right[j] = Math.max(number[j],right[j+1]);
        }

        for(int k=0;k<n;k++){
            waterlevel = Math.min(right[k],left[k]);
            trappedwater =trappedwater + (waterlevel - number[k]);
        }

        System.out.println(trappedwater);
    }

    public static void main(String args[]){
        int number[] = {4,2,0,6,3,2,5};
        trappedWater(number);
    }
}
