// Day 30 - Search in a Sorted and Rotated Array


class Solution {
    int search(int[] arr, int key) {
        ArrayList<Integer> list = new ArrayList<> ();
        for(int i : arr)
        list.add(i);
        return list.indexOf(key);
    }
}
