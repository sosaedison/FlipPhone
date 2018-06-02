/**
 *
 * This method will be used to control the keypad the way it was initially designed
 * with older flip phones. By pressing keys on the keypad, the user will be able to
 * select characters to create messages (old school texting). With each press of the
 * keys, the user can select the desired letter (i.e. the #2 key contains letters: a,
 * b, and c). Pressing once would get you a lower-case "a", twice a lower-case "b", and
 * three times a lower-case "c". The shift key will be used to get upper-case letters.
 *
 * @author Zac Pike
 */

import java.util.*;

public class Multitap implements Pressable {
	
	private int presses = 0;  // Counter for total number of presses for each key.
//	/**
//	* Accessor for returning the total number of presses.
//	* @return Total number of presses
//	*/
	public int getNumPresses() { return presses; }
	
	/**
	*This method is invoked by the keypad whenever a key is
	* pressed.  It's passed the entire contents of the display
	* along with the number of the pressed key.  We just tack
	* a new character onto the display's text and return the
	* new string.
	* @param txt  The text entered by the keypad so far
	* @param key  The letter of the key that's been pressed
	* @param return  Updated text for the display
	*/
	public String append(String text, int key) {
		if(this.key != key) {
			this.key = key;
		}
	    return null;
	}
	
    private int key;
    
    private char chars[] = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o'
    ,'p','q','r','s','t','u','v','w','x','y','z'};

}//Multitap
