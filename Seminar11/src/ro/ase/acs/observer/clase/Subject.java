package ro.ase.acs.observer.clase;

public interface Subject {

	void adaugareAbonat(Observer observer);
	void stergeAbonat(Observer observer);
	void trimiteMesaj(String mesaj);
}
