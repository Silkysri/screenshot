package testCases;
import java.io.*; 
import java.util.*; 

public class searchsubstringandfinddistance {

public static void main(String args[])
	{ 
		String str = "silky shsiaya";
		String searchstr = "z";
		System.out.println(maxDistance(str,searchstr)); 
		
		int f1=str.indexOf(searchstr);
		System.out.println(f1);
		int f2=str.lastIndexOf(searchstr);
        System.out.println(f2);
        int d=f2-f1;
        if(d<=0)
        {System.out.println("dist is -1");}
        else
		{System.out.println("dist"+ d);}
		
	} 

public static int maxDistance(String str, String searchstr ) 
{ 
	   
	HashMap<String, Integer> map = new HashMap<String, Integer>(); 
	int max_dist = -1; 
	int ctr=0;
	String st;
	int n= str.length();
	int s=searchstr.length();

	for (int i = 0; i < n; i++) 
	{  
		if (i==n-1)
		{
			st = searchstr;
			if (!map.containsKey(searchstr)) 
			{map.put(searchstr, i); 
			max_dist=i;
			}
		else
			max_dist = Math.max(max_dist, i - map.get(searchstr)); 
	 
		}
		else
		{
		System.out.println(i);
		System.out.println(s);
		st=str.substring(i, i+s);
			if(st==searchstr)
			{	
			System.out.println(!map.containsKey(searchstr));
			if (!map.containsKey(searchstr)) 
				{map.put(searchstr, i); 
				max_dist=i;
				}
			else
				max_dist = Math.max(max_dist, i - map.get(searchstr)); 
		 
		}
		}
		
	}
	

		
	
	
	System.out.println(max_dist);

	return max_dist; 
}


}
