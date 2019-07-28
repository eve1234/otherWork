package otherWork.otherWork;

import java.util.HashMap;
import java.util.Map;

public class CountChar {
	
	public static void main(String[] args) {

	    String s = "AAAABBCCCDDDDZZZZZAZBBB";
	    int no = s.length();
	    System.out.println(no);
	    int it;
	    Map<String, Integer> hm = new HashMap<String, Integer>();
	    for (int i = 0; i < no; i++) {
	      String ch = String.valueOf(s.charAt(i));
	      //System.out.println(ch);
	      if (hm.containsKey(ch)) {
	        it = hm.get(ch);
	        //System.out.println(it);
	      } else {
	        it = 0;
	      }

	      hm.put(ch, ++it);
	    }
	    for (Map.Entry m : hm.entrySet()) {
	      System.out.println(m.getKey() + " " + m.getValue());
	    }
	  }


}


