/***************************************************************************************************************
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 11/09/2018
 * FileName     : AudioPlayer.java
 * Source		: Code written based on specifications provided in Oracle Academy's OraclProduction document. 
 * 				  All rights for the document and specifications belong to Oracle.
 * Description  : This is a subclass of Product and implememtns the interface MultimediaControl. 
 * 				  This class sets details and functions of an audio player product.
 **************************************************************************************************************/

package bysteps;

//It sets characteristics and functions of an audio player product.
public class AudioPlayer extends Product implements MultimediaControl {

	//instance variable to hold a String specification of an audio item (
	private String audioSpecification;
	
	//instance variable to set the item's type to AUDI (from ItemType class)
	private ItemType mediaType;
	
	  /**
     * This constructor sets the name and the specifications of an audio product to local variables.
     * @param: name. It is the name of the audio product.
     * @param: audioSpecs. It is the audio product specs.
     */
	public AudioPlayer(String name, String audioSpecs) {
		super(name);							//use object name from a superclass Product
		audioSpecification = audioSpecs;
		mediaType = ItemType.AUDIO;				//set media type to audio (Audio)
	}

	@Override
	public void play() {
		System.out.println("Playing");				//to emulate the item's play function
	}

	@Override
	public void stop() {
		System.out.println("Stopping");				//to emulate the item's stop function
	}

	@Override
	public void previous() {
		System.out.println("Previous");			//to emulate the item's previous function
	}

	@Override
	public void next() {
		System.out.println("Next");				//to emulate the item's next function
	}

	@Override
	//to display Audio player items information
	public String toString() {
		return
				super.toString() + "\n"+
				"Audio Spec : " + audioSpecification + "\n"+
				"Type : " + mediaType;
	}
}//end of AudioPlayer class
