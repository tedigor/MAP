package br.com.unifacisa.si.map.patterns.factorymethod;

public class Fiat extends Carro {

	public Fiat(String modelo) {
		super("Fiat", modelo);
		System.out.println(getMarca() + " " + getModelo() + ", seu fiat, sua vida!");
	}
}
