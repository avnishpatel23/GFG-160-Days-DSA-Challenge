//  Find All Triplets with Zero Sum

class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> m = new HashMap<>();
        
        for(int i = 0; i<n; i++){
            m.putIfAbsent(arr[i], new ArrayList<Integer>());
            m.get(arr[i]).add(i);
        }
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                int rem=0 -(arr[i] + arr[j]);
                if(m.get(rem)!=null){
                    int size = m.get(rem).size();
                    for(int k = size-1; k>=0; k--){
                        if(m.get(rem).get(k)<= j) break;
                        ans.add(new ArrayList<> (List.of(i, j, m.get(rem).get(k))));
                    }
                }
            }
        }
        Collections.sort(ans,(o1,o2) -> Integer.compare(o1.get(2), o2.get(2)));
        return ans;
    }
}