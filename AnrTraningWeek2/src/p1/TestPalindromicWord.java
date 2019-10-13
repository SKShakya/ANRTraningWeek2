package p1;

public class TestPalindromicWord {
	public TestPalindromicWord() {
		System.out.println("*******TestPelindrom******");
	}
	public void testPalindrom(String str){
		String temp ="";
		for(int i =str.length()-1;i>=0;i--){
		
			temp +=str.charAt(i);
		}
		System.out.println(temp);
		if(str.equals(temp))
			System.out.println("Palindrom");
		else
			System.out.println("NotPalindrom");
	}

}
