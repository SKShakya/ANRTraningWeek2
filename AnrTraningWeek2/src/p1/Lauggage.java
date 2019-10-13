package p1;

public class Lauggage {
	double length;
	double width;
	double hieght;
	double checkedwidth;
	double linearDimensions ;
	double carryOnBage;
	double checkedBageweight;
	public Lauggage(double length,double width,double hieght, double carryOnBage,double checkedBageweight) {
		
		this.length = length;
		this.width = width;
		this.hieght =hieght;
		this.checkedwidth=checkedwidth;
		this.linearDimensions =length+width+hieght;
		isAllGood(hieght, carryOnBage, checkedBageweight);
	
	}
	//public Lauggage(){
		//System.out.println("*****Lauggage******");
	//}
	public void isAllGood(double linearDimensions,double carryOnBage ,double checkedBageweight ){
		if(isCarryOnLuageGood(carryOnBage)&&isCheckedLuageGood(checkedBageweight)&&isDimensionsGood(linearDimensions))
			System.out.println(" You can Trable");
		else 
			System.out.println("You can not trable");
		
	}
	public static boolean isCheckedLuageGood(double carryOnBage){
		if(carryOnBage<=20.0)
			return true;
		else
			return false;
			
		
	}
	public static boolean isCarryOnLuageGood(double carryOnLuage){
		if(carryOnLuage<=7.0)
			return true;
		else
			return false;
		
	}
	public static boolean isDimensionsGood(double dimension){
		if(dimension<=115)
			return true;
		else 
			return false;
	
			
		
	}

}
