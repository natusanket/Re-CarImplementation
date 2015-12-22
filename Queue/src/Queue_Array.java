
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

		public int dequeue()
		{
			if(front==0)
				System.out.println("sdad");
				
			else
			{
				front++;
				int newele=array[front];
				if(front==rear)
				{
					front=0;
					rear=0;
				}
				else
					front++;
				
				return newele;
			}
			return capacity;
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
