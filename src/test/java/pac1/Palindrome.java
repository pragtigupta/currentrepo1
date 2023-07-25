package pac1;

public class Palindrome {

	public static void main(String[] args) {
		
		
		//palindrome pgm:	
		//palindrome pgm:
		//practice pgm:
		String str="madam";
		String str1="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		
         if(str.equalsIgnoreCase(str1))
        	 System.out.println("palin");
         else
        	 System.out.println("not palin");
        	 
	}

}
