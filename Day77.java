// Day 77 - N Queens

class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int[] queens = new int[n];
        solve (0, n, queens, res);
        return res;
    }
    
    private void solve (int col, int n, int[] queens, ArrayList<ArrayList<Integer>> res){
        if(col == n){
            ArrayList<Integer> oneSol = new ArrayList<>();
            for(int i=0; i<n; i++){
                oneSol.add(queens[i] + 1);
            }
            res.add(oneSol);
            return;
        }
        for(int row=0; row<n; row++){
            if(isSafe(row, col, queens)){
                queens[col] = row;
                solve(col + 1, n, queens, res);
            }
        }
    
    }
        
    private boolean isSafe(int row, int col, int[] queens) {
        for(int i=0; i<col; i++){
            int qRow = queens[i];
            if(qRow == row || Math.abs(qRow- row) == Math.abs(i-col)){
                return false;
            }
        }
        return true;
    }
}