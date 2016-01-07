
public class Chasis {

	public Dashboard dashBoard;
	public Bumper bumper;
	String chasisNum;
	
	public Chasis(Dashboard dashBoard, Bumper bumper, String chasisNum) {
		super();
		this.dashBoard = dashBoard;
		this.bumper = bumper;
		this.chasisNum = chasisNum;
	}
	
	public int getChasisCost(){
		return (dashBoard.getCost()+bumper.getCost());
		
	}
}
