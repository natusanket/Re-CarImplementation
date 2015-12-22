
public class Queue_Array {

	int capacity,front,rear;
	int array[];
	
	
		public boolean enqueue(int element)
		{
			 if (rear <= capacity - 1) {  
				 
				 array[rear]=element;
				 rear++;
				   return true;
			 }
			 else
				 return false;
		}
		
		public Queue_Array(int capacity) {
			super();
			this.front=0;
			this.rear=0;
			this.capacity = capacity;
			this.array= new int [capacity]; 
		}

		public void dequeue()
		{
			
			
			if(front<rear)
			{
				front++;
				System.out.println("Element "+array[front-1]+" dequeued");
				
			}
			else
			{
				System.out.println("Underflow");
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
			for(int i=front;i<rear;i++)
			{
				
				System.out.print(" "+array[i]);
				
			}
			System.out.println();	
		}
	
}
