package org.pengyuan.string;

public class LongestCommonString {
	public static void main(String args[]){
	    String x="abcdepoi";
	    String y="bcdefpoi";
		int substringLength1 = x.length();
	    int substringLength2 = y.length(); 
	    int opt[][]=new int [substringLength1+1][substringLength2+1];
	    for(int i=1;i<=substringLength1;i++)
	    	for(int j=1;j<=substringLength2;j++)
	    	{
	    		if(x.charAt(i-1)==y.charAt(j-1))
	    			opt[i][j]=opt[i-1][j-1]+1;//状态转移方程，
	    	}
	    int max=opt[0][0];
	    int m=0,n=0;
	    for(int i=substringLength1;i>=1;i--)
	    	for(int j=substringLength2;j>=1;j--){
	    		if(opt[i][j]>max)
	    			{
	    				max=opt[i][j];
	    				m=i;
	    				n=j;
	    			}
	    	}
	    System.out.println("x = "+x);
	    System.out.println("y = "+y);
	    System.out.println("max = "+max);
	    StringBuffer sb=new StringBuffer();
	    for(int i=m,j=n;i>=1&&j>=1;i--,j--)
			{
	    		if(opt[i][j]>0)
	    			sb.append(x.charAt(i-1));
			}
	    String result=sb.toString();
	    for(int i=result.length()-1;i>=0;i--)
	    	System.out.print(result.charAt(i));
	}
}