
public class ResizeableArrayStack {
	private int top=0;
	private int capacity;
	private int stack[];
	
	public boolean isEmpty(){
		return top==0;
	}
	
	public int getCapacity(){
		return capacity;
	}
	public ResizeableArrayStack(int cap){
		capacity=cap;
		stack=new int[capacity];
	}
	
	public void push(int data){
		if(top<capacity-1){
			stack[++top]=data;
		}
		else{
			capacity=capacity*2;
			int[] stack1=stack;
			int i=0;
			stack=new int[capacity];
			while(i<capacity/2){
				stack[i]=stack1[i];
				i++;
			}
			stack[i]=data;
			top=i;
		}
	}
	
	public int pop(){
		if(isEmpty()){
			return 0;
		}
		int item=stack[top--];
		if(top<(capacity/4)){
			int[] stack2=stack;
			capacity=capacity/2;
		    int i=0;
		    stack=new int[capacity];
		    while(i<capacity/2){
		    	stack[i]=stack2[i];
		    	i++;
		    }
		    
		}
		return item;
	}
	
	public void printStack(){
		int i=0;
		while(i<=top){
			System.out.println(stack[i++]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResizeableArrayStack r=new ResizeableArrayStack(20);
		r.push(1);
		r.push(2);
		r.push(3);
		r.push(4);
		r.push(5);
		r.push(6);
		r.push(1);
		r.push(2);
		r.push(3);
		r.push(4);
		r.push(5);
		r.push(6);
		r.push(1);
		r.push(2);
		r.push(3);
		r.push(4);
		r.push(5);
		r.push(6);
		r.push(1);
		System.out.println(r.getCapacity());
		r.push(2);
		System.out.println(r.getCapacity());
		r.pop();
		r.pop();
		r.pop();
		r.pop();
		r.pop();
		r.pop();
		r.pop();
		r.pop();
		r.pop();
		r.pop();
		r.pop();
		r.pop();
		r.pop();
		r.pop();
		System.out.println(r.getCapacity());
		r.pop();
		
		r.pop();
		System.out.println(r.getCapacity());
		
		
	}

}
