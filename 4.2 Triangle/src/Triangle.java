//Write a class called Triangle that can be used to represent a triangle.
// It should include the following methods that return boolean values indicating if the particular property holds:

//isRight (a right triangle)
//isScalene (no two sides are the same length)
//isIsosceles (exactly two sides are the same length)
//isEquilateral (all three sides are the same length)
//Write a simple tester program that creates a few triangles and asks them about their type.

public class Triangle {
	
	private int side1,side2,side3;
	
	void setVal(int a,int b,int c) {
		
		side1=a;
		side2=b;
		side3=c;
	}
	
	boolean isright()
	{
		if((side1*side1)==((side2*side2)+(side3*side3)))
			return true;
		else if((side2*side2)==((side1*side1)+(side3*side3)))
			return true;
		else if((side3*side3)==((side2*side2)+(side1*side1)))
			return true;
		else 
			return false;
		
	}
	
	boolean isScalene()
	{
		if(side1!=side2 && side2!=side3)
		return true;
		else
			return false;
	}
	
	boolean isIsoceles()
	{
		if(side1==side2 && side1!=side3)
			return true;
		else if(side1==side3 && side1!=side2)
			return true;
		else if(side2==side3 && side2!=side1)
			return true;
		else
			return false;
	}
	
	boolean isEquilateral()
	{
		if(side1==side2 && side2==side3)
			return true;
		else
			return false;
	}
     
	int getValue()
	{
		if(isright())
			return 1;
		else if(isScalene())
			return 2;
		else if(isIsoceles())
			return 3;
		else if(isEquilateral())
			return 4;
		else return 0;
		
		
		
	}
}
