package p1;
import java.io.*;
import java.util.Scanner;
public class FileScanner {
	public FileScanner(Scanner sc){
		System.out.println("*****FileScanner******");
		sumAndAvgOfFile(sc);
	}

	public void sumAndAvgOfFile(Scanner sccc){
		try{
		double sequerSum =0.0;
		int sum =0,count =0;
		double avg =0.0;
		while(sccc.hasNext()){
			String i = sccc.next();
			int z =Integer.parseInt(i);
			System.out.println(z);
			sequerSum +=Math.pow(z, 2);
			sum +=z;
			count++;
		}
		System.out.println("SumOfSquear :"+sequerSum);
		System.out.println("Sum of Numbers  :"+sum);
		System.out.println("Total numbers in file :"+count);
		System.out.println("Average of Number :"+sum/count);

		}
		catch(Exception e){
			
		}
		
	}
	

}
