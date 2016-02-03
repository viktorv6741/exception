package example_0;

public class FactorialException extends Error{


    private int number;
    private String info = new String("Supposed to be changed to -> if (number < 0) return 1");

    public FactorialException(String someInfo, int number) {

        super(someInfo);
        this.number = this.number;
    }

    public int getNumber() {
        return number;
    }

    public String getInfo() {
        return info;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
