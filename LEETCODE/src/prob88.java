class prob88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[]arr = new int[m + n];
        int index = 0;
        int l1 = 0;
        int l2 = 0;
        while (l1 < m && l2 < n){
            if (nums1[l1] < nums2[l2]){
                arr[index] = nums1[l1];
                l1 ++;
            }
            else{
                arr[index] = nums2[l2];
                l2 ++;
            }
            index++;
        }
        if (l1 < m){
            while (l1 < m){
                arr[index] = nums1[l1];
                l1 ++;
                index ++;
            }
        }
        if (l2 < n){
            while (l2 < n){
                arr[index] = nums2[l2];
                l2 ++;
                index ++;
            }
        }
        for (int i = 0; i < arr.length; i ++){
            nums1[i] = arr[i];
        }
    }
}