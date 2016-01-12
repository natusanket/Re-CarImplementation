
public class ecomMain {

	public static void main(String[] args) {
		
		Item it=new Item("Abxc", 500);
		ecomSitePayment e=new ecomSitePayment();
		e.choosePayment("CC");
		e.makePayment(it.getCost());
	}

}
