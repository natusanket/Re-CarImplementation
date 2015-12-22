
public class Queue_Array {

	int capacity,front,rear;
	int array[];
	
	
		public boolean enqueue(int element)
		{
			 if (rear <= capacity - 1) {  
				 array[rear]=element;
				   return true;
			 }
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
			
		}
		
		public boolean isFull(){
			if(rear==(capacity-1))
			{
				return true;
			}
			return false;
		}

		public int getCapacity() {
			return capacity;
		}

		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		
		public void display()
		{
			
		}
	
}
