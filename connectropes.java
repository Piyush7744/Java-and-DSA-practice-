import java.util.*;
class connectropes{
    public static int minropes(int arr[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }

        int cost=0;
        while(pq.size()>1){
            int val = pq.poll();
            int val1 = pq.poll();
            cost+=val1+val;
            pq.add(val1+val);
        }
    
        return cost;
    }

    public static void main(String args[]){
        int arr[]={4,3,2,6};
        int val = minropes(arr);
        System.out.println(val);
    }
}