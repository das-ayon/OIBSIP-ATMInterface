package ATM_interface;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account
{
    private int AccNo;
    private int PinNo;
    private double checkingBalance=5000;
    private double savingBalance=5000;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'Rs '###,##0.00");

    public int setAccNumber(int AccNo)
    {
        this.AccNo = AccNo;
        return AccNo;
    }
    public int getAccNumber()
    {
        return AccNo;
    }
    public int setPinNumber(int PinNo)
    {
        this.PinNo = PinNo;
        return PinNo;
    }

    public int getPinNumber()
    {
        return PinNo;
    }

    public double getCheckingBalance()
    {
        return checkingBalance;
    }
    public double getSavingBalance()
    {
        return savingBalance;
    }
    public double calcCheckingWithdraw(double amount)
    {
        checkingBalance=(checkingBalance - amount);
        return checkingBalance;
    }
    public double calcSavingWithdraw(double amount)
    {
        savingBalance=(savingBalance - amount);
        return savingBalance;
    }
    public double calcCheckingDeposit(double amount)
    {
        checkingBalance=(checkingBalance + amount);
        return checkingBalance;
    }
    public double calcSavingDeposit(double amount)
    {
        savingBalance=(savingBalance + amount);
        return savingBalance;
    }

    public void getCheckingWithdrawInput()
    {
        System.out.println("Checking Account Balance :" +moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from Checking Account : ");
        double amount = input.nextDouble();
        if((checkingBalance  -amount) >= 0)
        {
            calcCheckingWithdraw(amount);
            System.out.println("New checking Account Balance: " +moneyFormat.format(checkingBalance));
        }
        else
        {
            System.out.println("Balance cannot be Negative" + "\n");
        }
    }

    public void getSavingWithdrawInput()
    {
        System.out.println("Saving Account Balance :" +moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from Saving Account : ");
        double amount = input.nextDouble();
        if((savingBalance  -amount) >= 0)
        {
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account Balance: " +moneyFormat.format(savingBalance));
        }
        else
        {
            System.out.println("Balance cannot be Negative" + "\n");
        }
    }

    public void getCheckingDepositInput()
    {
        System.out.println("Checking Account Balance :" +moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to deposit from Checking Account : ");
        double amount = input.nextDouble();
        if((checkingBalance  + amount) >= 0)
        {
            calcCheckingDeposit(amount);
            System.out.println("New checking Account Balance: " +moneyFormat.format(checkingBalance));
        }
        else
        {
            System.out.println("Balance cannot be Negative" + "\n");
        }
    }

    public void getSavingDepositInput()
    {
        System.out.println("Saving Account Balance :" +moneyFormat.format(savingBalance));
        System.out.println("Amount you want to deposit from Saving Account : ");
        double amount = input.nextDouble();
        if((savingBalance  + amount) >= 0)
        {
            calcSavingDeposit(amount);
            System.out.println("New Saving Account Balance: " +moneyFormat.format(savingBalance));
        }
        else
        {
            System.out.println("Balance cannot be Negative" + "\n");
        }
    }
    public void getCheckingTransferInput()
    {
        System.out.println("Checking Account Balance :" +moneyFormat.format(checkingBalance));

        System.out.println("Amount you want to transfer from Checking Account : ");
        double amount = input.nextDouble();
        System.out.println("Enter Account  you want to transfer");
        int acc_no=input.nextInt();
        if((checkingBalance  -amount) >= 0)
        {
            calcCheckingWithdraw(amount);
            System.out.println("New checking Account Balance: " +moneyFormat.format(checkingBalance));
            System.out.println("Amount "+amount+" transferred to Acc.Number "+acc_no);
        }
        else
        {
            System.out.println("Balance cannot be Negative" + "\n");
        }
    }


    public void getSavingTransferInput()
    {
        System.out.println("Checking Account Balance :" +moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to transfer from Checking Account : ");
        double amount = input.nextDouble();
        System.out.println("Enter Account  you want to transfer:");
        int acc_no=input.nextInt();

        if((checkingBalance  -amount) >= 0)
        {
            calcCheckingWithdraw(amount);
            System.out.println("New checking Account Balance: " +moneyFormat.format(checkingBalance));
            System.out.println("Amount "+amount+" transferred to Acc.Number "+acc_no);
        }
        else
        {
            System.out.println("Balance cannot be Negative" + "\n");
        }
    }

}

