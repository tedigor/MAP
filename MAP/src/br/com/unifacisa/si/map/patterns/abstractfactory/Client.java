package br.com.unifacisa.si.map.patterns.abstractfactory;

public class Client {
	public static void main(String[] args) {
		FabricaDeCarro fiat = new FabricaFiat();
		FabricaDeCarro ford = new FabricaFord();
		
		CarroSedan fordSedan = ford.criarCarroSedan();
		CarroSedan fiatSedan = fiat.criarCarroSedan();
		
		CarroPopular fordPopular = ford.criarCarroPopular();
		CarroPopular fiatPopular = fiat.criarCarroPopular();
		
		fordSedan.exibirInfoSedan();
		fiatSedan.exibirInfoSedan();
		fordPopular.exibirInfoPopular();
		fiatPopular.exibirInfoPopular();
	}
}
