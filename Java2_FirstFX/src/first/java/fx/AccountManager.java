/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first.java.fx;

import first.java.fx.model.Account;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class AccountManager {

    List<Account> listAcc = new ArrayList<Account>();

    private static AccountManager accManager;

    private AccountManager() {
    }

    public static AccountManager getInstance() {
        if (accManager == null) {
            accManager = new AccountManager();
        }

        return accManager;
    }

    public void addDefaultAccount() {
        listAcc.add(new Account("admin@gmail.com", "123456", false, Account.TYPE_ADMIN));
        listAcc.add(new Account("staff1@gmail.com", "123456", false, Account.TYPE_STAFF));
        listAcc.add(new Account("student1@gmail.com", "123456", false, Account.TYPE_STUDENT));
    }

    public List<Account> getListAccount() {
        return listAcc;
    }

    public Account getAcountByEmail(String email) {
        for (Account acc : listAcc) {
            if (acc.getEmail().equalsIgnoreCase(email)) {
                return acc;
            }
        }
        return null;
    }
}
