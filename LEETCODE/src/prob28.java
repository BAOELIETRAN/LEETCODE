class Solution {
    public int strStr(String haystack, String needle) {
        int length1 = haystack.length();
        int length2 = needle.length();
        int index = 0;
        while ((index + length2) <= length1){
            if (haystack.substring(index, index + length2).equals(needle)){
                return index;
            }
            index ++;
        }
        return -1;
    }
}