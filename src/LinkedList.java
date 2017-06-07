class ListNode{
	private int data;
	private ListNode next=null;
	public ListNode(int data){
		this.data=data;
		
	}
	public void setdata(int data){
		this.data=data;
		
	}
	public int getdata(){
		return this.data;
	}
	public void setnext(ListNode next){
		this.next=next;
	}
	public ListNode getnext(){
		return this.next;
	}
}
public class LinkedList {
	private ListNode head=null;
	public int length =0;
	public void insertAtBeg(int x){
		ListNode temp =new ListNode(x);
		if(head==null){
			head=temp;
		}else{
		temp.setnext(head);
		head=temp;
		
		}
		length++;
	}
	
	public void insert(int position,int data){
		ListNode temp=head;
		ListNode temp2=new ListNode(data);
		if(position<1){
			position=1;
		}
		if(position>length){
			position=length;
		}
		if(position==1){
			temp2.setnext(head);
			head=temp2;
		}
		else{
			int i=1;
			while(i<position-1){
				temp=temp.getnext();
				i++;
			}
			temp2.setnext(temp.getnext());
			temp.setnext(temp2);
			
		}
		
		
	}
	
	
	
	
	public void printList(){
		ListNode temp=head;
		
		while(temp!=null){
			System.out.println(temp.getdata()+" ");
			temp=temp.getnext();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.insertAtBeg(1);
		l.insertAtBeg(2);
		l.insertAtBeg(3);
		l.insertAtBeg(4);
		l.insertAtBeg(5);
		l.insert(0, 9);
		l.printList();
		l.insert(3, 8);
		l.printList();

	}

}
