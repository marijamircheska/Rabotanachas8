package zadaca2;

import java.util.HashMap;
import java.util.Map;

public class Rechnik {
	Map<String, String> recnik = new HashMap<String, String>();

	public void vnesiMapa() {
		recnik.put("Table", "Masa");
		recnik.put("Chair", "Stolica");
		recnik.put("Vase", "Vazna");
		recnik.put("Bouquet", "Buket");
	}

	public void translate (String s) {
		if (recnik.containsKey(s)) 
		{
			System.out.println(recnik.get(s));
		} 
		else
			System.out.println("Ne postoi takov zbor vo recnikot.");
	}
}