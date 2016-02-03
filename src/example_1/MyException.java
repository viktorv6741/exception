package example_1;

import java.io.PrintStream;

public class MyException extends Exception {


    @Override
    public void printStackTrace(PrintStream s) {
        System.err.println("Why have you printed 'WORD'?");
        System.err.println("Don't need to do this )");
        System.err.println("Please try one more time.");
    }

}
