package rudaks._02_structural_patterns._06_adapter._02_after;

import lombok.AllArgsConstructor;
import rudaks._02_structural_patterns._06_adapter._02_after.security.UserDetails;

@AllArgsConstructor
public class AccountUserDetails implements UserDetails {

    private Account account;

    @Override
    public String getUsername() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}
