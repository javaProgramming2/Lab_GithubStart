# Lab_GithubStart
Lab ATM

The purpose of the code is to ask users how much money is in their bank account and allow users to withdraw an amount that is stored within the account, it does not allow users to withdraw more money than they have in their account.
```java
Scanner keyboard = new Scanner(System.in);
System.out.print("Please enter your starting balance: $");
BankAccount account1 = new BankAccount(keyboard.nextDouble());
System.out.println("If you would like to make a withdrawl, please enter the amount you would like.\nIf you do not want to make a withdrawl, please enter 0");
double amt = keyboard.nextDouble();
while (amt != 0)
{
account1.withdraw(amt);
System.out.println("Would you like to make another withdrawl?");
amount = keyboard.nextDouble();
}
```
To use the code, open the program in your IDE.
Enter the balance in the account.
Enter an integer amount of money to withdraw, enter 0 to stop

Example Output:
Please enter your starting balance: $100
If you would like to make a withdrawl, please enter the amount you would like.
If you do not want to make a withdrawl, please enter 0
46
Withdraw complete! You withdrew: 46.0
Would you like to make another withdrawl?
0

## Zulaikha, I removed the "!" after the sentence "There isn't enough Funds!"
Collaboration Acknowledgment
This project was reviewed and edited by Zulaikha on GitHub.
This project was reviewed and edited by Paul Kainoa Thieben on GitHub.
