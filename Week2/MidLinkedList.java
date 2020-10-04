class Solution {
    public ListNode middleNode(ListNode head) {
        int linkedListCount=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            linkedListCount++;
        }
        int mid= linkedListCount/2;
        while(mid--!=0){
            head=head.next;
        }
        return head;
    }
}