// Construct Tree from Inorder & Preorder


class Solution {
    private static int preIdx;
    private static HashMap<Integer, Integer> idxMap;
    public static Node buildTree(int inorder[], int preorder[]) {
        int n = inorder.length;
        preIdx = 0;
        idxMap = new HashMap<>(n);
        for(int i = 0; i<n; i++)
        idxMap.put(inorder[i], i);
         return build(preorder, 0, n-1);
    }
    private static Node build(int[] preorder, int l, int r){
        if(l>r) return null;
        
        int rootVal = preorder[preIdx++];
        Node root = new Node(rootVal);
        
        int mid = idxMap.get(rootVal);
        root.left = build(preorder, l, mid-1);
        root.right = build(preorder, mid+1, r);
        
        return root;
    }
}