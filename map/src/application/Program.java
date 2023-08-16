package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		//Map<chave, valor>
		Map<String, String> cookies = new TreeMap<>();
		
		//cookies.put(null, null);
		cookies.put("username", "Felipe");
		cookies.put("email", "felipe@felipe.com");
		cookies.put("phone", "999998989");
		
		cookies.remove("email");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		
		
		System.out.println("ALL COOKIES");
		//Percorrendo
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}

}
