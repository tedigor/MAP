package br.com.unifacisa.si.map.patterns.factorymethod;

public class CarroFactory {
	
	public Carro montarCarro(String marca, String modelo) {
		if(marca.equals("Ford")) {
			return new Ford(modelo);
		}
		if(marca.equals("Fiat")) {
			return new Fiat(modelo);
		}
		return null;
	}
}
