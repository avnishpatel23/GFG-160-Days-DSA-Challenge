// Intersection of Two arrays with Duplicate Elements


class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        HashSet<Integer> A = new HashSet<>();
        for(int num : a){
            A.add(num);
        }
        HashSet<Integer> result = new HashSet<>();
        for(int num : b){
            if(A.contains(num)){
                result.add(num);
                A.remove(num);
            }
        }
        return new ArrayList<>(result);
    }
}
