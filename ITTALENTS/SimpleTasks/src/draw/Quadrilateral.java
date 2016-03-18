package draw;

public class Quadrilateral {
	protected double sideAB;
	protected double sideBC;
	protected double sideCD;
	protected double sideDA;
	
	protected double angleABC;
	protected double angleACD;
	protected double angleCDA;
	protected double angleDAB;
	
	protected double diagonalAC;
	protected double diagonalBD;
	
	public Quadrilateral( double sideAB,double sideBC,double sideCD,double sideDA, int angleABC){
		this.angleABC=angleABC;
		
		this.sideAB=sideAB;
		this.sideBC=sideBC;
		this.sideCD=sideCD;
		this.sideDA=sideDA;
		
		this.angleABC=angleABC;
		
		this.diagonalAC= Math.sqrt(Math.pow(sideAB,2)+Math.pow(sideBC,2)-2*sideAB*sideBC*Math.cos(Math.toRadians(angleABC)));
		
		this.angleCDA=Math.pow((sideCD*sideCD+sideDA*sideDA-diagonalAC*diagonalAC)/(sideCD*sideDA*diagonalAC), -1);
		
		double rightAngleCh=sideBC*Math.sin(Math.toRadians(angleABC));
		
		
		
	}

}
