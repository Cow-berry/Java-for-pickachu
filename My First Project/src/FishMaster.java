
public class FishMaster extends Fish 
{
	public static void main(String[] args)
	{ 
		Fish myFish = new Fish();
		String Response = myFish.say("Привет");
		System.out.println (Response);
		myFish.dive(50);
		myFish.dive(51);
		myFish.sleep();
	}
}
