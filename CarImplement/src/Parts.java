
public class Parts implements CarInterface {

	int p;
	
	public Parts(int price) {
		super();
		this.p = price;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return p;
	}

}
