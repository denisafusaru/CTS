package ro.ase.cts.clase;

public class Fundatie {
	
	private String denumire;
	private int vechime;
	private double sumaDonatii;
	
	private static Fundatie fundatie = null;
	
	private Fundatie(String denumire, int vechime, double sumaDonatii) {
		super();
		this.denumire = denumire;
		this.vechime = vechime;
		this.sumaDonatii = sumaDonatii;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public void setVechime(int vechime) {
		this.vechime = vechime;
	}

	public void setSumaDonatii(double sumaDonatii) {
		this.sumaDonatii = sumaDonatii;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fundatie [denumire=");
		builder.append(denumire);
		builder.append(", vechime=");
		builder.append(vechime);
		builder.append(", sumaDonatii=");
		builder.append(sumaDonatii);
		builder.append("]");
		return builder.toString();
	}
	
	public static  synchronized Fundatie getInstance(String denumire, int vechime, double suma) {
		if(fundatie==null){
			fundatie = new Fundatie(denumire,vechime,suma);
		}
		
		return fundatie;
	}
	

}
