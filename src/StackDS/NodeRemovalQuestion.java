package StackDS;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
public class NodeRemovalQuestion {
    public ListNode removeNodes(ListNode head) {

        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;

        // Step 1: Traverse and maintain decreasing stack
        while (temp != null) {
            while (!st.isEmpty() && st.peek().val < temp.val) {
                st.pop();
            }
            st.push(temp);
            temp = temp.next;
        }
        // Step 2: Rebuild list
        ListNode newHead = null;

        while (!st.isEmpty()) {
            ListNode node = st.pop();
            node.next = newHead;
            newHead = node;
        }

        return newHead;
    }


}

// Time complexitu O(n)