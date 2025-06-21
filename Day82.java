// Diameter of a Binary Tree


class Solution {
    int md = 0;
    int diameter(Node root) {
        height(root);
        return md;
    }
    int height (Node node){
        if(node == null){
            return -1;
        }
        int l = height(node.left);
        int r = height(node.right);
        md = Math.max(md, l+r+2);
        return Math.max(l,r)+1;
    }
}