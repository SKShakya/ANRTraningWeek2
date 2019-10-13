package p1;

import java.util.Scanner;

public class GuessFiveDigitSecretCode {
	public static String code ="15321";
	public static int guess =0;
	public GuessFiveDigitSecretCode() {
		System.out.println("*********GuessFiveDigitSecreatCode********");
	}
	public void runGame(){
		
		while(10>guess++){
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the code");
			String userCode =sc.next();
			int sum =0,count=0;
			for(int i=0;i<userCode.length()-1;i++){
				if(userCode.charAt(i++)==code.charAt(i++)){
					sum +=userCode.charAt(i);
					count++;
				}
				if(count == userCode.length()){
					System.out.println("You Win");
					break;
				}
				else{
					//System.out.println("Sum"+sum);
					runGame();
					
				}
				
			}
			
		}
	}

}
