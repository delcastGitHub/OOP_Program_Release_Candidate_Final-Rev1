/*************************************************************************************************************
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 11/09/2018
 * FileName     : Screen.java
 * Source		: Code written based on specifications provided in Oracle Academy's OraclProduction document. 
 * 				  All rights for the document and specifications belong to Oracle.
 * Description  : This class implements ScreenSpec interface, and it allows us to capture details of screen product. 				  
 ************************************************************************************************************/

package bysteps;


//it sets details of a screen product. 	
public class Screen implements ScreenSpec {

	//instance variable to hold a String resolution specification of a screen
	private String screenResolution;
	
	//instance variable to hold a int refresh rate value of a screen
	private int screenRefreshRate;
	
	//instance variable to hold a int response time value of a screen
	private int screenResponseTime;
	
    /**
     * This constructor set the screen specification (resolution, refresh rate and response time) to local variables.
     * @param: screenResolution. It is the screen resolution of the product.
     * @param: refreshRate. It is the regresh rate of the screen of the product.
     * @param: responsetime. It is the response time of the screen of the procut.
     */
	public Screen (String screenResolution, int screenRefreshRate, int screenResponseTime) {
	
		this.screenResolution = screenResolution;
		this.screenRefreshRate = screenRefreshRate;
		this.screenResponseTime = screenResponseTime;	
	}
	
	@Override
	public String getResolution() {
		return this.screenResolution;
	}

	@Override
	public int getRefreshRate() {
		return this.screenRefreshRate;
	}

	@Override
	public int getResponseTime() {
		return this.screenResponseTime;
	}
	
	/**
     *toString method will print  the screen's information.
     *@return: information about the screen: resolution, refresh rate, and response time.
     */
	public String toString() {
		
		return
				"Resolution : " + this.screenResolution + "\n"+
				"Refresh rate : "	+ this.screenRefreshRate + "\n"+
				"Response time : "	+ this.screenResponseTime;				
	}//end of toString
} // end of class Screen
