package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	static int nbDigitalVideoDiscs = 0;
	private int Id;
	
	public DigitalVideoDisc() {
		super();
		nbDigitalVideoDiscs++;
		this.Id = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		nbDigitalVideoDiscs++;
		this.Id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbDigitalVideoDiscs++;
		this.Id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDiscs++;
		this.Id = nbDigitalVideoDiscs;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return Id;
	}
	public int getnb() {
		return nbDigitalVideoDiscs;
	}
	public String toString() {
		String str = this.Id + ". " + "DVD - " + this.title + " - " + this.category + " - " + this.director + " - " + this.length + ": " + this.cost;
		return str;
	}
	public boolean isMatch(String title) {
		return this.title == title;
	}
	public boolean isMatch(int Id) {
		return this.Id == Id;
	}
}