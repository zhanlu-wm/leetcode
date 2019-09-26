package wm.zhanlu.learning.leetcode;

/**
 * 206. 反转链表
 *
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author wangming
 */
public class ReverseLinkedList {


    /**
     * 递归法二
     * 当前链表的翻转结果，等于将首节点追加到后续子链表的翻转结果的尾部后的结果
     * 注意点：1. 如果更高效的将当前首节点追加到后续子链表的翻转结果的尾部；2. 保证尾部新追加的尾部节点始终指向null
     * @param head
     * @return
     */
    public ListNode reverseList3(ListNode head) {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        } else {
            ListNode newHead = reverseList2(head.next);
            // 当前节点指向的下一个节点，就是后续子链表翻转后的尾部节点
            head.next.next = head;
            head.next = null;
            return newHead;
        }
    }

    /**
     * 递归法一
     * 当前链表的翻转结果，等于将首节点追加到后续子链表的翻转结果的尾部后的结果
     * 注意点：1. 如果更高效的将当前首节点追加到后续子链表的翻转结果的尾部；2. 保证尾部新追加的尾部节点始终指向null
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        } else {
            ListNode newHead = reverseList2(head.next);
            head.next = null;
            // 通过遍历的方式拿到新的尾部节点
            ListNode newTail = newHead;
            while (newTail.next != null) {
                newTail = newTail.next;
            }
            newTail.next = head;
            return newHead;
        }
    }

    /**
     * 迭代法
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        ListNode newNextNode = null;
        ListNode currNode = head;
        while (head != null) {
            head = head.next;
            currNode.next = newNextNode;
            newNextNode = currNode;
            currNode = head;
        }
        return newNextNode;

    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
