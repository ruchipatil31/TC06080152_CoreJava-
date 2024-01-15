package session_04;

public class Date {

	private int dd,mm,yy;
	
	public Date() {}

	public Date(int dd, int mm, int yy) {

		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	
	
	
	
}
