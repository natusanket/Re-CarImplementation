import java.util.ArrayList;


public class Queue_AList extends Queue_methods {

	int capacity,front,rear;
	int array[];
	
	ArrayList a=new ArrayList<>(10);
	
		public boolean enqueue(int element)
		{
			a.add(10);
			
			return false;
			
		}
		
		public Queue_AList(int capacity) {
			super();
			this.front=0;
			this.rear=0;
			this.capacity = capacity;
			this.array= new int [capacity]; 
		}

		public void dequeue()
		{
			if(a.isEmpty())
			{
				System.out.println("Queue Empty");
			}
			else
			{
				a.remove(1);
			}
			
			
		}
		

		public int getCapacity() {
			return capacity;
		}

		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		
		public void display()
		{
			System.out.println("Elements in the queue are");
			
				
				System.out.print(" "+a);
			
		}
	
}
