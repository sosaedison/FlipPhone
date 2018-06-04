import java.util.ArrayList;

/**
 * Reordered
 * @author sosaedison
 * @author Zac Pike
 */
public class ReorderedMultitap extends Multitap {

    private int presses=0;
    private int lastKeyPressed;
    private boolean append;
    private int index = 0;
    private char chars[] = new char[]{'a','c','b','e','d','f','i','h','g','l','k','j','o','n','m'
            ,'s','r','p','q','t','u','v','w','y','x','z'};
    private ArrayList<ArrayList<Character>> orderedDictionary = new ArrayList<>();


    public ReorderedMultitap() {
        super.fillAlphabet(this.chars);
    }


    public int getNumPresses() {
        return presses;
    }

    public String append(String text, int key) {
       return super.append(text, key);
    }
}
