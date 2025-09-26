package guvi1;

public class collegeclass {
	public int id;
	public float english,maths,avg;
	public String name;
	public collegeclass(int id, float english, float maths, String name) {
		this.name=name;
		this.id=id;
		this.english=english;
		this.maths=maths;
	}
	public void avg() {
		avg=(float)((english/maths)/2.0);
	}
}
