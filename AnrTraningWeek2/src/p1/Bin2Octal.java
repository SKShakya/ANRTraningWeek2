package p1;

public class Bin2Octal {
	public Bin2Octal() {
		System.out.println("*******Bin2Octal********");
	}
	public void bin2Octal( long binery){
		int octalNum =0,i =0,desimalNum =0;
		while(binery!=0){
			desimalNum +=(binery%10)*Math.pow(2, i);
			i++;
			binery = binery/10;
		}
		System.out.println("Desimal:"+desimalNum);
		while(desimalNum !=0){
			octalNum +=(desimalNum%8)*i;
			desimalNum = desimalNum/10;
			i =i*10;
			
		}
		System.out.println("Octal "+octalNum);
		
		
	}

}
