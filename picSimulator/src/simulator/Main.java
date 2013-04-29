package simulator;
import java.util.TreeMap;

import simulator.InstructionManager.InstructionManager;
import simulator.dateiZugriff.Befehl;
import simulator.dateiZugriff.DateiEinlesen;




public class Main {
	
	static TreeMap<Integer, Befehl> befehlTree = new TreeMap<Integer, Befehl>();
	static TreeMap<Integer, String> textTree = new TreeMap<Integer, String>();

	public static void main(String[] args){

		GUI  ui = new GUI();
		InstructionManager befehl= new InstructionManager();
		
		DateiEinlesen datei= new DateiEinlesen();
		datei.setDatei("BA_Test.LST");
		datei.berechneDatei();
		befehlTree= datei.getBefehlTree();
		textTree= datei.getTextTree();
		
		befehl.starteAbarbeitung(befehlTree);
		
	
	}


	
}
