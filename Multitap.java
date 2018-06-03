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
	private int presses= 0;
	private int index = 0;

    private String oldText = "";
    private boolean isUppercase = false;
    private boolean append = false;
    private int key = 0;
    private final int KEY_2 = 0;
    private final int KEY_3 = 1;
    private final int KEY_4 = 2;
    private final int KEY_5 = 3;
    private final int KEY_6 = 4;
    private final int KEY_7 = 5;
    private final int KEY_8 = 6;
    private final int KEY_9 = 7;
    private char chars[] = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o'
            ,'p','q','r','s','t','u','v','w','x','y','z'};
    private ArrayList<ArrayList<Character>> orderedDictionary = new ArrayList<>();
	public int getNumPresses() { return presses; }

	public Multitap() {
        fillAlphabet(chars);
	}

	protected void fillAlphabet(char[] chars) {
        int charsSpot = 0;

        ArrayList<Character> key_2 = new ArrayList<>();
        ArrayList<Character> key_3 = new ArrayList<>();
        ArrayList<Character> key_4 = new ArrayList<>();
        ArrayList<Character> key_5 = new ArrayList<>();
        ArrayList<Character> key_6 = new ArrayList<>();
        ArrayList<Character> key_7 = new ArrayList<>();
        ArrayList<Character> key_8 = new ArrayList<>();
        ArrayList<Character> key_9 = new ArrayList<>();

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


        orderedDictionary.add(key_2);
        orderedDictionary.add(key_3);
        orderedDictionary.add(key_4);
        orderedDictionary.add(key_5);
        orderedDictionary.add(key_6);
        orderedDictionary.add(key_7);
        orderedDictionary.add(key_8);
        orderedDictionary.add(key_9);

    }

    private void boundsChecker(int key) {

	    if (key == 2) {
	       if(index == orderedDictionary.get(KEY_2).size()) {
	           index = 0;
           }
        }else if (key == 3) {
            if(index == orderedDictionary.get(KEY_3).size()) {
                index = 0;
            }
        }else if (key == 4) {
            if(index == orderedDictionary.get(KEY_4).size()) {
                index = 0;
            }
        }else if (key == 5) {
            if(index == orderedDictionary.get(KEY_5).size()) {
                index = 0;
            }
        }else if (key == 6) {
            if(index == orderedDictionary.get(KEY_6).size()) {
                index = 0;
            }
        }else if (key == 7) {
            if(index == orderedDictionary.get(KEY_7).size()) {
                index = 0;
            }
        }else if (key == 8) {
            if(index == orderedDictionary.get(KEY_8).size()) {
                index = 0;
            }
        }else if (key == 9) {
            if(index == orderedDictionary.get(KEY_9).size()) {
                index = 0;
            }
        }
    }

    protected String ret(int key, String text) {
        String ret = " ";
        ArrayList<Character> temp = new ArrayList<>();

//        if (key == 0) {
//            ret = oldText + " ";
//            return ret;
//        } else if (key == 1 || key == 11) {
//
//            ret = oldText + "";
//            return ret;
//        }

        for (int i = 2; i < 10; i++) {
            if (key == i) {
                temp = orderedDictionary.get(i-2);
            }
        }

        if (isUppercase) {
            String upperCase = String.valueOf(temp.get(index)).toUpperCase();
            if (append) {
                ret = text + upperCase;
                index++;
                return ret;
            } else {
                ret = oldText + upperCase;
                index++;
                return ret;
            }
        } else {
            if (append) {
                ret = text + temp.get(index);
                index++;
                return ret;
            } else {
                ret = oldText + temp.get(index);
                index++;
                return ret;
            }
        }
    }



	public String append(String text, int key) {

	    presses++;
        if (this.key != key) {
            index = 0;
            append = true;
            oldText = text;
            this.key = key;
            isUppercase = false;
        } else {
            append = false;

        }

        if(key == 0) {
            return oldText + "";
        }else if (key == 1) {
            return oldText + "";
        }else if(key == 2) {
            boundsChecker(key);
            return ret(key,text);
        }else if(key == 3) {
            boundsChecker(key);
             return ret(key,text);
        }else if(key == 4) {
            boundsChecker(key);
            return ret(key,text);
        }else if(key == 5) {
            boundsChecker(key);
            return ret(key,text);
        }else if(key == 6) {
            boundsChecker(key);
            return ret(key,text);
        }else if(key == 7) {
            boundsChecker(key);
            return ret(key,text);
        }else if(key == 8) {
            boundsChecker(key);
            return ret(key,text);
        }else if(key == 9) {
            boundsChecker(key);
            return ret(key,text);
        }else if(key == 10) {
            isUppercase = !isUppercase;
            return oldText;
        }else if(key == 11) {
            return oldText + " ";

        } else {
            try {

            } catch (IllegalArgumentException e) {
                return text;
            }

        }
	    return null;
    }


	/*
    private int key;
	private int presses= 0;
	private int index2 = 0;
	private int index3 = 3;
	private int index4 = 6;
	private int index5 = 9;
	private int index6 = 12;
	private int index7 = 15;
	private int index8 = 19;
	private int index9 = 22;
	private boolean isUppercase = false;

    private char chars[] = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o'
        ,'p','q','r','s','t','u','v','w','x','y','z'};

	//The oldText string holds the previous character before printing it
	private String oldText ="";
	
	/**
	*This method is invoked by the keypad whenever a key is
	* pressed.  It's passed the entire contents of the display
	* along with the number of the pressed key.  We just tack
	* a new character onto the display's text and return the
	* new string.
	* @param text  The text entered by the keypad so far
	* @param key  The letter of the key that's been pressed
	* @return  Updated text for the display
	*
	public String append(String text, int key) {
		presses++;

		boolean append = false;


        if(this.key != key) {
            if(key == 10){
                //System.out.println("Switched BOI");
                isUppercase = true;
            } else {
                isUppercase = false;
                oldText = text;
                append = true;
                //System.out.println(this.key);
                this.key = key;
            }
        } else {

        }
        if (key == 2) {

			if(isUppercase){//Shift 
				String shift = String.valueOf(chars[index2]).toUpperCase();
				System.out.println(shift);
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
			} else {//lowercase letter at index2
				System.out.println("index" + index2);
				if (index2 > 2) {
					index2 = 0;
				}
				System.out.println("you should see letter a");
				if (append) {
					String ret = text + chars[index2];
					index2++;
					return ret;
				}
				else {
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
					return ret;
				} else {
					String ret = oldText + chars[index3];
					index3++;
					return ret;
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
		}
		else if (key == 1) {
			return oldText + "";
		} else if(key == 0) {
			return oldText + "";
		} else if(key == 11) {
			return oldText + " ";
		}
//		else if(key == 10){
//		    isUppercase = true;
//			return text + "";
//		}
	    return null;
	}*/

}//Multitap
