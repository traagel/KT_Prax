
public class SuurimaViiviseLeidja implements Kontrollija {

	String omanik;
	String teos;
	double suurimViivis;
	
	
	public void saadaHoiatus(){
		System.out.println(omanik + suurimViivis);
	}
	
	 
	
	
	
	@Override
	public void salvestaViivis(String nimi, String kirjeldus, double viivis) {
		// Kui sisend on suurem kui salvestatud
		if (viivis > suurimViivis){
			omanik = nimi;
			teos = kirjeldus;
			suurimViivis = viivis;
		}
	}

}
