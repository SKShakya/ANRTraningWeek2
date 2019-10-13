package p1;

public class AInMyName {
	public AInMyName() {
		System.out.println("******StringObjectOfMyName******");
	}
	public void findAInName(String name){
		name.toLowerCase();
		int count =0;
		for(int i=0;i<name.length();i++){
			if(name.charAt(i)=='a'){
				count++;
				System.out.println("Position of a in your name :"+i);
			}
			
		}
		System.out.println("Total a in your name is   :"+count);
	
	}

}
