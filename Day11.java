class Solution {
    // Function to find the maximum product subarray
    int maxProduct(int[] arr) {
        int maxProduct = arr[0];
        int currentProduct = arr[0];
        int minProduct = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                // Swap currentProduct and minProduct
                int temp = currentProduct;
                currentProduct = minProduct;
                minProduct = temp;
            }

            currentProduct = Math.max(arr[i], currentProduct * arr[i]);
            minProduct = Math.min(arr[i], minProduct * arr[i]);

            maxProduct = Math.max(maxProduct, currentProduct);
        }

        return maxProduct;
    }
}
