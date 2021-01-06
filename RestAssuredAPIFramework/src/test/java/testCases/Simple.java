package testCases;

import java.util.HashMap;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	 HashMap<String, String> capitalCities = new HashMap<String, String>();
		    capitalCities.put("England", "London");
		    capitalCities.put("Germany", "Berlin");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("USA", "Washington DC");
		    
		    for (String i : capitalCities.values()) {
		      System.out.println(i);
	}*/
		    String str = "hello world hi world world is so beautiful hello";
			  String str2[] = str.split(" ");
			/*   HashMap<Integer,String> hm=new HashMap<Integer,String>();
			   for (int i=0; i<str2.length; i++)
			   {   
			   hm.put(i, str2[i]);
			   }
		//System.out.println(hm);
			   System.out.println(hm.size());
		int ctr=0;
		String k = "";
		/* for (int i=0; i<hm.size(); i++) {
			 k=hm.get(i).toString();
			// System.out.println(k);
			
		      for (int j =i+1; j<hm.size(); j++)
		      {
		      //System.out.println(k);
			  if (k.equalsIgnoreCase(hm.get(j).toString()))
					 // k==hm.get(j).toString())
		        {//System.out.println(k + " "+ hm.get(j));
				  ctr=ctr+1;}
		
		 
		      }
		      System.out.println(k + ctr);
			  ctr=1;

		      }*/
		//correct duplicate count
		/* for (int i=0; i<hm.size(); i++) {
			 k=hm.get(i).toString();
					
		      for (String j : hm.values())
		      {
		      
			  if (k.equalsIgnoreCase(j))
					 
		        {
				  ctr=ctr+1;
				  }
		
		 
		      }
		      System.out.println(k + ctr);
			  ctr=0;

		      }*/
	//Correct duplicate count using for each in hashmap
	/*	for (String i : hm.values()) {
							
		      for (String j : hm.values())
		      {
		      
			  if (i.equals(j))
								 
		        {
				  ctr=ctr+1;
				  }
		
		 
		      }
		      System.out.println(i + ctr);
			  ctr=0;

		      }
		*/
		// String str = "hello world hi world world is so beautiful hello";
		  //String str2[] = str.split(" ");
		   HashMap<String, Integer> hmap1 = new HashMap<String, Integer>(); 

  
		   for (int i = 0; i < str2.length; i++) { 
			   
	            if (hmap1.get(str2[i]) == null) { 
	  
	                hmap1.put(str2[i], 1); 
	            } 
	            else { 
	                //Integer c = (int)hmap1.get(str2[i]); 
	                Integer c = hmap1.get(str2[i]);
	//                System.out.println(hmap1.get(str2[i]));
	  //              System.out.println("integer c = " + c);
	                hmap1.put(str2[i], ++c); 
	            } 
	        } 
	  System.out.println(hmap1);
	  
  
		
		
}
}