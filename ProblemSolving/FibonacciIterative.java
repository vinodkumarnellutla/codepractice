
public class FibonacciIterative {
 public static int fibonacci(int n)
 {
	 int a,b,c = 0,result = 0;
	 if(n<0) return -1;
	
	 
		  a=0;
		  b=1;
		 for(int i=0;i<=n;i++)
		 {
			 c=a+b;
			 a=b;
			 b=c;
			 
		 }
	 
 return b;
 }
 public static int recursivefibo(int n)
 {
	 if(n==0){return 0;}
	 else if(n==1){return 1;}
	 else if(n>0)
	 {
	return	 recursivefibo(n-1)+recursivefibo(n-2);
	 }
	 else 
		 return -1;
 }
 
 public static void main(String[] args) {
	System.out.println(fibonacci(6));
	System.out.println(recursivefibo(6));
}
}

