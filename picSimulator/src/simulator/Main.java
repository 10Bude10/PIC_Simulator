package simulator;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JFrame;




public class Main {
	public static void main(String[] args){

		Canvas  ui = new Canvas();
		DateiEinlesen datei= new DateiEinlesen();
		datei.setDatei("BA_Test.LST");
		datei.zeigeDatei();
		
	
	}
	
}
