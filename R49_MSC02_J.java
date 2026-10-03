package cis4615_hw2;

import java.util.Random;
// ...

public class R49_MSC02_J {
    Random number = new Random(123L);
    //...
    for (int i = 0; i < 20; i++) {
        // Generate another random integer in the range [0, 20]
        int n = number.nextInt(21);
        System.out.println(n);
    }
}
