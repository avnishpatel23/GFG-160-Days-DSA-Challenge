// Two Sum - Pair with Given Sum

class Solution {
    boolean twoSum(int arr[], int target) {
        HashSet<Integer> seen = new HashSet<>();
        
        for(int num : arr){
            int comp = target - num;
            if(seen.contains(comp)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}