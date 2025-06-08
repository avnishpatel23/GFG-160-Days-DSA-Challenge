// Add Number Linked Lists

class Solution {
    static Node addTwoLists(Node num1, Node num2) {
        num1 = reverse(num1);
        num2 = reverse(num2);
        
        Node dummy = new Node(-1);
        Node curr = dummy;
        int carry = 0;
        while(num1!=null || num2!=null || carry!=0){
            int sum = carry;
            if(num1!=null){
                sum+=num1.data;
                num1= num1.next;
            }
            if(num2!=null){
                sum+=num2.data;
                num2= num2.next;
            }
            carry = sum/10;
            curr.next = new Node (sum%10);
            curr = curr.next;
        }
        Node result = reverse (dummy.next);
        while(result!=null && result.data==0){
            result = result.next;
        }
        return result == null ? new Node(0) : result;
    }
    private static Node reverse (Node head){
        Node prev = null;
        while(head!=null){
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}