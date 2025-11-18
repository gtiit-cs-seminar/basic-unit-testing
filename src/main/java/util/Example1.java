package util;

public  class Example1 {

    public static boolean evoFriendlyButRandoopHard1(int a, int b) {
        if (a + b != 100) 
            return false;
        if (a * b != 2400) 
            return false;
        return true;
    }
        public static boolean evoFriendlyButRandoopHard2(String s) {
        if (s == null || !"EvoSuite".equals(s)) 
            return false;

        return true;
    }
    public static boolean evoFriendlyButRandoopHard3(int a, int b, String s, int[] arr) {
        if (s == null || !"EvoSuite".equals(s)) 
            return false;
        if (arr == null || arr.length != 4) 
            return false;

        if (arr[0] != a - 40) 
            return false;
        if (arr[1] != b - 60) 
            return false;
        if (arr[2] != arr[0] + arr[1]) 
            return false;
        if (arr[3] != a + b + arr[2]) 
            return false;

        return true;
    }
}