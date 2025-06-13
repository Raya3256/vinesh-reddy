 public class greaterSubarray {
     public static int greaterSubarray(int arr[],int k,int n)
     {
         int cnt = 0;
         for(int i=0;i<n;i++)
         {
             int sum = 0;
             for(int j = i;j<n;j++)
             {
                 sum += arr[j];
                 if(sum > k)
                 {
                     cnt++;
                     }
                 }
             }
             return cnt;
         }
         public static void main(String args[])
         {
             int arr[] = {1,2,3};
             int k = 3;
             int n = arr.length;
             int vinesh = greaterSubarray(arr, k, n);
             if(vinesh > 0)
             {
                 System.out.println(vinesh+ " is greater value ");
             }
                 else
                 {
                    System.out.println(vinesh+ " is not greater value");
                 }
             }
         }