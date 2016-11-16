package pl.akademiakodu.enumy;

public class MainClass {

	public static void main(String[] args){ 
	 
		for(NowyEnum day : NowyEnum.values()){
			System.out.println(day.getNumber());
		}
		
		
		NowyEnum day = NowyEnum.valueOf("CZWARTEK");
		NowyEnum day1 = NowyEnum.CZWARTEK;
		System.out.println(day.name());
		
	}
	 
}
