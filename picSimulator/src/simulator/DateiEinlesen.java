package simulator;
import java.io.*;
import java.util.Iterator;
import java.util.TreeMap;

public class DateiEinlesen {
	
	int zeilenLaenge; //die l‰nger einer Zeile
	int zeilenNummer=0; //zeilennummer
	String meineTextZeile=""; // sp‰tere ausgabe
	String dateiTextZeile="";//text der datei
	String dateiName; //der name der datei
	TreeMap<Integer, String> befehl = new TreeMap<Integer, String>();
	
	
	public void setDatei(String name){ // legt fest wo die datei liegt
		dateiName= name;
	}
	public void zeigeDatei(){
		FileReader meinFile= null;
		BufferedReader meinLeseStream= null;
		
		
		try{
			meinFile= new FileReader(dateiName); // legt objekt von der datei an -- welche datei geladen werden soll
			meinLeseStream= new BufferedReader(meinFile); // legt objekt von datei an -- zum lesen
			dateiTextZeile= meinLeseStream.readLine(); // zeile in der man gerade ist
			while (dateiTextZeile != null) { // l‰uft solange die zeile in der man gerade lieﬂt nicht null ist-- dukument fertig
				zeilenNummer++; // z‰hlt zeilennummer hoch
//				zeilenLaenge= dateiTextZeile.length(); // zeigt die l‰nger der zeile in der man gerade ist
//				meineTextZeile= meineTextZeile+zeilenNummer+ "\t| "; // zeile die ausgegeben wird (nummer)
//			 	meineTextZeile= meineTextZeile+zeilenLaenge+ "\t| "; // zeile die ausgegeben wird (l‰nge)
//				meineTextZeile= meineTextZeile+dateiTextZeile; // zeile die ausgegeben wird (text)
//				System.out.println(meineTextZeile);// gibt die eig textzeile aus mit alles was man haben will
				befehl.put(zeilenNummer, dateiTextZeile);
				meineTextZeile=""; // text zeile wird wieder geleert
				dateiTextZeile= meinLeseStream.readLine();//die textzeile der datei lieﬂt die n‰chste zeile
				
			}
			
			for (Integer elem : befehl.keySet())
				System.out.println(elem + " - " + befehl.get(elem));


			
			meinLeseStream.close(); //schlieﬂt den lesetream
			meinFile.close(); //schlieﬂt die datei
			System.out.println("################### ende der datei #######################");
		}catch(IOException e){
			System.out.println("Fehler beim Dateizugriff" +e);
		}
		
	}

}
