import java.util.*;
public class incometaxcalci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter income");
        int a = sc.nextInt();

        if(a < 500000){
            System.out.println("5% income");
        }else if(a < 1000000 && a > 500000){
            System.out.println("20% income");
        }else{
            System.out.println("30% income");
        }
    }
}
