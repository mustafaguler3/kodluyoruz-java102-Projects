import entities.CarInsurance;
import services.Account;
import services.Impl.AccountManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AccountManager accountManager = new AccountManager();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a email : ");
        String email = scanner.nextLine();
        System.out.print("Enter a password : ");
        String password = scanner.nextLine();
        Account account = accountManager.login(email,password);
        System.out.println("Welcome "+account.getUser().getName()+" "+account.getUser().getLastName());
        account.addAddress("Beykoz - Istanbul");
        account.addAddress("Ümraniye - Istanbul");
        account.addInsurance(new CarInsurance());
        account.showUserInfo();


    }


}
