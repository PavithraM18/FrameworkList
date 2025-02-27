package leetCode;

public class MergeTwoSortedList {

	public static void main(String[] args) {
		 
		 int[] values_1 = {1, 2, 4};
		 int[] values_2 = {3, 6, 8};
		 ListNode list1 = createLinkedList(values_1);
	     ListNode list2 = createLinkedList(values_2);
	        // Print list values
	      mergeTwoLists(list1, list2);
	      
	}
    public static ListNode createLinkedList(int[] values) {
    	 if (values.length == 0) return null;
         
         ListNode head = new ListNode(values[0]);
         ListNode current = head;
         
         for (int i = 1; i < values.length; i++) {
             current.next = new ListNode(values[i]);
             current = current.next;
         }
         
         return head;
	}
	public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) 
        { 
        	this.val = val; 
        	}
        
    }
    public static  ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    	  // Create a dummy node
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Iterate through both lists
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2  = list2.next;
            }
            current = current.next;
        }

        // Append     remaining nodes from list1 or list2
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // The merged list is next to the dummy node
         ListNode output = dummy.next;
     
         while (output != null) {
             System.out.print(output.val + " ");
             output = output.next;
         }
         System.out.println();
         return output;
      }

    
}
