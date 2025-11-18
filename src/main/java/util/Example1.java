package util;

public  class Example1 {

    /**
     * A branch-heavy puzzle method designed to be easy for EvoSuite (guided by branch distances)
    * and hard for Randoop (random search). 
    * EvoSuite can evolve inputs toward the target values,
    * while Randoop is unlikely to randomly hit all constraints simultaneously.
    */

    /**
     * Returns true only for a very specific combination of inputs.
     * Conditions:
     * - a + b == 100
     * - a * b == 2400  (solutions over ints: (40,60) or (60,40))
     * - s equals "EvoSuite"
     * - arr has length 4 and follows:
     *     arr[0] == a - 40
     *     arr[1] == b - 60
     *     arr[2] == arr[0] + arr[1]
     *     arr[3] == a + b + arr[2]
     */
    public static boolean evoFriendlyButRandoopHard(int a, int b, String s, int[] arr) {
        if (a + b != 100) 
            return false;
        if (a * b != 2400) 
            return false;
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