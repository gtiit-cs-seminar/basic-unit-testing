package cn.edu.gtiit;


import util.ArrayAlgorithms;

import java.util.Arrays;

/**
 * Main class. Main method reads integers from command line arguments and sorts them using ArrayAlgorithms.sort.
 */
public class Main {
    public static void main(String[] args) {

        int[] input = new int[args.length];
        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(args[i]);
        }
        ArrayAlgorithms.sort(input);
        System.out.printf(Arrays.toString(input));

    }
}
