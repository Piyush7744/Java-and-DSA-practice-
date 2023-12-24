import java.util.*;

public class butterflypattern{

    public static void butterfly(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            for(int space = 0;space<2*(n-i);space++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        for(int z=n;z>=1;z--){
            for(int m=0;m<z;m++){
                System.out.print("* ");
            }
            for(int space1 = 0;space1<2*(n-z);space1++){
                System.out.print("  ");
            }
            for(int l=1;l<=z;l++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        
    }


    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        butterfly(n);
    }
}