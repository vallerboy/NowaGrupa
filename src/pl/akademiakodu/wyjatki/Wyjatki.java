package pl.akademiakodu.wyjatki;

import java.io.IOException;

public class Wyjatki {

	public static void main(String[] args) throws IOException {
	 
	
		new Wyjatki();

		//throw throws
	}
	
	
	public Wyjatki() throws IOException  { 
	
		
		// DOBRZE
		try{ 
			exceptionMy();
		}catch(NullPointerException e){ 
			
		}catch(RuntimeException e) { 
			
		}
		
		uruchomLicz();
	}
	
	
	public void exceptionMy() { 
		throw new NullPointerException("Error"); 
	}
	
	public void uruchomLicz()  {
	
	
			try {
				licz("oskar");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		System.out.println("Aplikacja dzia³a, mimo wyj¹tku");
		
	}
	
	public void licz(String s) throws IOException{ 
		if(s.equals("oskar")){ 
			throw new IOException("Ten argument nie mo¿e byæ 'oskar'");
		}
		System.out.println("Wynik: " + s);
	}
	
	
	

}
