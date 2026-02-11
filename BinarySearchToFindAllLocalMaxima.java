import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearchToFindAllLocalMaxima {
    public static List<Integer> BinarySearchToFindAllLocalMaxima(int []A){

    List<Integer> result = new ArrayList<>();
    if(A[0] >= A[1]){
        result.add(A[0]);
   }
    if(A[A.length-1] >=A[A.length-2]){
        result.add(A[A.length-1]);
    }
    for(int i=1; i<A.length-1; i++){
        if(A[i] >= A[i-1] && A[i] >=A[i+1]){
            result.add(A[i]);
        }
    }
    
        return result;
        
    }

    public static void main(String[] args){
        System.out.println("enter the size of the array");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(BinarySearchToFindAllLocalMaxima(arr));
    }
}
