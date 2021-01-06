package testCases;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class CollectionsHashmap1 {

	public static void main(String[] args) {
	 
		
		
		Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"Amit");  
		  map.put(101,"Vijay");  
		  map.put(102,"Amit");  
		  int ctr=1;
		  System.out.println(map.size());
		  //Elements can traverse in any order  
		  
		  for (int i=0; i<map.size(); i++)
		  {
			  for (int i1=0; i1<map.size(); i1++)
			  {
				  
			  } 
		  }
		  
		  /*for(Map.Entry m:map.entrySet()){  
			  for(Map.Entry ma:map.entrySet()){
			  if(m.getValue()=="Amit")
			  {
				  ctr=ctr+1;
				 System.out.println(m.getValue());
			  }
			
			  }
		   System.out.println(m.getKey()+" "+m.getValue()+ " exists" + ctr +"times");  
		   ctr=0;
		  } */
		  
		  
		 
		/*	  for(Map.Entry ma:map.entrySet()){
			  if(ma.getValue()=="Amit")
			  {
				  ctr=ctr+1;
				 //System.out.println(ma.getValue());
			  }
			
			  
		   System.out.println(ma.getKey()+" "+ma.getValue()+ " exists" + ctr +"times");  
		   ctr=1;
	}*/
			  
			  String str = "hello world hi world world is so beautiful hello";
			  String str2[] = str.split(" ");
			   HashMap<Integer,String> hm=new HashMap<Integer,String>();
			   for (int i=0; i<str2.length; i++)
			   {   
			   hm.put(i, str2[i]);
			   }
		System.out.println(hm);
		Set s = hm.entrySet();
		Iterator itr = s.iterator();
		
		while(itr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
		
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    }  
		
		/*for( Map.Entry mp:hm.entrySet()){
			  	if(mp.getValue()==ju)
			  {
				  ctr=ctr+1;
				 //System.out.println(ma.getValue());
			  }
			
			  
		   System.out.println(ma.getKey()+" "+ma.getValue()+ " exists" + ctr +"times");  
		   ctr=1;
	}*/
		
	}
	
	

}
