/**
 * How we interface with pressable classes on the KeyPad
 *
 * @author sosaedison
 * @author Zac Pike
 */
public interface Pressable {


    public String append(String text, int key);

    public int getNumPresses();
}
