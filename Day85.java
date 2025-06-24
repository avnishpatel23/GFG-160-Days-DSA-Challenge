// Inorder Traversal


class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> res = new ArrayList<>();
        find(root, res);
        return res;
    }
    private void find(Node root, ArrayList<Integer> res){
        if(root==null)
        return;
        find(root.left, res);
        res.add(root.data);
        find(root.right, res);
    } 
}
