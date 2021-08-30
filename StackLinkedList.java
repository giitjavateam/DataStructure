package ds.practice.linkedlist;

import java.util.Scanner;

public class StackLinkedList {
	
	StackNode root;
	 
    private static class StackNode {
        
    	int data;
        StackNode next;
 
        StackNode(int data) 
        { 
        	this.data = data; 
        	this.next = null;
        }
    }
 
    public boolean isEmpty()
    {
        if (root == null)
            return true;
       
        else
            return false;
    }
 
    public void push(int data)
    {
        StackNode newNode = new StackNode(data);
 
        if (root == null) {
            root = newNode;
        }
        else {
        	newNode.next=root;
        	root= newNode;
            
        }
        System.out.println(data + " pushed to stack");
    }
 
    public int pop()
    {
        int popped = Integer.MIN_VALUE;
        if (root == null) {
            System.out.println("Stack is Empty");
        }
        else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    }
 
    public int peek()
    {
        if (root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else {
            return root.data;
        }
    }
 
    // Driver code
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	
        StackLinkedList s = new StackLinkedList();
        int f = 1;
        while(f==1) {
        	System.out.println("Enter you choice : \n 1.Push \n 2.Pop \n 3.Peek");
        	int ch = sc.nextInt();
        	switch(ch) {
        		
        	case 1 : System.out.println("Enter data to be pushed");
        			 int n = sc.nextInt();
        			 s.push(n);
        			 break;
        	case 2 : System.out.println(s.pop() + " popped from stack"); break;
        	case 3 : System.out.println("Top element is " + s.peek());
        	default :System.out.println("Enter a valid choice");
        	}
        	System.out.println("Enter 1 to choose again or 0 to exit!");
        	f = sc.nextInt();
        }          
    }
}
