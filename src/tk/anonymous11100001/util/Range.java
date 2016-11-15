/**
 * Created by Anonymous11100001 on 5/2/2016.
 */
package tk.anonymous11100001.util;

public class Range {
    //Range run from 0 .... n
    public static int[] range(int n){
        int[] result = new int[n];
        //int[] result;
        //result = new int[n];
        for(int i = 0; i < n; i++){
            result[i] = i;
        }
        return result;
    }
    //Range run from start to end:
    public static int[] range(int start, int end){
        int numberLoop = end - start;
        int[] result = new int[numberLoop];
        for(int i = 0; i < numberLoop; i++){
            result[i] = start + i;
        }
        return result;
    }
    //Range from start to end with by step
    public static int[] range(int start, int end, int step){
        int numberLoop = ((end - start) / step) + ((end - start) % step);
        int[] result = new int[numberLoop];
        for(int i = 0; i < numberLoop; i++){
            int check = start + (i * step);
            if(check >= end){
                break;
            }else{
                result[i] = check;
            }
        }
        return result;
    }
}
