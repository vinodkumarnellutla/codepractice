
public class RotationSubString {
/*Assume you have a method isSubstring which checks if one word is a substring of another   
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring 
 * (i e , “waterbottle” is a rotation of “erbottlewat”) 


*/
public static boolean isRotation(String s1,String s2)
{
	int len=s1.length();
	while(len==s2.length()&&len>0)
	{
		String s1s1=s1+s1;
	       System.out.println("substring is confirmed"+s1s1);
	      // s1s1.contains(s2);
	      
	       
	       System.out.println(""+ s1s1.toLowerCase().contains(s2.toLowerCase()));

    return  isSubstring(s1s1,s2);
    
	}
		
	return false;

}

private static boolean isSubstring(String s1s1, String s2) {
	// TODO Auto-generated method stub
	boolean result=true;
	if(s1s1.length()==0)
	{
	return false;
	}
	else if(s1s1.equals(s2))
	{
		return true;
	}
	while (true){
	char c,d;
	for (int i = 0; i < s1s1.length(); i++) {
		c=s1s1.charAt(i);
		for (int j = 0; j < s2.length(); j++) {
			d=s2.charAt(j);
			if (c == d) {
                result = true;
                System.out.println("it is substring");
            } else {
                result = false;
            }   
		}
		
	}
	
	return result;}
}	
	
	public static void main(String[] args) {
		String s1="Apple";
		String s2="pLeap";
		isRotation(s1, s2);
	}
	
}
