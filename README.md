
package Aula_03;

import java.util.*;

public class Main {

	public static void main(String[] args)
	{
		List<String> minhalista = new ArrayList <String>();
		
		minhalista.add("a");
		minhalista.add("b");
		minhalista.add("c");
		
		System.out.println (minhalista);
		
		minhalista.remove("b");
		System.out.println (minhalista);
		
		System.out.println (minhalista.contains("a"));
		
		System.out.println (minhalista.size());
		
		System.out.println (minhalista.isEmpty());
		
		minhalista.clear();
		System.out.println (minhalista);
	}
	
}
