import java.util.*;
 public class Prime
{
    static boolean checkPrime(int n)
    {
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
      System.out.println("enter a number : ");
     int n = sc.nextInt();
        boolean isprime = checkPrime(n);
        if(isprime){
            System.out.println(n + " is a prime number.");
        }else{
            System.out.println(n + " is not a prime number.");
        }
    }
       sc.close();
}
