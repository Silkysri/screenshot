package testCases;
import java.io.*; 
import java.util.*; 
class maxxxx{
	

	// Java program to find maximum distance between two  
	// same occurrences of a number. 

	  
		  
	    // Function to find maximum distance between equal elements  
	    static int maxDistance(char[] ar, int n) 
	    { 
	        // Used to store element to first index mapping 
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>(); 
	          
	        // Traverse elements and find maximum distance between  
	        // same occurrences with the help of map.  
	        int max_dist = 0; 
	  
	        for (int i = 0; i < n; i++) 
	        { 
	            // If this is first occurrence of element, insert its  
	            // index in map  
	            if (!map.containsKey(ar[i])) 
	                map.put(ar[i], i); 
	  
	            // Else update max distance  
	            else
	                max_dist = Math.max(max_dist, i - map.get(ar[i])); 
	        } 
	  
	        return max_dist; 
	} 
	  
	// Driver code 
	public static void main(String args[]) 
	{ 
	    //int[] arr = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2}; 
	    String str = "silkys";
	    char[] ar= str.toCharArray();
	   // char[] ar = {'s', 'i','l', 'k', 'y', 's', 's'}; 
	    int n = ar.length; 
	    System.out.println(maxDistance(ar, n)); 
	} 
	}  