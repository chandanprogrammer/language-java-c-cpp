#include <iostream>  // Definitions of objects like cin, cout
#include <conio.h>   // Contains console input/output functions
#include <windows.h> // Declaration functions like Sleep()
#include <fstream>   // File handling
#include <iomanip>   // setw() Function Define
using namespace std;

class Bank_Account
{
    int moneyDeposit;
    char bankType;
    long int accountNumber;
    char holderName[50];

public:
    void create_Bank_Account();
    int return_Account_No() const;
    void deposite_Amount(int);
    int return_Money_Deposit() const;
    void withdraw_Amount(int);
    void display_Account() const;
    void user_Report() const;
    void updation_Details();
};

void loading_Bar();
void point_Progress_Bar();
void file_Not_Found_Message();
void main_Menu_Option();
void write_Bank_Account();
void money_Deposit_withdraw(int, int);
void balance_Enquiry(int);
void display_All_Customer();
void updation_Bank_Account(int);
void delete_Bank_Account(int);

// ********** Main Function start here **********
int main()
{
    loading_Bar();
    char choice;
    int acNumber;
    do
    {
        main_Menu_Option();
        cin >> choice;

        switch (choice)
        {
        case '1':
            loading_Bar();
            write_Bank_Account();
            break;
        case '2':
            loading_Bar();
            system("CLS");
            system("color 0E");
            cout << "\n\n\t Please Enter the Bank Account No. : ";
            cin >> acNumber;
            money_Deposit_withdraw(acNumber, 1);
            break;
        case '3':
            loading_Bar();
            system("CLS");
            system("color 0E");
            cout << "\n\n\t Please Enter the Bank Account No. : ";
            cin >> acNumber;
            money_Deposit_withdraw(acNumber, 2);
            break;
        case '4':
            loading_Bar();
            system("CLS");
            cout << "\n\n\t Please Enter the Bank Account No. : ";
            cin >> acNumber;
            balance_Enquiry(acNumber);
            break;
        case '5':
            loading_Bar();
            display_All_Customer();
            break;
        case '6':
            loading_Bar();
            system("CLS");
            system("color 06");
            cout << "\n\n\t Please Enter the Bank Account No. : ";
            cin >> acNumber;
            updation_Bank_Account(acNumber);
            break;
        case '7':
            loading_Bar();
            system("CLS");
            system("color 0C");
            cout << "\n\n\t Please Enter the Bank Account No. : ";
            cin >> acNumber;
            delete_Bank_Account(acNumber);
            break;
        case '8':
            exit(0);
            break;
        default:
            system("CLS");
            system("color 0D");
            Beep(523, 500);
            Beep(523, 500);
            cout << "\n\n\t\t Invalid Input ! Please Enter a valid input\n";
            cout << "\n\t\t Press any Key to Continue :) ";
        }
        cin.ignore();
        cin.get();
    } while (choice != '8');
    return 0;
}

// ************ Function Define ************
int Bank_Account::return_Account_No() const
{
    return accountNumber;
}
void Bank_Account::deposite_Amount(int x)
{
    moneyDeposit += x;
}
int Bank_Account::return_Money_Deposit() const
{
    return moneyDeposit;
}
void Bank_Account::withdraw_Amount(int x)
{
    moneyDeposit -= x;
}
void Bank_Account::user_Report() const
{
    cout << accountNumber << setw(7) << " " << holderName << setw(5) << " " << bankType << setw(5) << " " << moneyDeposit << endl;
    cout << "---------------------------------------------------------------\n";
}

void loading_Bar()
{
    system("CLS");
    system("color 0A");
    char a = 177, b = 219;
    printf("\n\n\n\n\t\t Loading...\n\n\t\t");
    for (int i = 0; i < 26; i++)
    {
        printf("%c", a);
    }
    printf("\r\t\t");
    for (int i = 0; i < 26; i++)
    {
        printf("%c", b);
        Sleep(50);
    }
}

void point_Progress_Bar()
{
    for (int i = 1; i < 10; i++)
    {
        cout << ".";
        Sleep(50);
    }
}

