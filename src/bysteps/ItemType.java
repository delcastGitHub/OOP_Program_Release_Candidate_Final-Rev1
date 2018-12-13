/*************************************************************************************************************
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 11/09/2018
 * FileName     : ItemType.java
 * Source		: Code written based on specifications provided in Oracle Academy's OraclProduction document. 
 * 				  All rights for the document and specifications belong to Oracle.
 * Description  : This class creates an enum to pre-set 4 types of items: audio, visual, audio mobile, visual mobile.
 ************************************************************************************************************/

package bysteps;

// It creates an enum to pre-set 4 types of items: audio, visual, audio mobile, visual mobile.
public enum ItemType {

	AUDIO("AU"), 			// audio type
	VISUAL("VI"), 		// visual type
	Audio_Mobile("AM"),	// audio mobile type
	Visual_Mobile("VM"); 	// visual mobile type

	//instance fields
	public final String code;
	
	//enum consructor
	ItemType(String code){
		this.code = code;
	}	
}//end of ItemType






