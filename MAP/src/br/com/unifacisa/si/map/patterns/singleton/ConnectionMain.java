package br.com.unifacisa.si.map.patterns.singleton;

public class ConnectionMain {
	public static void main(String[] args) {
		System.out.println(Connection.getInstance());
		System.out.println(Connection.getInstance());
		System.out.println(Connection.getInstance());
		System.out.println(Connection.getInstance());
	}
}
