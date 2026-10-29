class Solution {
    public void merge(int[] nums1, int n, int[] nums2, int m) {
        int i=0;
        int j=0;
        int k=0;
        int arr[]=new int[m+n];
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                arr[k]=nums1[i];
                i++;
            }
            else{
                arr[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            arr[k]=nums1[i];
            i++;k++;
        }
         while(j<m){
            arr[k]=nums2[j];
            j++;k++;
        }
        for(int x=0;x<arr.length;x++){
            nums1[x]=arr[x];
        }
    }
}