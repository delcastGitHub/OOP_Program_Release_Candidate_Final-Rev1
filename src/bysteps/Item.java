/*************************************************************************************************************
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 11/09/2018
 * FileName     : Item.java
 * Source		: Code written based on specifications provided in Oracle Academy's OraclProduction document. 
 * 				  All rights for the document and specifications belong to Oracle.
 * Description  : Interface to force all clases that implements this interface to add the following funtions.
 *************************************************************************************************************/

package bysteps;

import java.util.Date;

// Interface that contains all item's functions.
public interface Item {

	//String named manufacturerConst as an instance variable set to "oracleProduction"
	public final String manufacturerConst="OracleProduction";
	
	/**
     * This method sets the item's production number that will be used to generate a unique serial number.
     * @param: productionNumber. It is the production number
     */
	public void setProductionNumber (int prodNumber);
	
	/**
     * This method sets the name of the Item.
     * @param:itemName, the item's name
     */
	public void setName(String name);

	/**
     * This method gets the item's name.
     * @return: the item's name 
     */
	public String getName();
	
	/**
     * This method gets the manufacture's date of of the ite.
     * @return: the date when the item was manufactured
     */
	public Date getManufactureDate();
	
	/**
     * This method gets the serial number of the item.
     * @return: the serial number of an item
     */
	public int getSerialNumber ();
	
} //end of Item interface
