package Lec_30;

public class Laptop {
	private String make_and_modle;
	private Processor p;
	private int ram;
	
	
	
	public Laptop(String make_and_modle, Processor p, int ram) {
		super();
		this.make_and_modle = make_and_modle;
		this.p = p;
		this.ram = ram;
	}
	public String getMake_and_modle() {
		return make_and_modle;
	}
	public void setMake_and_modle(String make_and_modle) {
		this.make_and_modle = make_and_modle;
	}
	public Processor getP() {
		return p;
	}
	public void setP(Processor p) {
		this.p = p;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	Laptop(){
		
	}
	Laptop(Processor p){
		this.p=p;
	}
	
	
//	public String toString() {
//		return make_and_modle+" "+ram+" gb "+p+" Ghz";
//	}

}
