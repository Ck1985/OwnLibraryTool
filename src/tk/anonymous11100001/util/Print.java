
/**
 * Created by Anonymous11100001 on 5/1/2016.
 */
package tk.anonymous11100001.util;
import java.io.*;

public class Print {
    //Print Object with a new line:
    public static void print(Object obj){
        System.out.println(obj);
    }
    //Print a new lune by itself:
    public static void print(){
        System.out.println();
    }
    //Print with no a break line:
    public static void printnb(Object obj){
        System.out.print(obj);
    }
    // The new in javaSE5 printf():
    public static PrintStream printf(String format, Object...args){
        return System.out.printf(format, args);
    }
}