void file_Not_Found_Message()
{
    cout << "\n\t File Not Found";
    cout << "\n\t File could not be open !! Press any Key";
    point_Progress_Bar();
}

void main_Menu_Option()
{
    system("CLS");
    system("color 0B");
    cout << "\n\t *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n";
    cout << "\t *  Banking Management System  *\n";
    cout << "\t *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n";

    cout << "\n\t\t----- MAIN MENU -----\n";
    cout << "\n\t 1. Open a New Bank Account";
    cout << "\n\t 2. Deposit Amount in Bank Account";
    cout << "\n\t 3. Withdraw Amount in Bank Account";
    cout << "\n\t 4. Balance Enquiry by the Customer";
    cout << "\n\t 5. Show All Bank Account holder's List";
    cout << "\n\t 6. Updating the Bank Account";
    cout << "\n\t 7. Closing a Bank Account";
    cout << "\n\t 8. Exit";

    cout << "\n\n\t\t Select Your Option (1 to 8): ";
}

// 1. Create Bank Account
void Bank_Account::create_Bank_Account()
{
    system("CLS");
    system("color 0E");
    cout << "\n\t Please Enter 5 Digit Bank Account No. : ";
    cin >> accountNumber;
    cout << "\n\n\t Please Enter the Name of the Bank Account holder : ";
    cin.ignore();
    cin.getline(holderName, 50);
    cout << "\n\t Please Enter Type of the Bank Account (current/saving) (C/S) : ";
    // bankType = getchar();
    cin >> bankType;
    bankType = toupper(bankType);
    cout << "\n\t Please Enter The Starting Total Money Balance : ";
    cin >> moneyDeposit;
    cout << "\n\n\t Bank Account Created Successful";
    point_Progress_Bar();
}

void write_Bank_Account()
{
    Bank_Account ac;
    ofstream outFile;
    outFile.open("Bank_Account.dat", ios::binary | ios::app);
    ac.create_Bank_Account();
    outFile.write(reinterpret_cast<char *>(&ac), sizeof(Bank_Account));
    outFile.close();
}

// Display Account Details
void Bank_Account::display_Account() const
{
    cout << "\n\t--------------------------------------";
    cout << "\n\t Bank Account No. : " << accountNumber;
    cout << "\n\t Bank Account Holder Name : " << holderName;
    cout << "\n\t Type of Bank Account : " << bankType;
    cout << "\n\t Total Account Balance : " << moneyDeposit;
    cout << "\n\t--------------------------------------";
}

// 2, 3. Money Deposit or Withdraw
void money_Deposit_withdraw(int n, int option)
{
    int amount;
    bool found = false;
    Bank_Account ac;
    fstream File;
    File.open("Bank_Account.dat", ios::binary | ios::in | ios::out);
    if (!File)
    {
        file_Not_Found_Message();
        return;
    }
    while (!File.eof() && found == false)
    {
        File.read(reinterpret_cast<char *>(&ac), sizeof(Bank_Account));
        if (ac.return_Account_No() == n)
        {
            ac.display_Account();
            if (option == 1)
            {
                cout << "\n\n\t\t TO Money Deposit in your Bank Account :) ";
                cout << "\n\n\t Please Enter How much Money You Want to Deposit : ";
                cin >> amount;
                ac.deposite_Amount(amount);
                cout << "\n\n\t Balance Deposit Successful";
                point_Progress_Bar();
            }
            if (option == 2)
            {
                cout << "\n\n\t\t TO Money Withdraw in your Bank Account :) ";
                cout << "\n\n\t Please Enter How much Money You Want to withdraw : ";
                cin >> amount;
                int bal = ac.return_Money_Deposit() - amount;
                if (bal < 0)
                {
                    cout << "\n\n\t\t\t Insufficience Balance";
                    point_Progress_Bar();
                }
                else
                {
                    cout << "\n\t\t Balance Withdraw Successful";
                    ac.withdraw_Amount(amount);
                    point_Progress_Bar();
                    cout << "\n\n\t Your Remaining Total Balance - " << bal;
                }
            }
            int pos = (-1) * static_cast<int>(sizeof(ac));
            File.seekp(pos, ios::cur); // fn1353
            File.write(reinterpret_cast<char *>(&ac), sizeof(Bank_Account));
            found = true;
        }
    }
    File.close();
    if (found == false)
    {
        cout << "\n\n\t Record Not Found";
        point_Progress_Bar();
    }
}

