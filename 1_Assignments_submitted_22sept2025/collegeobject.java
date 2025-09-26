package guvi1;

public class collegeobject {
	
	public static void main(String[] args) {
		collegeclass jeeva = new collegeclass(1,85,80,"Jeeva");
		jeeva.avg();
		System.out.println(jeeva.id+" "+jeeva.name+" "+jeeva.maths+" "+jeeva.english+" "+jeeva.avg);
		
		collegeclass mani = new collegeclass(2,75,87,"Mani");
		mani.avg();
		System.out.println(mani.id+" "+mani.name+" "+mani.maths+" "+mani.english+" "+mani.avg);
		
		collegeclass sathish = new collegeclass(3,80,89,"Sathish");
		sathish.avg();
		System.out.println(sathish.id+" "+sathish.name+" "+sathish.maths+" "+sathish.english+" "+sathish.avg);
		
		collegeclass michael = new collegeclass(4,85,95,"Michael");
		michael.avg();
		System.out.println(michael.id+" "+michael.name+" "+michael.maths+" "+michael.english+" "+michael.avg);
	}
	
}
