package web;

public class Customer {
	private int id;
	private boolean isSailor,experiencedWithComputers,buysALot;
	public static enum type{HardCore,Novice,NonSailing}
	public Customer(type level) {
		switch(level){
		case HardCore:
			isSailor = true;
			experiencedWithComputers = false;
			buysALot = true;
			break;
		case Novice:
			isSailor = true;
			experiencedWithComputers = true;
			buysALot = false;
			break;
		default:
			isSailor = false;
			experiencedWithComputers = true;
			buysALot = false;
			break;
		}
	}
	public boolean isExperiencedWithComputers() {
		return experiencedWithComputers;
	}
	public boolean isSailor() {
		return isSailor;
	}
	public boolean buysALot() {
		return buysALot;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
