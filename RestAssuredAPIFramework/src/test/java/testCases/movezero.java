package testCases;
import java.util.*; 

public class movezero {

	static void printArr(int arr[], int n) 
	{ 
	    for (int i = 0; i < n; i++) 
	        System.out.print(arr[i]+" "); 
	} 
	  
		static void pushBinaryToBorder(int arr[], int n) 
	{ 
	     int count1 = 0; 
	  
	    for (int i = 0; i < n; i++) 
	        if (arr[i] != 1) 
	            arr[count1++] = arr[i]; 
	  
	
	    while (count1 < n) 
	        arr[count1++] = 1; 
	  
	    
	    int lastNonOne = 0; 
	  
	    for (int i = n - 1; i >= 0; i--)  
	    { 
	       
	        if (arr[i] == 1) 
	            continue; 
	        if (lastNonOne == 0) 
	        {  
	           lastNonOne = i; 
	        } 
	  	        if (arr[i] != 0) 
	            arr[lastNonOne--] = arr[i]; 
	    } 
	  
	       while (lastNonOne >= 0) 
	        arr[lastNonOne--] = 0; 
	} 
	  
	public static void main(String args[]) 
	{ 
	    int arr[] = { 1, 2, 0, 0, 0, 3, 6 }; 
	    int n = arr.length; 
	    pushBinaryToBorder(arr, n); 
	    printArr(arr, n); 
	  
	} 
	} 