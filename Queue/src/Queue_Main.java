

public class Queue_Main {

	public static void main(String[] args) {
		
			//Queue_Main main=new Queue_Array(5);
			Queue_methods m=new Queue_Array(10);
			Queue_methods aList=new Queue_AList(10);
			
			m.enqueue(10);
			m.enqueue(15);
			m.enqueue(20);
			m.display();
			m.dequeue();
			m.display();
			
			aList.enqueue(15);
			aList.enqueue(20);
			aList.display();
			aList.dequeue();
			aList.display();
			
			
			
	}

}
