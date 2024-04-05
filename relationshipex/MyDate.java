package relationshipex;

public class MyDate {

	int dd,mm,yy;
	public MyDate() {
		dd=2;
		mm=2;
		yy=1990;
	}
	public MyDate(int dd,int mm, int yy) {
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		
		
	}
	public void display() 
	{
		System.out.println(dd+"-"+mm+"-"+yy);
	}
}
