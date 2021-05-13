package ro.ase.cts.memento.clase;

public class Memento {

	private String numeGazda;
	private String numeOaspeti;
	private int nrSpectatori;
	public Memento(String numeGazda, String numeOaspeti, int nrSpectatori) {
		super();
		this.numeGazda = numeGazda;
		this.numeOaspeti = numeOaspeti;
		this.nrSpectatori = nrSpectatori;
	}
	public String getNumeGazda() {
		return numeGazda;
	}
	public void setNumeGazda(String numeGazda) {
		this.numeGazda = numeGazda;
	}
	public String getNumeOaspeti() {
		return numeOaspeti;
	}
	public void setNumeOaspeti(String numeOaspeti) {
		this.numeOaspeti = numeOaspeti;
	}
	public int getNrSpectatori() {
		return nrSpectatori;
	}
	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Memento [numeGazda=");
		builder.append(numeGazda);
		builder.append(", numeOaspeti=");
		builder.append(numeOaspeti);
		builder.append(", nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append("]");
		return builder.toString();
	}

}
