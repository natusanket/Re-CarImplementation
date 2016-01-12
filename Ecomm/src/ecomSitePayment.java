
public class ecomSitePayment {

		PayementMethod pm=null;
		Item e;
		
		public void choosePayment(String payment){
			if(payment=="CC")
			{
				pm=new CreditCard();
				System.out.println("credit card selected");
				pm.makePayment(e);
			}
			else if(payment=="DC")
			{
				pm=new DebitCard();
			}
			else if(payment=="COD")
			{
				pm=new COD();
			}
			else 
			{
				pm=new netBanking();
			}
		}

		public void makePayment(int cost) {
			pm.pay(cost);
			
		}
		
		
}
