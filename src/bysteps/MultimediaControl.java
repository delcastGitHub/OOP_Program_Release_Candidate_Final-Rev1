/*************************************************************************************************************
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 11/09/2018
 * FileName     : MultimediaControl.java
 * Source		: Code written based on specifications provided in Oracle Academy's OraclProduction document. 
 * 				  All rights for the document and specifications belong to Oracle.
 * Description  : Interface that defines the following methods.
 ************************************************************************************************************/

package bysteps;

//Interface that contains all item's functions.
public interface MultimediaControl {

	//It emulates the item's play function.
	public void play();
	
	//It emulates the item's stop function.
	public void stop();
	
	//It emulates the item's previous function.
	public void previous();
	
	//It emulates the item's next function.
	public void next();
}
