package lesson03.arrays;

import java.util.Arrays;

class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        for(char tempVar : copyFrom) {
        	System.out.print(tempVar);
        }
        
        
        
//        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
//        //System.out.println(new String(copyTo));
//        
//        System.out.println(Arrays.toString(copyTo));
//        
//        
    }
}
