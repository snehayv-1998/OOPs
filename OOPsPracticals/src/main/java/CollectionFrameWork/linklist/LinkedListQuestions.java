package CollectionFrameWork.linklist;

import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListQuestions {
    public static void main(String[] args) {
        //linked list using recursion
        {
        /*
        Remove duplicate element in linked list
        input: 1->1->2->3->3->3
        output: 1->2->3
         */
            LinkedList<Integer> duplicate = new LinkedList<>();
            duplicate.add(1);
            duplicate.add(1);
            duplicate.add(2);
            duplicate.add(3);
            duplicate.add(3);
            duplicate.add(4);
            duplicate.add(3);
            duplicate.add(4);

            System.out.println("\n\nBefore removing duplicates : "+duplicate);
            System.out.println("After removing duplicates : "+removeDuplicatesWithBuiltIn(duplicate));
        }
        {
            /**
             * Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
             * Return the linked list sorted as well.
             * Definition for singly-linked list.
             * public class ListNode {
             *     int val;
             *     ListNode next;
             *     ListNode() {}
             *     ListNode(int val) { this.val = val; }
             *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
             * }
             */

            ListNode node3 = new ListNode(3,new ListNode(3));
            ListNode node2 = new ListNode(2,node3);
            ListNode node1 = new ListNode(1,node2);
            ListNode head = new ListNode(1);
            head.next=node1;
            System.out.println("\n\nBefore removing duplicates : ");
            display(head);
            System.out.println("After removing duplicates : ");
            display(deleteDuplicates(head));
        }
    }

    private static LinkedList<Integer> removeDuplicatesWithBuiltIn(LinkedList<Integer> duplicate) {
        HashSet<Integer> set = new HashSet<>();
        for (int i =0;i<duplicate.size();i++){
            if(set.contains(duplicate.get(i))){
                duplicate.remove(i);
                i--;
            }else {
                set.add(duplicate.get(i));
            }
        }
        return duplicate;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}

    }
    public static ListNode deleteDuplicates(ListNode current) {
        if(current == null)return null;
        ListNode head = current;
        while(current.next != null){
            if(current.val == current.next.val){
                current.next =current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;
    }
    static void display(ListNode head){
        if(head == null) System.out.println("");
        ListNode cur = head;
        while(cur != null){
            System.out.print(cur.val+"->");
            cur = cur.next;
        }
        System.out.println("END");
    }
}
