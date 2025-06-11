import java.util.*;
 public class Twosum
{
    public static int twosum(int arr[],int n,int target)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println("["+i+"]"+","+"["+j+"]");
                }
            }
        }
        return 0;
    }
    public static void main(String args[])
    {
        int arr[] = {1,3,5,7,9,4};
        int n = arr.length;
        int target = 8;
        twosum(arr,n,target);
    }
}