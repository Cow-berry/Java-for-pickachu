
public class JamesBondCar extends Car 
{
	public int drive(int howlong)
	{
		distance = howlong*180;
		System.out.println("Поехали спаать мир. Ближайший враг в " + distance + " километров.");
		return distance;
	}

}
