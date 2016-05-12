package MilsBankingSystem;

import java.util.Scanner;

/**
 * Created by jaymilnamow on 5/11/16.
 */
public class Console {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Mils Bank, Fsb");
        System.out.println("Enter UserName: ");

        String enteredUserName = input.nextLine();

        AccountInfo acctInfo = new AccountInfo();

        acctInfo.validateUserName(enteredUserName);


    }

}
