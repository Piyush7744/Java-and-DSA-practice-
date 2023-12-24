public class numtostrusingrecursion{
    
    public static void print(int num){
        int arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        lastdigit = num%10;
        String str = (String)lastdigit;
        print(num/10);
        str.reverse();
        
    }
    
    public static void main(Strin args[]){
        print(2019);
    }
}