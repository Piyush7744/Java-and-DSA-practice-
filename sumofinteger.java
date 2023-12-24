import java.util.*;
public class sumofinteger{

    public static void sumOfNum(int num){

        int sum =0,lastDigit=0;
        while(num>0){
        lastDigit = num%10;
        sum = sum + lastDigit;
        num = num/10;

        }

        System.out.println(sum);
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer");
        int num = sc.nextInt();
        sumOfNum(num);
        
    }
} 