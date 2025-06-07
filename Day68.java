// Day 68 - Reverse a linked list in groups

class Solution {
    public static Node reverseKGroup(Node head, int k) {
        if(head == null || k==1) return head;
        Node curr = head;
        int count = 0;
        
        while(curr != null && count < k){
            curr = curr.next;
            count++;
        }
        if(count > 0){
            Node prev = null, next = null;
            curr = head;
            int temp = 0;
            
            while(curr != null && temp <  count){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                temp++;
            }
            head.next = reverseKGroup(curr, k);
            return prev;
        }
        return head;
    }
}