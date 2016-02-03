package example_1;

import java.util.Scanner;

public class CheckedTest {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Type any word except 'word'");
        String anyWord = console.nextLine();


        if (anyWord.equals("word")){
            try{
                throw new MyException();
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println(anyWord);
        }



    }
}
