package javaAssessment;

public class InputString {

	public static void main(String[] args) {
		
		
		String str="+ (908) 523-9271";
		for(int i=str.length()-1;i>=0;i--) {
			
			if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='('||str.charAt(i)==')'||str.charAt(i)==' ')
				continue;
				System.out.print(str.charAt(i));
		}

	}

}
