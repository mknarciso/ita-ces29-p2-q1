package web;

public class Customer {
	private boolean isSailor,experiencedWithComputers,buysALot;
	public static enum type{HardCore,Novice,NonSailing}
	public Customer(type hardcore) {
		isSailor = true;
		experiencedWithComputers = false;
		buysALot = true;
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
}
