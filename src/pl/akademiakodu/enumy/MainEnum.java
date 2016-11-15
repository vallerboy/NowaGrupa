package pl.akademiakodu.enumy;

public class MainEnum {

	public enum DayOfWeek  { 
		PONIEDZIALEK(1), WTOREK(2), SRODA(3), CZWARTEK(4), PIATEK(5); 
		
		private int numberOfDay; 
		
		private DayOfWeek(int numberOfDay){ 
			this.numberOfDay = numberOfDay;
		}
		
		public int getNumber() { 
			return numberOfDay;
		}
	}
	
	
	public static void main(String[] args) {
		 
		 DayOfWeek today = DayOfWeek.WTOREK;
		 System.out.println(today.getNumber());


	}

}
