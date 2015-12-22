
public class Queue_Main {

	public static void main(String[] args) {
		
			Queue_Array arr=new Queue_Array(5);
		
			arr.enqueue(2);
			
			arr.enqueue(15);
			
			arr.enqueue(30);
			arr.display();
			arr.dequeue();
			
			arr.enqueue(40);
			arr.enqueue(50);
			arr.enqueue(60);
			
			arr.display();
			
			
			
			arr.display();
	}

}
