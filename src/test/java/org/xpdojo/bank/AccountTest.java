package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.xpdojo.bank.Account.initialAccount;

public class AccountTest {

    @Test
    public void newAccountShouldHaveBalanceAsZero() {
        Account account = initialAccount();
        assertThat(account.balance()).isEqualTo(0);
    }
}
