package DynamicProgramming;

import java.util.Arrays;

public class NthFibonacci 
{
	//using recursion
	public static int fib1(int n)
	{
		if(n<=2) return 1;
		return fib1(n-1)+fib1(n-2);	
	}
	public static int fib2(int n)
	{
		int[] mem =new int[n+1];
		auxfib(n,mem);
		return mem[n];
	}
	public static int auxfib(int n, int[] mem)
	{
		if(n<=2) return 1;
		if(mem[n] != 0) return mem[n];
		mem[n] = auxfib(n-1,mem)+auxfib(n-2,mem);
		return mem[n];
	}
	public static int fib3(int n)
	{
		int[] in = new int[n+1];
		in[1]=in[2]=1;
	  for(int i=3;i<in.length;++i)
		  in[i]=in[i-1]+in[i-2];
		  return in[n];
		
	 
	}
	public static void printSequence()
	{
		
	}
	public static int fib4(int n)
	{
		if(n<=2) return 1;
		int prev1,prev2;
		int current =0;
		prev1=prev2=1;
		for(int i=0;i<n;++i)
		{
			current=prev1+prev2;
			prev1=prev2;
			prev2=current;
		}
		return current;
	}
	public static void main(String[] args) 

	{
		int n=Integer.parseInt(args[0]);
		//System.out.println(fib1(n));
		long start =System.currentTimeMillis();
		System.out.println(fib3(n));
		
		long end = System.currentTimeMillis();
		System.out.println("time taken:" +(end-start)/1000.0+"seconds");
	}

}
