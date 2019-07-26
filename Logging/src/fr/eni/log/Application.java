package fr.eni.log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Application {
	public static Logger logger = Logger.getLogger("Test");
	public static void main(String[] args) {
	try {
	FileHandler handler = new FileHandler("logs.log", true);
	handler.setFormatter(new SimpleFormatter());
	logger.addHandler(handler);
	logger.info("D�but de l'application");
	logger.severe("Probleme");
	Log test = new Log();
	test.log();
	logger.info("Fin de l'application");
	} catch (SecurityException e) {
	e.printStackTrace();
	} catch (IOException e) {
	e.printStackTrace();
	}
	}
	}
