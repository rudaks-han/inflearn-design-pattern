package rudaks._02_structural_patterns._06_adapter._02_after;

import rudaks._02_structural_patterns._06_adapter._02_after.security.LoginHandler;
import rudaks._02_structural_patterns._06_adapter._02_after.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService= new AccountUserDetailService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("rudaks", "rudaks");
        System.out.println(login);
    }
}
