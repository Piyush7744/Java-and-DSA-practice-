import java.util.*;
public class invertedstar{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n-1;

    for(int i = 1; i <= n; i++){
            
            for(space=1;space<=n-i;space++){
                System.out.print("  ");
            }
            for(int j=space;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println("");

        }
    }
}