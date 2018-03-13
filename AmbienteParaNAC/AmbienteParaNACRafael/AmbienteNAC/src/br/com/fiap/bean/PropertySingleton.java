package br.com.fiap.bean;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertySingleton {

	//D://Tendeu//ExercicioRefacotring
	
	private static Properties p;
	private static final String ARQ = "/arquivo.properties";
	
	//Abrindo arquivo
	public static Properties getInstance() {
		
		if (p == null){
			
			try {
				
				p = new Properties();
				
				FileInputStream input = new FileInputStream("arquivo.properties");
				p.load(input);
				
				//p.load(PropertySingleton.class.getResourceAsStream(ARQ));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return p;
	}
}
