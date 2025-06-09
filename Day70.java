// Day 70 - Clone a Linked List

class Solution {
    public Node cloneLinkedList(Node head) {
        if (head == null){
            return null;
        }
        Node curr = head;
        while(curr != null){
            Node next = curr.next;
            Node copy = new Node(curr.data);
            curr.next = copy;
            copy.next = next;
            curr = next;
        }
        curr = head;
        while(curr != null){
            if(curr.random != null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        curr = head;
        Node dummy = new Node(0);
        Node copyCurr = dummy;
        while(curr != null){
            Node front = curr.next.next;
            copyCurr.next = curr.next;
            copyCurr = copyCurr.next;
            curr.next = front;
            curr = front;
        }
        return dummy.next;
    }
}
