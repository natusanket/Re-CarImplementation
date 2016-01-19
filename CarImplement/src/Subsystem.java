import java.util.ArrayList;


public class Subsystem implements CarInterface {

	int price=0;
	
	ArrayList<CarInterface> subsys= new ArrayList<CarInterface>();
	
	
	@Override
	public int getPrice() {
		
		for(CarInterface i:subsys)
			price=price+i.getPrice();
		
		return price;
	}
	
	public void addItem(CarInterface c)
	{
		subsys.add(c);
	}

}
