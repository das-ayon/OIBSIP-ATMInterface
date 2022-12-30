package ATM_interface;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.HashMap;
import java.text.DecimalFormat;

public class OptionMenu extends Account
{
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'Rs.'###,##0.00");
    HashMap <Integer,Integer> data = new HashMap <Integer,Integer>();


    public void getLogin() throws IOException{
        int x=1,p=1;
        do{
            try {

                data.put(123,123);
                while(p>0) {
                    System.out.println("Enter your choice: ");
                    System.out.println("1.Register new account: ");
                    System.out.println("2.Go to login page: ");
                    int ch;
                    Scanner sc=new Scanner(System.in);
                    ch=sc.nextInt();
                    if(ch==1){
                        int z, y;
                        String n;
                        System.out.println("Enter Name, account number and Pin :");
                        n= input.nextLine();
                        z=sc.nextInt();
                        y=sc.nextInt();
                        data.put(z,y);
                    }
                    else if(ch==2){
                        p=0;
                    }
                    else{
                        System.out.println("Wrong Choice----");
                    }

                }
                System.out.println(" *****   Welcome to the ATM Project ***** \n \n");
                System.out.println("Enter your Account Number \n");

                setAccNumber(menuInput.nextInt());
                System.out.println();

                System.out.println("Enter your Pin Number \n ");
                setPinNumber(menuInput.nextInt());
                System.out.println();
            }
            catch (Exception e)
            {
                System.out.println("\n" +"Wrong Account Number or Pin Number" +"\n");
                x=2;
            }
            int an=getAccNumber();
            int pn=getPinNumber();
            if(data.containsKey(an) && data.get(an) == pn){
                getAccountType();
            }else
                System.out.println("\n" +"Wrong Account Number or Pin Number" +"\n");
        }while(x==1);
    }

    public void getAccountType()
    {
        System.out.println();
        System.out.println("Select the Account type you want to access");
        System.out.println("Type 1. Checking Account");
        System.out.println("Type 2. Saving Account");
        System.out.println("Type 3. Exit \n");
        System.out.println("Your Choice please");
        int selection = menuInput.nextInt();


        switch(selection)
        {
            case 1:
                getChecking();
                System.out.println();
                break;
            case 2:
                getSaving();
                System.out.println();
                break;
            case 3:
                System.out.println("Thank you for using this ATM, Bye. \n");
                break;
        }
    }
    public void getChecking()
    {
        System.out.println();
        System.out.println("Checking Account");
        System.out.println("Type 1. View Balance");
        System.out.println("Type 2. Withdraw Funds");
        System.out.println("Type 3. Deposit Funds");
        System.out.println("Type 4. Transfer funds");
        System.out.println("Type 5. Exit \n");
        System.out.println("Your Choice please");
        int selection = menuInput.nextInt();

        switch(selection)
        {
            case 1:
                System.out.println("Checking Account Balance: " +moneyFormat.format(getCheckingBalance()));
                getAccountType();
                System.out.println();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                System.out.println();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                System.out.println();
                break;
            case 4:
                getCheckingTransferInput();
                getAccountType();
                System.out.println();
                break;
            case 5:
                System.out.println("Thank you for using this ATM, Bye. \n");
                System.out.println();
                break;
            default:
                System.out.println("\n Invalid Choice \n");
                getChecking();
        }
    }

    public void getSaving()
    {
        System.out.println("Saving Account : ");
        System.out.println("Type 1 : View Balance");
        System.out.println("Type 2 : Withdraw Funds");
        System.out.println("Type 3 : Deposit Funds");
        System.out.println("Type 4. Transfer funds");
        System.out.println("Type 5. Exit \n");
        System.out.println("Your Choice please");

        int selection = menuInput.nextInt();
        System.out.println("\n \n");

        switch(selection)
        {
            case 1:
                System.out.println("Saving Account Balance: " +moneyFormat.format(getSavingBalance()));
                getAccountType();
                System.out.println();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                System.out.println();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                System.out.println();
                break;
            case 4:
                getSavingTransferInput();
                getAccountType();
                System.out.println();
                break;
            case 5:
                System.out.println("Thank you for using this ATM, Bye. \n");
                System.out.println();
                break;
            default:
                System.out.println("\n Invalid Choice \n");
                getChecking();
        }
    }
}

