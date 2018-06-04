import java.util.ArrayList;

/**
 * ReorderedMultitap works similar to Multitap, except there
 * is a new char array used. This was crafted with the intent of
 * using predictive text.
 *
 * @author sosaedison
 * @author Zac Pike
 */
public class ReorderedMultitap extends Multitap {

    /**
     Counter for total number of presses
     */
    private int presses= 0;
    /**
     How we index through all arrayLists
     */
    private int index = 0;

    /**
     where we store the last thing on the display
     */
    private String oldText = "";
    /**
     If shift was clicked
     */
    private boolean isUppercase = false;
    /**
     If we should add text to the display
     */
    private boolean append = false;
    /**
     Holds the value of the last key
     */
    private int lastKeyPressed = -1;

    /**
     For readability | holds the shift key integer
     */
    private final int SHIFT =10;
    /**
     ArrayList of Character ArrayLists for each key with letters
     */
    private ArrayList<ArrayList<Character>> orderedDictionary = new ArrayList<>();
    /**
     Character array that holds the reordered list of the alphabet
     */
    private char chars[] = new char[]{'a','c','b','e','d','f','i','h','g','l','k','j','o','n','m'
            ,'s','r','p','q','t','u','v','w','y','x','z'};

    /**
     * Constructor for Reordered simply calls the method that fills our parent arrayList
     */
    public ReorderedMultitap() {
        fillAlphabet(this.chars);
    }

    /**
     * Checks the bounds of the index variable. Keeps index from going
     * out of bounds when indexing through. We use the int Key
     * @param key the key being pressed
     */
    private void boundsChecker(int key) {

        ArrayList<Character> temp = new ArrayList<>();
        for (int i = 2; i < 10; i++) {
            if (key == i) {
                temp = orderedDictionary.get(i-2);// The Arraylist of the key that was pressed
            }

        }
        //Reset the index as to start from the beginning again.
        if (this.index >= temp.size()) {
            this.index = 0;
        }
    }
    /**
     * This method controls the flow of how we handle buttons being pressed.
     * Looping through and storing the arraylist in a temp and pulling the right
     * character from it and appending it to the display.
     *
     * @param key the key being pressed
     * @param text the text on the display
     * @return the new text for the display
     */
    protected String updatedDisp(int key, String text) {
        String ret = ""; // the string we return
        ArrayList<Character> temp = new ArrayList<>(); // temp arraylist of characters for the key

        //toggle for shift
        if(key == SHIFT) {
            System.out.println(isUppercase);
            isUppercase = !isUppercase;
            System.out.println(isUppercase);
            return text;
        }
        //Space Key
        if ( key == 11) {
            oldText = text + " ";
            ret = oldText;
            isUppercase = false;
            return ret;
        } else if (key == 1 || key == 0) { // The 1 key or the "Next" key
            oldText = text;
            ret = oldText + "";
            isUppercase = false;
            return ret;
        }

        // The key being passed has to be a function key
        for (int i = 2; i < 10; i++) {
            if (key == i) {
                temp = orderedDictionary.get(i - 2); // find its arrayList
            }
        }

        try {
            if(key > 11) {

            }
        } catch (IllegalArgumentException e) {
            return text;
        }

        // Check if we've pressed a new key
        if(this.lastKeyPressed != key) {
            index = 0; //reset the index number for the next function key
            if (this.lastKeyPressed < 0) {
                this.lastKeyPressed = key;
            }else {//the key being pressed has changed to add the last text and store the next key
                append = true;
                oldText = text;
                this.lastKeyPressed = key;//Here?
            }
        }

        // Add the uppercase character
        if (isUppercase) {
            String upperCase = String.valueOf(temp.get(index)).toUpperCase();
            if (append) { // it was a different key, add it to the screen permanently
                oldText = text;
                ret = text + upperCase;
                index++;
                return ret;
            } else { // it was the same key being pressed, no need to add it yet
                ret = oldText + upperCase;
                index++;
                return ret;
            }
        } else {
            if (append) {// it was a different key, add it to the screen permanently
                oldText = text;
                ret = text + temp.get(index);
                index++;
                return ret;
            } else {// it was the same key being pressed, no need to add it yet
                try {
                    ret = oldText + temp.get(index);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Something bad happened");
                    return text;
                }
                index++;
                return ret;
            }
        }

    }

    /**
     * Fills the smaller arrayLists with appropriate characters
     * @param chars array of Characters
     */
    private void fillAlphabet(char[] chars) {
        int charsSpot = 0; // holds spot in the character array

        //Mini ArrayLists for each character key on the keypad
        ArrayList<Character> key_2 = new ArrayList<>();
        ArrayList<Character> key_3 = new ArrayList<>();
        ArrayList<Character> key_4 = new ArrayList<>();
        ArrayList<Character> key_5 = new ArrayList<>();
        ArrayList<Character> key_6 = new ArrayList<>();
        ArrayList<Character> key_7 = new ArrayList<>();
        ArrayList<Character> key_8 = new ArrayList<>();
        ArrayList<Character> key_9 = new ArrayList<>();

        // Adding the characters to the arrayLists
        key_2.add(chars[charsSpot]);
        charsSpot++;
        key_2.add(chars[charsSpot]);
        charsSpot++;
        key_2.add(chars[charsSpot]);
        charsSpot++;

        key_3.add(chars[charsSpot]);
        charsSpot++;
        key_3.add(chars[charsSpot]);
        charsSpot++;
        key_3.add(chars[charsSpot]);
        charsSpot++;

        key_4.add(chars[charsSpot]);
        charsSpot++;
        key_4.add(chars[charsSpot]);
        charsSpot++;
        key_4.add(chars[charsSpot]);
        charsSpot++;

        key_5.add(chars[charsSpot]);
        charsSpot++;
        key_5.add(chars[charsSpot]);
        charsSpot++;
        key_5.add(chars[charsSpot]);
        charsSpot++;

        key_6.add(chars[charsSpot]);
        charsSpot++;
        key_6.add(chars[charsSpot]);
        charsSpot++;
        key_6.add(chars[charsSpot]);
        charsSpot++;

        key_7.add(chars[charsSpot]);
        charsSpot++;
        key_7.add(chars[charsSpot]);
        charsSpot++;
        key_7.add(chars[charsSpot]);
        charsSpot++;
        key_7.add(chars[charsSpot]);
        charsSpot++;

        key_8.add(chars[charsSpot]);
        charsSpot++;
        key_8.add(chars[charsSpot]);
        charsSpot++;
        key_8.add(chars[charsSpot]);
        charsSpot++;

        key_9.add(chars[charsSpot]);
        charsSpot++;
        key_9.add(chars[charsSpot]);
        charsSpot++;
        key_9.add(chars[charsSpot]);
        charsSpot++;
        key_9.add(chars[charsSpot]);


        //Adding the ArrayLists to the orderedAlphabet
        this.orderedDictionary.add(key_2);
        this.orderedDictionary.add(key_3);
        this.orderedDictionary.add(key_4);
        this.orderedDictionary.add(key_5);
        this.orderedDictionary.add(key_6);
        this.orderedDictionary.add(key_7);
        this.orderedDictionary.add(key_8);
        this.orderedDictionary.add(key_9);
    }

    /**
     * Gets the number of presses
     * @return The number of presses
     */
    public int getNumPresses() {
        return presses;
    }

    /**
     * Gets the right string to return to the keyPad
     * @param text the text on the display
     * @param key the key being pressed
     * @return the new display for the keypad
     */
    public String append(String text, int key) {
        presses++;
        append = false;
        boundsChecker(key);
        return updatedDisp(key, text);
    }
}
