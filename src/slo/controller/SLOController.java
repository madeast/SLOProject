package slo.controller;
import slo.view.SLOPopupDisplay;

public class SLOController
{
	
	private SLOPopupDisplay myDisplay;
	
	public SLOController()
	{
		myDisplay = new SLOPopupDisplay();
	}
	public void start()
	{
		myDisplay.showResponse("My name is Kazame");
		int myEyes;
		myEyes = 32;
		
		if(myEyes == 32)
		{
			myDisplay.showResponse("I have " + myEyes + " eyes");
		}
		else
		{
			myDisplay.showResponse("I have one hundred forty fingers");
		}
		
		double myHair;
		myHair = 52.5;
		if(myHair == 52.5)
		{
			myDisplay.showResponse("I have " + myHair + " strands of hair");
		}
		else
		{
			myDisplay.showResponse("I have four hundred legs");
		}
		
	}
}
