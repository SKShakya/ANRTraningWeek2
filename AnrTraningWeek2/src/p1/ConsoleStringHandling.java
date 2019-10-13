package p1;

public class ConsoleStringHandling {
	public static void main(String[] args) {
		System.out.println(args.length);
		StringBuffer str =new StringBuffer();
		String s =args[0];
		System.out.println("Given String is :"+s);
		System.out.println("Reverse In Upper Case: "+reverse(s).toUpperCase());
		System.out.println(reverse(s).toUpperCase()+args[1]);
		str.append(args[0]);
		System.out.println("Capicity of String Buffer is : "+str.capacity());
	}
		public static String reverse(String str){
			if(str.isEmpty())
				return "";
			else
				return str.charAt(str.length()-1)+reverse(str.substring(0,str.length()-1));
	}

}
