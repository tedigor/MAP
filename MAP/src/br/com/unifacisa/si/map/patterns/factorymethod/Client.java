package br.com.unifacisa.si.map.patterns.factorymethod;

public class Client {
	public static void main(String[] args) {
		CarroFactory factory = new CarroFactory();
		
		factory.montarCarro("Ford", "Ka");
		factory.montarCarro("Fiat", "Punto");
	}
}
