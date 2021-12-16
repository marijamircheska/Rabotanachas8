package zadaca1;

import java.util.HashMap;
import java.util.Map;

public class Glavna {

	public static void main(String[] args) {
		
		Map<String,String> rechnik = new HashMap<String,String>();
		rechnik.put("one", "eden");
		rechnik.put("two", "dva");
		rechnik.put("three", "tri");
		rechnik.put("hi", "zdravo");
		rechnik.put("four", "cetiri");

		System.out.println("Kluchevi: "+rechnik.keySet());
		System.out.println("Vrednosti: "+rechnik.values());

		for(Map.Entry<String,String> entry : rechnik.entrySet()){
			System.out.println(entry.getKey()+" | "+entry.getValue());	
		}

		if(rechnik.containsKey("hi"))
			System.out.println("Vrednosta (prevodot) za 'hi' e :" + rechnik.get("hi"));
		else
			System.out.println("Ne postoi zbor hi.");
	}
}