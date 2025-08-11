package Lec_30;

public class Processor {
	private String name;
	private int cores;
	private int clockspeed;
	
	Processor(){
		
	}
	
	public Processor(String name, int cores, int clockspeed) {
		super();
		this.name = name;
		this.cores = cores;
		this.clockspeed = clockspeed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCores() {
		return cores;
	}
	public void setCores(int cores) {
		this.cores = cores;
	}
	public int getClockspeed() {
		return clockspeed;
	}
	public void setClockspeed(int clockspeed) {
		this.clockspeed = clockspeed;
	}
	
	
	public String toString() {
		return name;
	}
}
