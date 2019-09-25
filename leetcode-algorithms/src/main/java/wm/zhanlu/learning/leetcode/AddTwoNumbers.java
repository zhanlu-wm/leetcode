package wm.zhanlu.learning.leetcode;

/**
 *
 * @author wangming
 *
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int tmp = l1.val + l2.val;
        int curr = tmp % 10;
        int next = tmp / 10;
        ListNode result = new ListNode(curr);
        ListNode currNode = result;
        while (next > 0 || l1.next != null || l2.next != null) {
            tmp = next;
            if (l1.next != null) {
                l1 = l1.next;
                tmp += l1.val;
            }
            if (l2.next != null) {
                l2 = l2.next;
                tmp += l2.val;
            }
            curr = tmp % 10;
            next = tmp / 10;
            ListNode nextNode = new ListNode(curr);
            currNode.next = nextNode;
            currNode = nextNode;
        }
        return result;
    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


}
