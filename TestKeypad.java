/**
 * This test class creates a new keypad that uses an instance of
 * the Digits class to map key presses to characters (digits). 
 * @author Brad Richards
 * @version 2009.9.13
 */
public class TestKeypad {
   public static void main(String[] args) {
      Keypad charPad = new Keypad(new Multitap(), "MultitapCharacters");
     Keypad charPad2 = new Keypad(new ReorderedMultitap(), "ReorderedMultitapCharacters");
     Keypad digits = new Keypad(new Digits(), "Digits");
   }
}