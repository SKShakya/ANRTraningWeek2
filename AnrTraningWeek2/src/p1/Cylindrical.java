package p1;

public class Cylindrical {
	public Cylindrical(){
		System.out.println("*****Cylindrical Hight and Volume*******");
	}
	public void getHightAndCost(double r,double v){
		double hight =(double)v/Math.PI*Math.pow(r,2);
		System.out.println("Hight is "+hight);
		double cost =(double)2*Math.PI*r*(r + hight);
		System.out.println("Cost is :"+cost);
	}
	

}
