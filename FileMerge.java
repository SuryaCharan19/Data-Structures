package DynamicProgramming;

import java.util.Arrays;
import java.util.Random;

public class FileMerge
{
	public static int findMinimalFile(int[] in)
	{
		Arrays.sort(in);
		max=0;
		for(int i=0;i<in.length;++i)
		{
			int max=
		}
		System.out.println(Arrays.toString(in));
	}
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int[] in=new int[n];
		Random r = new Random(100);
		for(int i=0;i<n;++i)
		{
			in[i]=r.nextInt(n)+1;
		}
		System.out.println(findMinimalFile(in));
	}

}
