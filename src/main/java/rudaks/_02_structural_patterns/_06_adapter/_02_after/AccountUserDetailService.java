package rudaks._02_structural_patterns._06_adapter._02_after;

import lombok.AllArgsConstructor;
import rudaks._02_structural_patterns._06_adapter._02_after.security.UserDetails;
import rudaks._02_structural_patterns._06_adapter._02_after.security.UserDetailsService;

@AllArgsConstructor
public class AccountUserDetailService implements UserDetailsService {

    private AccountService accountService;

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
