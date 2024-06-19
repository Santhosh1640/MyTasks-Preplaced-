package BinarySearch;

public class PeakIndexinaMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int i = 1;
        int j = n-2;

        while(i<j) {
            int mid = i+(j-i)/2;
            if(arr[mid]>=arr[mid-1] && arr[mid]>=arr[mid+1]) {
                return mid;
            }
            else if(arr[mid]<arr[mid+1]) {
                i=mid+1;
            }else if(arr[mid]<arr[mid-1]) {
                j=mid-1;
            }
        }
        return j;
    }
}
