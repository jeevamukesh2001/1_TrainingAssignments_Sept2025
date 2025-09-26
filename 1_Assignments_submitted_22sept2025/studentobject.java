package guvi1;

public class studentobject {
	
	public static void main(String[] args) {
		studentclass jeeva = new studentclass();
		jeeva.name="Jeeva Mukesh";
		jeeva.maths=90;
		jeeva.ad=95;
		jeeva.iot=85;
		jeeva.average();
		System.out.println(jeeva.name+" "+jeeva.maths+" "+jeeva.ad+" "+jeeva.iot+" "+jeeva.avg);
		
		studentclass mani = new studentclass();
		mani.name="Manikandan";
		mani.maths=80;
		mani.ad=75;
		mani.iot=95;
		mani.average();
		System.out.println(mani.name+" "+mani.maths+" "+mani.ad+" "+mani.iot+" "+mani.avg);
	}
	
}
