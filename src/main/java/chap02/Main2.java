package chap02;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by sunghee on 2016. 6. 9..
 */
public class Main2 {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
        Greeter g1 = ctx.getBean("greeter", Greeter.class);
        Greeter g2 = ctx.getBean("greeter1", Greeter.class);
        System.out.println("(g1 == g2) = " + (g1 == g2));
        ctx.close();

    }
}
