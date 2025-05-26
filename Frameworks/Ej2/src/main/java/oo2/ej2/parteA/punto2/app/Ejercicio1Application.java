package oo2.ej2.parteA.punto2.app;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.swing.SwingUtilities;

import oo2.ej2.parteA.punto2.ui.WallPostUI;

public class Ejercicio1Application {
	public static void main(String[] args) throws SecurityException, IOException {
		Logger logger = Logger.getLogger(WallPostUI.class.getName());
		logger.setUseParentHandlers(false);
		FileHandler fh;
		try {
			fh = new FileHandler("C:/Users/UnMatesito/Documents/Facu/OO2/Frameworks/Ej2/WallPostLog.log");
			logger.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter();
			fh.setFormatter(formatter);
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					new WallPostUI();
				}
			});
		}
		catch (IOException e) {
			logger.log(Level.SEVERE, "No se pudo crear el archivo de log", e);
		}
	}

}
