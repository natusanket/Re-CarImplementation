
public class CarMain {

	public static void main(String[] args) {
		
		
		
		
		Filter f=new Filter(500);
		Carborator c=new Carborator(1000);
		Dashboard db=new Dashboard(5000);
		Bumper b=new Bumper(4000);
		
		Chasis ch=new Chasis(db, b, "CH1414");
		Engine engine=new Engine(f, c, "E1414");
		
		Car myCar=new Car(engine,ch);
		System.out.println("Total Cost = "+myCar.getTotalCost());;

	}
}
