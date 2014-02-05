package interv.swap;

/**
 * @author Marek Sarnecki : msarneck@gmail.com
 */

/**
 * Swap two variables without using third one.
 */
public class Xor {


    public static void main(String[] args) {

        int first = 5;
        int second = 7;

        first = first^second;
        second = first^second;
        first = first^second;


    }




}
