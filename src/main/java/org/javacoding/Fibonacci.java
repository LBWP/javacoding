package org.javacoding;

import org.apache.log4j.Logger;

/**
 * Created by laura on 2/11/14.
 */
public class Fibonacci {
    Logger logger = Logger.getLogger(Anagrams.class);

    // Find the Nth number in the Fibonacci sequence, defined as:
    // Fn = Fn-1 + Fn-2 , where F0 = 0 and F1 = 1
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233 ...
    public int findNthFib(int N) {
        // Handle the base cases of 0 and 1 to return 0 and 1 respectively
        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        } else {
            // If N isn't 0 or 1, call this function recursively with
            // (N - 1) and (N - 2) and add the values together
            return findNthFib(N - 1) + findNthFib(N - 2);
        }
    }

}
