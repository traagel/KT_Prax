import java.util.ArrayList;
import java.util.List;

public class ViiviseHoiataja implements Kontrollija{
	
	double lubatudViivis;
	List<String> võlglased = new ArrayList<>();
	
	
	ViiviseHoiataja(double viivis){
		lubatudViivis = viivis;
	}
	
	
	@Override
	public void salvestaViivis(String nimi, String kirjeldus, double viivis) {
		if (viivis > lubatudViivis && !võlglased.contains(nimi)){
			võlglased.add(nimi);
		}
	}
	
	
	public List<String> getHoiatavadLaenutajad(){
		return võlglased;
	}

}
