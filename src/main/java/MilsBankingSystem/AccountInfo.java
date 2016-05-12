package MilsBankingSystem;

import java.util.Arrays;

/**
 * Created by jaymilnamow on 5/11/16.
 */
public class AccountInfo {

    private String[] UserNames;

    private final String[] testList = new String[]{"asd", "qwe", "JayMils"};

    AccountInfo(String[] blah);

    boolean validateUserName (String userName) {
        if (Arrays.asList(testList).contains(userName)) {
                System.out.println("VALID!");
                return true;
        } else {
            System.out.println("UserName not found. \nWould you like to create a new Account?");
            return false;
        }
    }

}

