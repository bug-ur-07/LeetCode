/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        Map<Integer , Integer > map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int minval = -1;
        int c = 1;
        int first = -1;
        int last = -1;

        int i=0;

        ListNode prev = head;
        ListNode cur = head.next;
        ListNode nextEle = head.next.next;

        if(prev == null || cur == null || nextEle == null) return new int[]{-1,-1};

        while(cur !=null && nextEle !=null){
            
            if((cur.val > nextEle.val && cur.val > prev.val) || (cur.val<nextEle.val && cur.val< prev.val)){
                map.put(i++ , c);
                if (first == -1) {
                    first = c;
                } 
                // Every critical point after the first
                else {
                    min = Math.min(min, c - last);
                }

                // Current critical point becomes the latest one
                last = c;

            }
            c++;
            prev = prev.next;
            cur = cur.next;
            nextEle = nextEle.next;
        }
        if (first == last)
                    return new int[]{-1, -1};

                int max = last - first;

                return new int[]{min, max};

    }
}