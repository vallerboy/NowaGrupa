import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zadanie1 {

	public static void main(String[] args) {
	 
		new Zadanie1();

	}
	
	public Zadanie1() { 
		
		List<String> arrayOfValues = Arrays.asList("Wojtek","Wojtek", "Maciej", "Tomasz", "Iza");
		System.out.println("Ma duplikaty?: " + haveDuplicates(arrayOfValues));
	}
	
	   public static void znajdzDuplikaty(List<String> lista) {
		   
	        //sort(lista);
	        Set<String> duplikaty = new HashSet<String>();
	 
	        for (int i = 1; i < lista.size(); i++) {
	            if (lista.get(i - 1).equals(lista.get(i)))
	                duplikaty.add(lista.get(i));
	        }
	 
	        if (duplikaty.size() == 0) {
	            System.out.println("Nie znaleziono duplikatów!");
	        } else {
	            System.out.println("Zduplikowane elementy: ");
	            for (String element : duplikaty) {
	                System.out.println(element);
	            }
	        }
	    }

	
	 public static boolean isRepeatable(List<String> spis) {
	        int i = 0;
	        while (spis.size() > 1) {
	            String el = spis.get(i);
	            spis.remove(el);
	            if (spis.contains(el))
	                return true;
	        }
	        return false;
	    }
	
	public boolean haveDuplicates(List<String> list) { 
		   for(int i = 0; i < list.size(); i++){ 
			   String local = list.get(i);
			   for(int a = i; a < list.size(); a++){ 
				     if(local.equals(list.get(a))){ 
				    	 return true;
				     }
			   }
		   }
		 
		return false;
	}
}
