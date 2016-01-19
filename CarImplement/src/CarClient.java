
public class CarClient {

	public static void main(String[] args) {
		
		Subsystem car= new Subsystem();
		
		
		Subsystem engine= new Subsystem();
		CarInterface filter=new Parts(500);
		CarInterface carborator=new Parts(300);
		
		engine.addItem(filter);
		engine.addItem(carborator);
		car.addItem(engine);
		
		Subsystem chasis= new Subsystem();
		CarInterface bumper=new Parts(200);
		CarInterface dash=new Parts(100);
		chasis.addItem(bumper);
		chasis.addItem(dash);
		car.addItem(chasis);
		
		System.out.println(car.getPrice());

	}

}
