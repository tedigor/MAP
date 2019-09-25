package br.com.unifacisa.si.map.patterns.factorymethod;

public class Ford extends Carro {
	
	public Ford(String modelo) {
		super("Ford", modelo);
		System.out.println(getMarca() + " " + getModelo() + ", marca pioneira em automóveis!");		
	}
}
