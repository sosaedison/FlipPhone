import java.util.HashMap;

/**
 *
 *
 *
 *
 * @author sosaedison
 */
public class ReorderedMultitap extends Multitap {

    private int presses=0;
    private int key;
    private int index2 =0;
    private int index3 = 3;
    private int index4 = 6;
    private int index5 = 9;
    private int index6 = 12;
    private int index7 = 15;
    private int index8 = 19;
    private int index9 = 22;


    private String oldText ="";

    private char chars[] = new char[]{'a','c','b','e','d','f','i','h','g','l','k','j','o','n','m'
            ,'s','r','p','q','t','u','v','w','y','x','z'};


    public String append(String text, int key) {
        presses++;
        boolean isUppercase = false;
        boolean append = false;


        if(this.key != key) {
            if(key == 10){
                System.out.println("Switched BOI");
                isUppercase = true;
            } else {
                oldText = text;
                append = true;
                System.out.println(this.key);
                this.key = key;
            }
        } else {

        }

        if (key == 1) {

        }else if (key == 2) {

            if(isUppercase){
                String shift = String.valueOf(chars[index2]).toUpperCase();
                if (index2>2){
                    index2=0;
                }
                if (append) {
                    String ret = text + shift;
                    index2++;
                    return ret;
                } else {
                    String ret = oldText + shift;
                    index2++;
                    return ret;
                }
            } else {
                System.out.println("index" + index2);
                if (index2 > 2) {
                    index2 = 0;
                }
                if (append) {
                    String ret = text + chars[index2];
                    index2++;
                    return ret;
                } else {
                    String ret = oldText + chars[index2];
                    index2++;
                    return ret;
                }
            }
        }else if (key == 3) {
            if(isUppercase){
                String shift = String.valueOf(chars[index3]).toUpperCase();
                if (index3>5){
                    index3=3;
                }
                if (append) {
                    String ret = text + shift;
                    index3++;
                    return ret;
                } else {
                    String ret = oldText + shift;
                    index3++;
                    return ret;
                }
            } else {
                System.out.println("index" + index3);
                if (index3 > 5) {
                    index3 = 3;
                }

                if (append) {
                    String ret = text + chars[index3];
                    index3++;
                    return text + chars[index3];
                } else {
                    String ret = oldText + chars[index3];
                    index3++;
                    return oldText + chars[index3];
                }
            }
        }else if (key == 4) {

            if(isUppercase){
                String shift = String.valueOf(chars[index4]).toUpperCase();
                if (index4>8){
                    index4=6;
                }
                if (append) {
                    String ret = text + shift;
                    index4++;
                    return ret;
                } else {
                    String ret = oldText + shift;
                    index4++;
                    return ret;
                }
            } else {
                System.out.println("index" + index4);
                if (index4 > 8) {
                    index4 = 6;
                }
                if (append) {
                    String ret = text + chars[index4];
                    index4++;
                    return ret;
                } else {
                    String ret = oldText + chars[index4];
                    index4++;
                    return ret;
                }
            }
        }else if (key == 5) {

            if(isUppercase){
                String shift = String.valueOf(chars[index5]).toUpperCase();
                if (index5>11){
                    index5=9;
                }
                if (append) {
                    String ret = text + shift;
                    index5++;
                    return ret;
                } else {
                    String ret = oldText + shift;
                    index5++;
                    return ret;
                }
            } else {
                System.out.println("index" + index5);
                if (index5 > 11) {
                    index5 = 9;
                }
                if (append) {
                    String ret = text + chars[index5];
                    index5++;
                    return ret;
                } else {
                    String ret = oldText + chars[index5];
                    index5++;
                    return ret;
                }
            }
        }else if (key == 6) {

            if(isUppercase){
                String shift = String.valueOf(chars[index6]).toUpperCase();
                if (index6>14){
                    index6=12;
                }
                if (append) {
                    String ret = text + shift;
                    index6++;
                    return ret;
                } else {
                    String ret = oldText + shift;
                    index6++;
                    return ret;
                }
            } else {
                System.out.println("index" + index6);
                if (index6 > 14) {
                    index6 = 12;
                }
                if (append) {
                    String ret = text + chars[index6];
                    index6++;
                    return ret;
                } else {
                    String ret = oldText + chars[index6];
                    index6++;
                    return ret;
                }
            }
        }else if (key == 7) {

            if(isUppercase){
                String shift = String.valueOf(chars[index7]).toUpperCase();
                if (index7>18){
                    index7=15;
                }
                if (append) {
                    String ret = text + shift;
                    index7++;
                    return ret;
                } else {
                    String ret = oldText + shift;
                    index7++;
                    return ret;
                }
            } else {
                System.out.println("index" + index7);
                if (index7 > 18) {
                    index7 = 15;
                }
                if (append) {
                    String ret = text + chars[index7];
                    index7++;
                    return ret;
                } else {
                    String ret = oldText + chars[index7];
                    index7++;
                    return ret;
                }
            }
        }else if (key == 8) {

            if(isUppercase){
                String shift = String.valueOf(chars[index8]).toUpperCase();
                if (index8>21){
                    index8=19;
                }
                if (append) {
                    String ret = text + shift;
                    index8++;
                    return ret;
                } else {
                    String ret = oldText + shift;
                    index8++;
                    return ret;
                }
            } else {
                System.out.println("index" + index8);
                if (index8 > 21) {
                    index8 = 19;
                }
                if (append) {
                    String ret = text + chars[index8];
                    index8++;
                    return ret;
                } else {
                    String ret = oldText + chars[index8];
                    index8++;
                    return ret;
                }
            }
        }else if (key == 9) {

            if(isUppercase){
                String shift = String.valueOf(chars[index9]).toUpperCase();
                if (index9>26){
                    index9=22;
                }
                if (append) {
                    String ret = text + shift;
                    index9++;
                    return ret;
                } else {
                    String ret = oldText + shift;
                    index9++;
                    return ret;
                }
            } else {
                System.out.println("index" + index9);
                if (index9 > 26) {
                    index9 = 22;
                }
                if (append) {
                    String ret = text + chars[index9];
                    index9++;
                    return ret;
                } else {
                    String ret = oldText + chars[index9];
                    index9++;
                    return ret;
                }
            }
        } else if(key == 0) {
            return oldText + " ";
        } else if(key == 11) {
            return oldText + " ";
        } else {
            return text;
        }
        char temp[] = new char[]{};
        return null;
    }

    public int getNumPresses() {
        return presses;
    }
}