// 4. Balance Enquiry
void balance_Enquiry(int n)
{
    Bank_Account ac;
    bool flag = false;
    ifstream inFile;
    inFile.open("Bank_Account.dat", ios::binary);
    if (!inFile)
    {
        file_Not_Found_Message();
        return;
    }
    while (inFile.read(reinterpret_cast<char *>(&ac), sizeof(Bank_Account)))
    {
        cout << "\n\t BALANCE DETAILS \n";
        if (ac.return_Account_No() == n)
        {
            ac.display_Account();
            flag = true;
        }
    }
    inFile.close();
    if (flag == false)
    {
        cout << "\n\n\t Bank Account number does not exist";
        point_Progress_Bar();
    }
}

// 5. Display All Bank Account Holder
void display_All_Customer()
{
    system("CLS");
    system("color 0B");
    Bank_Account ac;
    ifstream inFile;
    inFile.open("Bank_Account.dat", ios::binary);
    if (!inFile)
    {
        file_Not_Found_Message();
        return;
    }
    cout << "\n\n\t All Bank Account Holder List";
    point_Progress_Bar();
    cout << "\n\n****************************************************************\n";
    cout << "A/c no.        NAME          Type     Balance\n";
    cout << "****************************************************************\n";
    while (inFile.read(reinterpret_cast<char *>(&ac), sizeof(Bank_Account)))
    {
        ac.user_Report();
    }
    inFile.close();
}

// 6. Update Bank Account Details
void Bank_Account::updation_Details()
{
    cout << "\n\t Your Bank Account No. : " << accountNumber;
    cout << "\n\n\t Updation Bank Account Holder Name : ";
    cin.ignore();
    cin.getline(holderName, 50);
    cout << "\n\t Updation Type of Bank Account : ";
    cin >> bankType;
    bankType = toupper(bankType);
    cout << "\n\t Updation Total Account Balance : ";
    cin >> moneyDeposit;
}

void updation_Bank_Account(int n)
{
    bool found = false;
    Bank_Account ac;
    fstream File;
    File.open("Bank_Account.dat", ios::binary | ios::in | ios::out);
    if (!File)
    {
        file_Not_Found_Message();
        return;
    }
    while (!File.eof() && found == false)
    {
        File.read(reinterpret_cast<char *>(&ac), sizeof(Bank_Account));
        if (ac.return_Account_No() == n)
        {
            ac.display_Account();
            cout << "\n\n\t\t Please Enter the New Details of Bank Account :) " << endl;
            ac.updation_Details();
            int pos = (-1) * static_cast<int>(sizeof(Bank_Account));
            File.seekp(pos, ios::cur); // fncallat1353
            File.write(reinterpret_cast<char *>(&ac), sizeof(Bank_Account));
            cout << "\n\n\t Record Updated Successful";
            point_Progress_Bar();
            found = true;
        }
    }
    File.close();
    if (found == false)
    {
        cout << "\n\n\t Record Not Found ";
        point_Progress_Bar();
    }
}

// Delete or Close Bank Account
void delete_Bank_Account(int n)
{
    Bank_Account ac;
    ifstream inFile;
    ofstream outFile;
    inFile.open("Bank_Account.dat", ios::binary);
    if (!inFile)
    {
        file_Not_Found_Message();
        return;
    }
    outFile.open("Temp.dat", ios::binary);
    inFile.seekg(0, ios::beg);
    while (inFile.read(reinterpret_cast<char *>(&ac), sizeof(Bank_Account)))
    {
        if (ac.return_Account_No() != n)
        {
            outFile.write(reinterpret_cast<char *>(&ac), sizeof(Bank_Account));
        }
    }
    inFile.close();
    outFile.close();
    remove("Bank_Account.dat");
    rename("Temp.dat", "Bank_Account.dat");
    cout << "\n\n Your Account Deleted Successful";
    point_Progress_Bar();
}