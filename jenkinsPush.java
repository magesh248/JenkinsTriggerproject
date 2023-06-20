public class jenkinsPush{

public static void main(String[] args) {
		
			String originalstr ="PALINDROME";
			String REVERSEstr =" ";
			
			for(int i=0;i<originalstr.length();i++)
			{
				
				REVERSEstr=originalstr.charAt(i) + REVERSEstr;
			}
			
		System.out.println(REVERSEstr);
	}

}

