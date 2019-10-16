package Utility;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class LinkedList{
    void insertNode(){
     Node start;
    Node n1=new Node(10);
    Node n2=new Node(20);
    Node n3=new Node(50);
    Node n4=new Node(90);
    Node n5=new Node(180);
    start=n1;
    n1.next=n2;
    n2.next=n3;
    n3.next=n4;
    n4.next=n5;
    n5.next=n2;
    System.out.println(start);
    System.out.println(n1.next);
    System.out.println(n2.next);
    System.out.println(n3.next);
    System.out.println(n4.next);
    System.out.println(n5.next);
    System.out.println("************************************");
   detectLoop(start);
}

    	


void detectLoop(Node start){
    Node slow=start;
    Node fast=start;
    Node temp=start;
    while(slow!=null&&fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            System.out.println("loop detected");
            System.out.println("**********************************");
            System.out.println(slow);
            System.out.println(fast);
            //slow.next=null;
            detectStartOfLoop(temp,slow);  
            break;
            
        }
        
      
        
      
    }
   

}
void detectStartOfLoop(Node n1,Node n2) {
	Node temp=n1;
	Node temp1=n2;
	while(temp!=temp1) {
		temp=temp.next;
		temp1=temp1.next;
		
		System.out.println("********************");
		System.out.println("This is Starting point of Loop");
		System.out.println(temp);
		System.out.println(temp1);
		removeLoop(temp,temp1);
		break;
	}
	
}
void removeLoop(Node temp,Node temp1) {
	while(temp!=temp1.next) {
		temp1=temp1.next;
	}
	System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	System.out.println(temp1);
	temp1.next=null;
	System.out.println(temp1.next);
}

}



public class Linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList obj=new LinkedList();
       obj.insertNode();
	}

}
