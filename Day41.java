// Set Matrix Zeroes

class Solution {
    public void setMatrixZeroes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        boolean l[]=new boolean[n];
        boolean h[]=new boolean[m];
        for (int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j]==0){
                    l[i]=true;
                    h[j]=true;
                }
            }
        }
        for (int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(l[i]||h[j]){
                    mat[i][j]=0;
                }
            }
        }
    }
}