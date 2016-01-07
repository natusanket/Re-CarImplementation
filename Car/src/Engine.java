
public class Engine {

	public Filter filter;
	public Carborator carborator;
	
	String engNum;

	public Engine(Filter filter, Carborator carborator, String engNum) {
		super();
		this.filter = filter;
		this.carborator = carborator;
		this.engNum = engNum;
	}
	
	public int getEngineCost(){
		return (filter.getCost()+carborator.getCost());
		
	}
}
