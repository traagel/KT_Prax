
abstract class Teos {
	String kirjeldus;
	String tähis; //roheline 1 päev, puudub 14 päev, kollane 30 päev, sinine 60 päev
	String laenutaja;
	int päevad; 
	
	
	public Teos(String kirjeldus, String tähis, String laenutaja, int päevad){
		this.kirjeldus = kirjeldus;
		this.tähis = tähis;
		this.laenutaja = laenutaja;
		this.päevad = päevad;
	}
	
	
	//korras
	abstract boolean kasHoidlast();
	
	
	
	public double päevaneViivis(){ //30 ja 60 – 0.05, 14 – 0.15, 24h – 2   ((ületatud päeva kohta  €))
		if (tähis == "roheline"){
			return 2;
		} else if (tähis == "puudub"){
			return 0.15;
		} else {
			return 0.05;
		}
	}
	
	public void arvutaViivis(Kontrollija kontrollija){
		
	}
	
	
	public int laenutusaeg(){
		if (tähis == "roheline"){
			return 1;
		} else if (tähis == "puudub"){
			return 14;
		} else if (tähis == "kollane"){
			return 30;
		} else if (tähis == "sinine"){
			return 60;
		} else {
			return 0;
		}	
	}
}
