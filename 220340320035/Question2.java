/*Q2:Reverse a Linked List Given the pointer to the head node of a linked list, 
change the next pointers of the nodes so that their order is reversed.
 The head pointer given may be null meaning that the initial list is empty.
 Example head references the list 1->2->3->NULL Manipulate the next pointers of each node in place and return head, 
 now referencing the head of the list. 3->2->1->NULL.
 */
 
 
 import java.util.Scanner;
 
 class LinkedList
 {
	 static class Node
	 {
		 int data;
		 Node next;
		 Node prev;
		 
		 Node(int data)
		 {
			 this.data=data;
			 this.next=null;
		 }
		 
	 }
	 Node head=null;
	 Node tail=null;
	 
	 public void creation()
	 {
		System.out.println("Enter Data");
		int data;
		 int n;
		 Scanner sc= new Scanner(System.in);
		 
		 do
		 {
			 data=sc.nextInt();
			 Node new_node= new Node(data);
			 
			 if(head==null)
			 {
				 head=new_node;
				 tail=new_node;
				 
			 }
			 else
			 {
				 new_node.next=head;
				 head.prev= new_node;
				 head=new_node;
			 }
			 System.out.println("Do you want to add more data Press --> 1");
			 n=sc.nextInt();
		 }
		 while(n == 1);
	 }
	 
	 public void display()
	 {
		 Node temp=head;
		 if(head==null)
		 {
			 System.out.println("LinkedList not existed");
		 }
		 else
		 {
			 while(temp!=null)
			 {
				 System.out.print(temp.data);
				 temp=temp.next;
			 }
		 }
	 }
	 
	 public void display1()
	 {
		 Node head= tail;
		 Node temp1= head;
		 if(head==null)
		 {
			 System.out.println("LinkedList not existed");
		 }
		 else{
			 while(temp1!=null)
			 {
				 System.out.print(temp1.data);
				 temp1=temp1.prev;
			 }
		 }
	 }
 }
 
 
 class LL
 {
	 public static void main(String...args)
	 {
		 LinkedList l1= new LinkedList();
		 
		 l1.creation();
		 System.out.println("Normal Order------>");
		 l1.display();
		 System.out.println();
		 System.out.println("Reverse Order------>");
		 l1.display1();
	 }
 }