
public class Car 
{
	int distance;
	
	public void start()
	{
		System.out.println("Поехали!");
	}
	public void stop()
	{
		System.out.println("Тпру! Машинка. Тпру!");
	}
	public int drive(int howlong)
	{
		distance = howlong*60;
		System.out.println("Поехали на запраку. Ближайшая в " + distance + " километров.");
		return distance;
	}
	

}
