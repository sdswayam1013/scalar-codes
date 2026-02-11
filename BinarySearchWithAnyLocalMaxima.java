// #Problem Description
// Given an array of integers A, find and return the peak element in it.
// An array element is considered a peak if it is not smaller than its neighbors. For corner elements, we need to consider only one neighbor.

// NOTE:
// It is guaranteed that the array contains only a single peak element.
// Users are expected to solve this in O(log(N)) time. The array may contain duplicate elements.


public class BinarySearchWithAnyLocalMaxima { 
    public int solve(int[] A) {
         int low=0;
         int high=A.length - 1;

        while(low<high){
            
            int mid =low + (high-low)/2;
            
            if( A[mid] < A[mid+1]){
                low=mid+1;
            }
            else
            high=mid;
        }
        return A[low];
    }
}


