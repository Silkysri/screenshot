package testCases;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Test2 {

	public static void main(String[] args) {
		HashMap<String, String> hm =new HashMap<String, String>();
		hm.put("01","one");
		hm.put("02","two");
		hm.put("03","one");
		hm.put("04","one");
		hm.put("05","two");
		HashMap<Object, Integer> newHm = new HashMap <Object, Integer>();
		         Iterator<Entry<String, String>> it = hm.entrySet().iterator();
		            while (it.hasNext()) {
		                Map.Entry pair = (Map.Entry)it.next();
		                System.out.println(pair.getKey() + " = " + pair.getValue());
		                if(newHm.containsKey(pair.getValue())){
		                    newHm.put(pair.getValue(), Integer.parseInt(newHm.get(pair.getValue()).toString())+1 );
		                }else{
		                    newHm.put(pair.getValue(),1 );
		                }
		                it.remove(); // avoids a ConcurrentModificationException
		            }
	}

}
