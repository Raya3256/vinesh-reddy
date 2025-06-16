public class Binarysearch
{
    public static int binarysearch(int arr[],int n,int target)
    {
        int low = 0;
        int high = n-1;
        while(low <= high)
        {
            int mid = low+high/2;
            if(target == arr[mid]) return mid;
            else if(target > arr[mid]) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
        public static void main(String args[])
        {
            int arr[] = {1,2,3,4,5,6};
            int target = 3;
            int n = arr.length;
            int ind = binarysearch(arr,n,target);
            System.out.println(ind+" is target value");
        }
    }