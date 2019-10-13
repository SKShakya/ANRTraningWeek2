package p1;

public class Hex2Dec {
	public  Hex2Dec(){
		System.out.println("******Hex2Dec******");
	}
	public void findHex2Dec(String hexa){
		double dec =0;
		char []c =hexa.toLowerCase().toCharArray();
		for(int i =hexa.length()-1;i>=0;i--){
		//for(int i =0;i<hexa.length();i++){
			if(Character.isAlphabetic(c[i])){
				int a =getNumericValue(c[i]);
				dec +=a*Math.pow(16, i);
			}
			else{
				System.out.println(Character.getNumericValue(c[i])+" "+i);
				dec +=Character.getNumericValue(c[i])*Math.pow(16, i);
			}	
		}
		
		System.out.println("Decimal "+(int)dec);
	}
	public int getNumericValue(char c){
		int z =10;
		switch(c){
		case 'a':
			return z +=0;
		case 'b':
			return z +=1;
		case 'c':
			return z +=2;
		case 'd':
			return z +=3;
		case 'e':
			return z +=4;
		case 'f':
			return z +=5;
		}
		return z;
		
	}

}
