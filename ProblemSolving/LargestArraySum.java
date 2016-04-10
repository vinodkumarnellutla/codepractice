/*You are given an array of integers (both positive and negative)  
 * Find the continuous sequence with the largest sum  Return the sum  
 * EXAMPLE Input: {2, -8, 3, -2, 4, -10} Output: 5 (i e , {3, -2, 4} )*/
public class LargestArraySum {

public static void push(int[] input)
{
	int maxsum=0;
	int sum=0;
	int a[]=new int[10];
	//System.out.println(input);
	for (int i = 0; i < input.length; i++) {
		sum+=input[i];
		if(maxsum<sum)
		{
			maxsum=sum;
		//	System.out.println(maxsum);
		}
		else if(sum<0)
		{
			sum=0;
		}
	}
	System.out.println(maxsum);
	}
public static void main(String[] args) {
	int[] input={-2,0,-1,2,-3,4};
	push(input);
	System.out.println();
}

}
