public class arrayq1{

    public static void duplicate(int number[]){
        for(int i=0;i<number.length;i++){
            int num = number[i];
            for(int j=i+1;j<number.length;j++){
                if(num == number[j]){
                    System.out.println(number[i]+"is repeated");
                    break;
                }
                
            }
        }
    }

    public static void main(String args[]){
        int number[] = {1,2,3,4};
        duplicate(number);
    }
}