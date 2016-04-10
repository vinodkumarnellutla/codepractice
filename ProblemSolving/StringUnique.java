
public class StringUnique {
//Implement an algorithm to determine if a string has all unique characters  What if you can not use additional data structures? 

public static boolean isunique(String s)
{
	boolean charset[]=new boolean[256];
	for (int i = 0; i < s.length(); i++) {
		int val=s.charAt(i);
		if (charset[val]) {
			System.out.println("not unique");
			return false;  
			}
		charset[val] = true; 
		System.out.println("charecter unique");
	}
	

return true;
}

public static void main(String[] args) {
	String s="xyz";
	isunique(s);
}
}
