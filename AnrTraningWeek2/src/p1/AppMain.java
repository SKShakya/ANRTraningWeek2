package p1;
import java.io.File;
import java.util.*;
public class AppMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Enter the length, width,hight,carry on weight,checked bage weight");
		double l = sc.nextDouble();
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		double carryWeight =sc.nextDouble();
		double checkedWeight = sc.nextDouble();
		Lauggage lauggage = new Lauggage(l,w,h,carryWeight,checkedWeight);*/
		
		
		/*try{
		sc = new Scanner(new File("in.txt"));
		}
		catch(Exception e){}
		FileScanner fileScanner = new FileScanner(sc);*/
		 
		
		/*Cylindrical cylindrical = new Cylindrical();
		//System.out.println("Enter the radious ,Volume ");
		double r = sc.nextDouble();
		double v = sc.nextDouble();
		cylindrical.getHightAndCost(r, v);*/
		
		
		/*ReverseStringAndCountVoiwel reverseString = new ReverseStringAndCountVoiwel();
		System.out.println("Enter the string");
		String str = sc.next();
		String rev =reverseString.reverse(str);
		System.out.println(rev);
		reverseString.vowele(str);
		reverseString.consonantsWorld( str);*/
		
		
		/*TestPalindromicWord palindromicWord = new TestPalindromicWord();
		System.out.println("Enter the String ");
		String ss =sc.nextLine();
		palindromicWord.testPalindrom(ss);*/
		/*GuessFiveDigitSecretCode game = new GuessFiveDigitSecretCode();
		game.runGame();*/
		
		/*Bin2Octal bin =new Bin2Octal();
		System.out.println("Enter the binery Number ");
		long ss = sc.nextLong();
		bin.bin2Octal(ss);*/
		
		/*A_InMyName nameString = new A_InMyName();
		System.out.println(" Enter  your name");
		String name = sc.nextLine();
		nameString.findAInName(name);*/
		
		Hex2Dec hex2Dec = new Hex2Dec();
		System.out.println("Enter the hexa number ");
		String str = sc.next();
		hex2Dec.findHex2Dec(str);
		
		
		
	}
	

}
