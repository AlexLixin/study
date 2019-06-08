import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* -----------------------------------
 *  WARNING:
 * -----------------------------------
 *  Your code may fail to compile
 *  because it contains public class
 *  declarations.
 *  To fix this, please remove the
 *  "public" keyword from your class
 *  declarations.
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = result;
        //1. every node add to each other.
        while (true) {
            p.val = l1.val + l2.val;
            l1 = l1.next;
            l2 = l2.next;
            if (l2 == null && l1 == null) {
                break;
            }
            if (l2 == null && l1 != null) {
                p.next = l1;
                break;
            }
            if (null == l1 && null != l2) {
                p.next = l2;
                break;
            }
            p.next = new ListNode(0);
            p = p.next;
        }
        System.out.println(MainClass.listNodeToString(result));

        //2. carry bit
        boolean needCarry = false;
        p = result;
        int i;
        while (null != p) {
            i = p.val / 10;
            if (i > 0) {
                p.val %= 10;
                needCarry = true;
            }
            if (needCarry && null == p.next) {
                p.next = new ListNode(i);
                break;
            }
            if (needCarry && null != p.next) {
                p=p.next;
                p.val += i;
                needCarry = false;
                continue;
            }
            p = p.next;
        }

        return result;
    }
}

public class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for (int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);

        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for (int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }

    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }

        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            ListNode l1 = stringToListNode(line);
            line = in.readLine();
            ListNode l2 = stringToListNode(line);

            ListNode ret = new Solution().addTwoNumbers(l1, l2);

            String out = listNodeToString(ret);

            System.out.print(out);
        }
    }
}