package chap02;

/**
 * Created by sungheelee on 2016. 6. 5..
 */
public class Greeter {

    private String format;

    public String greet(String guest) {
        return String.format(format, guest);
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
