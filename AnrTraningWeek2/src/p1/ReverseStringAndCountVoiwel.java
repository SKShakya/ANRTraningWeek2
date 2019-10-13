package p1;

public class ReverseStringAndCountVoiwel {
	public ReverseStringAndCountVoiwel(){
		System.out.println("******ReverseString*******");
		
	}
	public String reverse(String str){
		if(str.isEmpty())
			return "";
		else
			return str.charAt(str.length()-1)+reverse(str.substring(0,str.length()-1));
	}
	public void vowele(String str){
		char c[]=str.toLowerCase().toCharArray();
		int count =0;
		for(int i=0;i<c.length;i++){
			switch(c[i]){
			case 'a':count++;break;
			case 'e':count++;break;
			case 'i':count++;break;
			case 'o':count++;break;
			case 'u':count++;break;
			
			}
		}
		System.out.println("Total voible in given string is :"+count);
	}
	public void consonantsWorld(String str){
		StringBuilder sb =new StringBuilder();
		char c[]=str.toCharArray();
				for(int i=0;i<str.length();i++){
					if(Character.isAlphabetic(c[i])){
					}
				
					else{
						sb.append(c[i]);
					}
				}
				System.out.println("ConsonantWorld in Given String : "+sb);
	}

}
