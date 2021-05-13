package ro.ase.acs.observer.clase;

public class Client implements Observer {

	private String name;
	
	public Client(String name) {
		super();
		this.name = name;
	}

	@Override
	public void receptioneazaMesaj(String mesaj) {
		System.out.println(name + " ai primit mesajul: " + mesaj);
	}

}
