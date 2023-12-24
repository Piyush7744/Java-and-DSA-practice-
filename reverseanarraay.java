public class reverseanarraay{

    public static void reverse(int arr[]){
        int start = 0;
        int end = arr.length -1;
        for(int i=0;i<arr.length;i++){
            if(start == end){
                break;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;    
        }


    }

    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        reverse(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}