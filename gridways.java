public class gridways{
    
    public static int gridWays(int x,int y,int m,int n){
        int totalways =0;
        if(x==m-1 && y==n-1){
            return 1;
        }else if(x==n || y==m){
            return 0;
        }
        int w1=gridWays(x+1,y,m,n);
        int w2=gridWays(x,y+1,m,n);
        totalways = w1 + w2 ;
        return totalways;
    }
    
    public static void main(String args[])
    {
        System.out.println(gridWays(0,0,3,3));
    }
}