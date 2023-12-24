public class recursionfirstoccurrence{

    public static int first(int arr[],int key,int i){
        int count =0;
        if(i<0){
            System.out.println("key value is not present");
            return 0;
        }
        if(arr[i]==key){
            return i;
        }else{
            return first(arr,key,i-1);
        }

    }

    public static void main(String args[]){
        int arr[] = {2,5,6,3,1,6,7,5};
        int a=first(arr,5,arr.length-1);
        System.out.println(a);
    }
}