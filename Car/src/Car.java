
public class Car {

	int totalCost;
	public Engine engine;
	public Chasis chasis;

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public int getTotalCost() {
		totalCost=calculateCost();
		return totalCost;
	}

	public Car(Engine engine, Chasis chasis) {
		super();
		this.engine = engine;
		this.chasis=chasis;
	}

	public Chasis getChasis() {
		return chasis;
	}

	public void setChasis(Chasis chasis) {
		this.chasis = chasis;
	}

	public Engine getEngine() {
		return engine;
	}

	public int calculateCost()
	{
		return (chasis.getChasisCost()+engine.getEngineCost());
		
	}
	
}
