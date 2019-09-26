package wm.zhanlu.learning.leetcode;

/**
 *21. 合并两个有序链表
 *
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author wangming
 */
public class MergeTwoLists {

    /**
     * 迭代法实现一
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        int val1 = l1.val;
        int val2 = l2.val;
        ListNode next1 = l1.next;
        ListNode next2 = l2.next;
        ListNode result = val1 <= val2 ? l1 : l2;
        ListNode currNode = result;
        l1 = val1 <= val2 ? next1 : l1;
        l2 = val1 <= val2 ? l2 : next2;
        while (l1 != null && l2 != null) {
            val1 = l1.val;
            val2 = l2.val;
            next1 = l1.next;
            next2 = l2.next;
            ListNode nextNode = val1 <= val2 ? l1 : l2;
            currNode.next = nextNode;
            currNode = nextNode;
            l1 = val1 <= val2 ? next1 : l1;
            l2 = val1 <= val2 ? l2 : next2;
        }
        if (l1 != null) {
            currNode.next = l1;
        }
        if (l2 != null) {
            currNode.next = l2;
        }

        return result;
    }

    /**
     * 迭代法实现二
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(-1);
        ListNode currNode = preHead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                currNode.next = l1;
                l1 = l1.next;
            } else {
                currNode.next = l2;
                l2 = l2.next;
            }
            currNode = currNode.next;
        }
        currNode.next = l1 == null ? l2 : l1;

        return preHead.next;
    }

    /**
     * 递归法实现
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists3(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists3(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists3(l1, l2.next);
            return l2;
        }
    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
