package gyak6;

public class gyak6 {
	
	//téglalap osztály
	private int aside;
	private int bside;
	
	public gyak6(int aside,int bside) {
		
		this.aside=aside;
		this.bside=bside;
		
	}
	
	public gyak6(int sides) {
		
		this.aside=sides;
		this.bside=sides;
		
	}
	
	public int getArea() {
		
		return aside*bside;
		
	}

	@Override
	public String toString() {
		return  aside + ","+ bside+":" + getArea();
	}

	public int getAside() {
		return aside;
	}

	public void setside(int aside,int bside) {
		this.aside = aside;
		this.bside=bside;
	}

	public int getBside() {
		return bside;
	}

	public void setBothside(int sides) {
		this.bside = sides;
		this.aside=sides;
	}
	
	
	
	public boolean bigger(gyak6 rectangle) {
		
		if(this.getArea()>rectangle.getArea()) {
			return true;
		}
		else return false;
		
	}
	
	public boolean equal(gyak6 rectangle) {
		
		if(this.getAside()==rectangle.getAside()&&this.getBside()==rectangle.getBside()) {
			return true;
		}
		else return false;
		
	}
	
	
	
	
	
	

}
