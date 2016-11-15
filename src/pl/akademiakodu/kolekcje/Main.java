package pl.akademiakodu.kolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		 
		new Main();
	  
		 
	}
	
	public Main() {
		
		
		// Funkcjonalnoœæ sortowania dziêki TreeSet'om
		Set<String> mySet = new TreeSet<>(); 
		mySet.add("Oskar");
		mySet.add("Wojtek");
		mySet.add("Kamila");
		mySet.add("Dorota");
		
//		 for(String name : mySet){ 
//			 System.out.println(name);
//		 }
		 
		 System.out.println("");
		
		// Sortowanie za pomoc¹ Comparable
		 List<Person> myList = new ArrayList<>();
		 myList.add(new Person("Oskar", 26));
		 myList.add(new Person("Wojtek", 15));
		 myList.add(new Person("Lukasz", 21));
		 myList.add(new Person("Dorota", 21));
		 
		 Collections.sort(myList, new CompareByAge());
		 
		 for(Person name : myList){ 
			 System.out.println(name);
		 }
	}
	
	
	private class CompareByAge implements Comparator<Person> {
	
        @Override
        public int compare(Person o1, Person o2) {
     
            if(o1.getAge() > o2.getAge()){
            	return 1;
            }else if(o1.getAge() == o2.getAge()){
            	return 0;
            }
            return -1;
        }
 
    }

}
