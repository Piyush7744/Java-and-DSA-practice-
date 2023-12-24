import java.util.*;
public class sumofnnatural{
    public static void main(String args[]){
        int i = 1,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        while(i<n+1){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}