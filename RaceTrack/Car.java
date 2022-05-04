import RaceTrack.*;
class Car
{
	private int year;
	private String make;
	private double speed;
	
	Car(int a, String b, double c)
	{
		this.year=a;
		this.String=b;
		this.speed=c;
	}


	public int getYear()
	{
		return this.year;
	}
	
	public String getMake()
	{
		return this.make;
	}
	
	public double getSpeed()
	{
		return this.speed;
	}
	
	void accelerate()
	{
		speed= speed + 1;
		System.out.println(getSpeed());
	}
}