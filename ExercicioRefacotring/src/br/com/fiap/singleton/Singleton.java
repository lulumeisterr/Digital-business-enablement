package br.com.fiap.singleton;

import br.com.fiap.bean.PropertySingleton;

public class Singleton {

	public static void main(String[] args) {
		
		PropertySingleton p = new PropertySingleton();
		System.out.println(PropertySingleton.getInstance().getProperty("NOMEFILIAL"));
	
	}
	
}
