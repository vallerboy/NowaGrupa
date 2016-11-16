package pl.akademiakodu.enumy;

public enum NowyEnum {

	 PONIEDZIALEK(1, "pon"), WTOREK(2, "wt"), SRODA(3, "sr"), CZWARTEK(4, "czw"), PIATEK(5, "pt"), SOBOTA(6, "sb"), NIEDZIELA(7, "nd");
	 
	 private int number; 
	 private String scr; 
	
	 private NowyEnum(int number, String scr){ 
		 this.number = number;
		 this.scr = scr;
	 }
	 
	 public String getShortcut() { 
		 return scr;
	 }
	 
	 public int getNumber() { 
		 return number;
	 }
}
