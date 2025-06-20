// Rotate a Linked List

class Solution {
    public Node rotate(Node head, int k) {
        Node temp = head;
        int length = 1;
        while(temp.next != null){
            temp = temp.next;
            length++;
        }
        k = k % length;
        if(k == 0) return head;
        temp.next = head;
        temp = head;
        Node prev = null;
        for(int i = 0; i < k; i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return temp;
    }
}