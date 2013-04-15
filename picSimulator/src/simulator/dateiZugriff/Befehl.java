package simulator.dateiZugriff;

public class Befehl {
	private int Code;
	private int Speicherstelle;
	
	public Befehl(int befehl, int speicherst){
	Code =befehl; 
	Speicherstelle= speicherst;
	}

	public int getCode() {
		return Code;
	}

	public void setCode(int code) {
		Code = code;
	}

	public int getSpeicherstelle() {
		return Speicherstelle;
	}

	public void setSpeicherstelle(int speicherstelle) {
		Speicherstelle = speicherstelle;
	}
	
	
	
}

	
