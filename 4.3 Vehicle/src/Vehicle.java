/*
1. Write a simple Vehicle class that has fields for (at least) current speed, current direction in degrees, and owner name.
2. Add a static field to your Vehicle class for the highest Vehicle Identification Number issued, and a non-static field that holds each vehicle's ID number.
3. Write a main method for your Vehicle class that creates a few vehicles and prints out their field values. Note that you can also write a separate tester program as well.
4. Add two constructors to Vehicle. A no-arg constructor and one that takes an initial owner's name. Modify the tester program from the previous step and test your design.
5. Make the fields in your Vehicle class private, and add accessor methods for the fields. Which fields should have methods to change them and which should not?
6. Add a changeSpeed method that changes the current speed of the vehicle to a passed-in value, and a stop method that sets the speed to zero.
7. Add two turn methods to Vehicle. One that takes a number of degrees to turn, and one that takes simply either a Vehicle.TURN_LEFT or a Vehicle.TURN_RIGHT constant. Define the two constants accordingly.
8. Add a static method to Vehicle that returns the highest identification number used so far.
9. Add a toString method to Vehicle.
10. Now Test all of the above in a main method that will be in saperate class.*/

public class Vehicle {
	
	private int cspeed,cdirection;
	private String owner;
	private static int highestvid=1000;
	
	public static int getHighestvid()
	{
		return highestvid-1;
	}
	
	private int vehiID;
	
	protected static final int TURN_LEFT=0;
	protected static final int TURN_RIGHT=1;
	
	public Vehicle()
	{
		vehiID=highestvid;
		highestvid++;
		owner="Unspecified(Test Car)";
		
	}
	
	public Vehicle(String nameOfOwner)
	{
		this();
		owner=nameOfOwner;
	}
	
	public int getSpeed()
	{
		return cspeed;
	}
	
	public void setSpeed(int cspeed)
	{
		this.cspeed=cspeed;
	}
	
	public int getDirection()
	{
		return cdirection;
	}
	
	public void setDirection(int direction)
	{
	 cdirection=direction;
	 if(cdirection<0)
		 cdirection+=360;
	 cdirection %= 360;
	}
	
	public void stop()
	{
		setSpeed(0);
	}
	
	public void turnSide(int sd)
	{
		setDirection((sd==0)?((cdirection-90)%360):((cdirection+90)%360));
		
	}
	
	public String toString()
	{
		return "Vehicle [cspeed=" + cspeed + ", direction=" +cdirection+ ", Owner Name=" +owner+ ", VehicleID=" +vehiID + "]";
		
	}
	
	
	
	
	
	
	

}
