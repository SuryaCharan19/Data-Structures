package DynamicProgramming;

import java.util.Arrays;
import java.util.Random;

public class MaximumSum 
{
	public static int findSum1(int[] in)
	{
		return auxSum1(in.length,in);
	}
	private static int auxSum1(int i,int[] in)
	{
		if(i<1) return 0;
		int inclsum=auxSum1(i-2,in)+in[i-1];
		int exclsum=auxSum1(i-1,in);
		return Math.max(inclsum, exclsum);
	}
	public static int findSum2(int[] in)
	{
		int[] mem=new int[in.length+1];
		return auxSum2(in.length,in,mem);
	}
	private static int auxSum2(int i,int[] in,int[] mem)
	{
		if(i<0) return 0;
		if(mem[i]!=0) return mem[i];
			int inclsum=auxSum2(i-2,in,mem)+in[i-1];
			int exclsum=auxSum2(i-1,in,mem);
			mem[i]=Math.max(inclsum, exclsum);
			return mem[i];
	}
	private static void printSequence(int[] mem,int i)
	{
		if(i <= 0) return;
		if(mem[i] == mem[i-1])
		{
			printSequence(mem,i-1);
		}else
			printSequence(mem,i-2);
		System.out.println(i-1 + "->");
	}
	public static void main(String[] args)
	{
		int i=Integer.parseInt(args[0]);
		//int[] mem=new int[i];
		int[] in=new int[i];
		Random r=new Random(100);
		for(int j=0;j<in.length;j++)
		{
			in[j]=r.nextInt(i)+1;
		}
		System.out.println(Arrays.toString(in));
		System.out.println(findSum2(in));
		System.out.println(printSequence(mem,i));
	}

}
