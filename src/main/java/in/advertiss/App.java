package in.advertiss;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService accountService = (AccountService) ctx.getBean("accountService");

        accountService.getAccountDetails();

        ctx.close();
    }
}