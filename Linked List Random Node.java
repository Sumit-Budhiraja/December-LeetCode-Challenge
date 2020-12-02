class Solution {

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    int size;
    ListNode head;
    Random rn;
    public Solution(ListNode head) {
        ListNode temp = head;
        size = 1;
        rn = new Random();
        while(temp.next != null) {
            size++;
            temp = temp.next;
        }
        temp.next = head;
        this.head = head;
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        int toMove = rn.nextInt(size);
        while(toMove > 0) {
            toMove--;
            head = head.next;
        }
        return head.val;
    }
}