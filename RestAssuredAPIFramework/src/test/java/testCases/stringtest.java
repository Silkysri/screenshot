package testCases;

import java.util.Scanner;

public class stringtest {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str11="madam";
		String revstr="";
		
		for (int i=str11.length()-1; i>=0; i--)
		{
			
			char temp =str11.charAt(i);


			
			revstr=revstr.concat(String.valueOf(temp));
		}
		
		System.out.println(revstr);
		if (str11.compareTo(revstr)==0)
		{
			System.out.println("palindrome");
		}
		else 
			
		{System.out.println("not palindrome");}
	
		
	int chk =2;
	int t=0;
	int flag=0;
	
	for (int i=2; i<=chk/2; i++)
	{
	  
		t=chk%i;
		
		if(t==0)
		{
			flag=1;
			break;
		}
			
	}	
	if (flag==0)
	{
		System.out.println(chk + " is prime");
	}
	
	else 
	{
		System.out.println(chk + " Not prime");
		
	}
	
	//reversing a number
	int n = 1221;
	/*int n;
	System.out.println("enter a number");
	sc = new Scanner(System.in);
	n=sc.nextInt();*/
	int rev=0,r =0;
	int temp=n;
	
	while (temp>0)
	{
		r=temp%10;
		rev=(rev*10)+r;
		temp=temp/10;
	}
	if (n==rev)
	{
System.out.println("reversed number " + rev + " palindrome");	
	}
	else 
	{
System.out.println("reversed number " + rev + " not palindrome");	
	}
	
	String str1 = "Hello world";
	String str2 = "Hello worlds";
	
	
	if (str1.equals(str2))

    { // this condition is true

        System.out.println("str1 and str2 are equal in terms of values");

    }

    if (str1 == str2) {

        //This condition is true

        System.out.println("Both strings are referencing same object");

    } else

    {

        // This condition is NOT true

        System.out.println("Both strings are referencing different objects");

    }
	
	String s3 = str1.replace("l", "sky");
	System.out.println(s3);
	}
	


	
}
