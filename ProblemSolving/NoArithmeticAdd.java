
public class NoArithmeticAdd {
/*Write a function that adds two numbers  You should not use + or any arithmetic operators  */
	
	public static int noarithmeticadd(int a,int b)
	{
		if(b==0)return a;
		int sum=a^b;
		//System.out.println((sum));
		int carry=a&b<<1;
		//System.out.println(sum);
		//System.out.println(carry);
		return noarithmeticadd(sum,carry);
		
	}
	public static void main(String[] args) {
		//noarithmeticadd(759,674);
		System.out.println(noarithmeticadd(759,674));
	}
}
