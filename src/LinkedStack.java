
public class LinkedStack {
	
	private Node top=null;
	
	private class Node{
		int data;
		Node next;
		public Node(int data){
			this.data=data;
		}
	}
	
	public boolean isEmpty(){
		return top==null;
	}
    
	public void push(int data){
		Node temp=new Node(data);
		temp.next=top;
		top=temp;
	}
	
	public int pop(){
		if(isEmpty()){
			return 0;
		}
		Node temp=top;
		top=top.next;
		return temp.data;
	}
	
	public void printStack(){
		Node temp=top;
		while(temp!=null){
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedStack l=new LinkedStack();
		l.push(1);
		l.push(2);
		l.push(3);
		l.push(4);
		l.push(5);
		l.printStack();
		l.pop();
		l.printStack();
	}

}
