import java.util.Scanner;
import java.util.Arrays;


public class BinarySearchWithRepeatingNumbers{
    public static void main(String[] args){
        System.out.println("enter the size of array");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("enter the tatrget element");
        int target = scn.nextInt();
        int ans =binarySearch(arr,target);
        
        System.out.println(ans);

     }
    

    public static int binarySearch(int[] arr, int target){
       
        Arrays.sort(arr);


        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1; // Continue searching in the right half for the last occurrence
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }


    
    
}