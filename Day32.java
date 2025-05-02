// K-th element of two Arrays

class Solution {
    public int kthElement(int a[], int b[], int k) {
        int n1 = a.length;
        int n2 = b.length;
        int[] l = new int[n1+n2];
        int i=0, j=0, p=0;
        while(i<n1){
            l[p++] = a[i++];
        }
        while(j<n2){
            l[p++] = b[j++];
        }
        Arrays.sort(l);
        return l[k-1];
    }
}