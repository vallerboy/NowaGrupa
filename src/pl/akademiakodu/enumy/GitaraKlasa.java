package pl.akademiakodu.enumy;

public class GitaraKlasa implements Comparable<GitaraKlasa> {

	 
	 private Gitara gitara; 
	 private int cena;
	 private String producent;
	 
	 
	 
	 
	 
	public GitaraKlasa(Gitara gitara, int cena, String producent) {
		this.gitara = gitara;
		this.cena = cena;
		this.producent = producent;
	}
	
	public int getStrings() {
		return gitara.getStruny();
	}
	
	public int getDiameter(){
		return gitara.getSrednica();
	}
	
	public Gitara getGitara() {
		return gitara;
	}
	public void setGitara(Gitara gitara) {
		this.gitara = gitara;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
	public String getProducent() {
		return producent;
	}
	public void setProducent(String producent) {
		this.producent = producent;
	} 
	
	@Override
	public String toString() { 
		return "Producent: " + getProducent()+"\n"+"Iloœæ strun: " + getStrings() + "\n" + "Cena: " + getCena() + "\n Œrednica: " + getDiameter(); 
				
	}

	@Override
	public int compareTo(GitaraKlasa arg0) {
		
	 
	  
	   
		if(this.getGitara().getSrednica() > arg0.getGitara().getSrednica()){
			return -1;
		}else if(this.getGitara().getSrednica() == arg0.getGitara().getSrednica()){ 
			return 0;
		}
		return 1;
	}
	 
	 
}
