package testCases;

import java.util.HashMap;

public class PalindromeusingHashmaps {
	
	public static void main(String[] args) {
		String str = "geegi i geeg"; 
		String str2[]=str.split(" ");
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		for (int i=0;i<str2.length;i++)
		{
		System.out.println(str2[i]);
		hm.put(i, str2[i]);
	}
		
		int len = hm.size()-1;
		System.out.println(len);
		int flag =0;
		/*for (int i=0; i<=len;i++)
		{
			System.out.println(hm.get(i)+hm.get(len));
			//if(hm.get(i).equalsIgnoreCase(hm.get(len)))
			//if(hm.get(i).toString()==hm.get(len).toString())
			if(hm.get(i).equals(hm.get(len)))
			{
			flag=0;
			len--;
			}
			else
			{flag=1;
			break;}
			
		}*/
		
		for (String k : hm.values())
		{ System.out.println(k);
		if (hm.get(len).equals(k))
		{
				System.out.println(hm.get(len));
		flag=0;
		len--;
		}
		else
		{flag=1; System.out.println(hm.get(len));
		break;}
		}
		
		
		
System.out.println(flag==0 ? "Palindrome" : "not Palindrome");
/*if (isPalindrome(str)) 
System.out.println("Yes"); 
else
System.out.println("No"); 

int l=str.length()-1;
int flag=0;
for (int i=0; i<l; i++)
{
	if (str.charAt(i)==str.charAt(l))
	{
		flag=0;
		l--;
	}
	else
	{
		flag=1;
		break;
	}
	}
System.out.println(flag==0 ? "Palindrome" : "Not Palindrome");*/
	}

	/*	static boolean isPalRec(String str,  
    int s, int e) 
{ 
//If there is only one character 
if (s == e) 
return true; 

//If first and last  
//characters do not match 
if ((str.charAt(s)) != (str.charAt(e))) 
return false; 

//If there are more than  
//two characters, check if 
//middle substring is also 
//palindrome or not. 
if (s < e + 1) 
return isPalRec(str, s + 1, e - 1); 

return true; 
} 

static boolean isPalindrome(String str) 
{ 
int n = str.length(); 

// An empty string is  
// considered as palindrome 
if (n == 0) 
return true; 

return isPalRec(str, 0, n - 1); 
} */
}
