#include <stdio.h>
#include <conio.h>   //delay(), getch()
#include <windows.h> //gotoxy()
#include <ctype.h>   //toupper(), tolower()
#include <string.h>  //strcmp(), strcpy(), strlen()
#include <stdlib.h>

// FUNCTION DECLERATION
void WelcomeScreen(void);
void Title(void);
void MainMenu(void);
void LoginScreen(void);
void AddRecord(void);
void PatientList(void);
void SearchRecord(void);
void EditRecord(void);
void DeleteRecord(void);
void Exit(void);
void gotoxy(short x, short y)
{
    COORD pos = {x, y}; // sets co-ordinates in (x,y)
    SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), pos);
}

// List of Global variable
char ans = 0;
int ok, b, valid = 0;

struct patient
{
    char First_Name[20];
    char Last_Name[20];
    char Gender;
    int age;
    char Address[30];
    char Contact_no[15];
    char Problem[30];
    char Doctor[20];
} p;

// ********************** Main Function **********************
void main(void)
{
    WelcomeScreen();
    Title();
    LoginScreen();
    getch();
}

// ********************** WelcomeScreen Function **********************
void WelcomeScreen(void)
{
    printf("\n\n\n\n\t\t#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#");
    printf("\n\t\t#\t\t\tWELCOME TO\t\t\t#");
    printf("\n\t\t#\t\tCHANDAN HOSPITAL MANAGEMENT SYSTEM\t#");
    printf("\n\t\t#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#\n");
    printf("\n\n\n\n\n\t\tPress any key to Continue.....");
    getch();       // hold screen
    system("cls"); // clear screen
}

// ********************** Title Function **********************
void Title(void)
{
    printf("\n\n\t--------------------------------------------------");
    printf("\n\t\t\tCHANDAN HOSPITAL");
    printf("\n\t--------------------------------------------------\n");
}

// ********************** LoginScreen Function **********************
void LoginScreen(void)
{
    int limit = 0;
    char username[10];
    char password[10];
    char original_username[10] = "chandan";
    char original_password[10] = "8002";

    do
    {
        printf("\n\n\t\tEnter your Username and Password :)");
        printf("\n\n\t\t\tUSERNAME : ");
        scanf("%s", &username);
        printf("\n\n\t\t\tPASSWORD : ");
        scanf("%s", &password);
        if (strcmp(username, original_username) == 0 && strcmp(password, original_password) == 0)
        {
            printf("\n\n\t\t...Login Successful....");
            getch();
            MainMenu();
            break;
        }
        else
        {
            printf("\n\n\t\tPassword is incorrect! ( Try Again :)....");
            limit++;
            getch();
        }
    } while (limit <= 2);
    if (limit > 2)
    {
        printf("\n\n\t\tYou have cross the limit. You can not login :( :(");
        getch();
    }
    system("cls");
}

// ********************** MainMenu Function **********************
void MainMenu(void)
{
    system("cls");
    Title();
    int choose;
    printf("\n\n\t\t\t1. Add Patients Record\n");
    printf("\n\t\t\t2. List Patients Record\n");
    printf("\n\t\t\t3. Search Patients Record\n");
    printf("\n\t\t\t4. Edit Patients Record\n");
    printf("\n\t\t\t5. Delete Patients Record\n");
    printf("\n\t\t\t6. Exit\n");
    printf("\n\n\n\t\t\tChoose from 1 to 6 : ");
    scanf("%d", &choose);
    switch (choose)
    {
    case 1:
        AddRecord();
        break;
    case 2:
        PatientList();
        break;
    case 3:
        SearchRecord();
        break;
    case 4:
        EditRecord();
        break;
    case 5:
        DeleteRecord();
        break;
    case 6:
        Exit();
        break;

    default:
        printf("\n\n\t\tInvalid entry. Please enter right option :)");
        getch();
        MainMenu();
    }
    getch();
}
// ********************** AddRecord Function **********************
void AddRecord(void)
{
    system("cls");
    Title();
    FILE *ek;
    ek = fopen("Record1", "ab");
    // ek = fopen("Record2.dat", "a");
    printf("\n\t\t!!!!!!!!!!!! Add Patients Record !!!!!!!!!!!!");

    // *********** First Name ***********
A:
    printf("\n\n\t\tFirst Name : ");
    scanf("%s", p.First_Name);
    p.First_Name[0] = toupper(p.First_Name[0]);
    if (strlen(p.First_Name) > 20 || strlen(p.First_Name) < 3)
    {
        printf("\n\tInvalid! ( The max range for first name is 20 and min range is 3 :)");
        goto A;
    }
    else
    {
        for (int i = 0; i < strlen(p.First_Name); i++)
        {
            if (isalpha(p.First_Name[i]))
            {
                valid = 1;
            }
            else
            {
                valid = 0;
                break;
            }
        }
        if (!valid)
        {
            printf("\n\tFirst name contain Invalid character :( Enter again :)");
            goto A;
        }
    }

    // *********** Last Name ***********
B:
    printf("\n\n\t\tLast Name : ");
    scanf("%s", p.Last_Name);
    p.Last_Name[0] = toupper(p.Last_Name[0]);
    if (strlen(p.Last_Name) > 20 || strlen(p.Last_Name) < 3)
    {
        printf("\n\tInvalid! ( The max range for last name is 20 and min range is 3 :)");
        goto B;
    }
    else
    {
        for (int i = 0; i < strlen(p.Last_Name); i++)
        {
            if (isalpha(p.Last_Name[i]))
            {
                valid = 1;
            }
            else
            {
                valid = 0;
                break;
            }
        }
        if (!valid)
        {
            printf("\n\tLast name contain Invalid character :( Enter again :)");
            goto B;
        }
    }
    // *********** Gender ***********
    do
    {
        printf("\n\n\t\tGender[F/M] : ");
        scanf(" %c", &p.Gender);
        p.Gender = toupper(p.Gender);
        if (toupper(p.Gender) == 'M' || toupper(p.Gender) == 'F')
        {
            ok = 1;
        }
        else
        {
            ok = 0;
        }
        if (!ok)
        {
            printf("\n\tGender contain Invalid character :( Enter either F or M :)");
        }
    } while (!ok);
// *********** Age ***********
D:
    printf("\n\n\t\tAge : ");
    scanf(" %d", &p.age);
    if (p.age >= 100 || p.age < 0)
    {
        printf("\n\tInvalid age! Please enter valid age betwwen 1 to 100");
        goto D;
    }
    // *********** Address ***********

E:
    printf("\n\n\t\tAddress ( village ): ");
    scanf("%s", p.Address);
    p.Address[0] = toupper(p.Address[0]);
    if (strlen(p.Address) > 30 || strlen(p.Address) < 3)
    {
        printf("\n\tInvalid Address! ( The max range for address is 30 and min range is 3 :)");
        goto E;
    }

    // *********** Contact Number ***********
    do
    {
    F:
        printf("\n\n\t\tContact No : ");
        scanf("%s", p.Contact_no);
        if (strlen(p.Contact_no) > 10 || strlen(p.Contact_no) != 10)
        {
            printf("\n\tSorry :( Invalid contact no. must contain 10 numbers. Enter Again :) ");
            goto F;
        }
        else
        {
            for (int i = 0; i < strlen(p.Contact_no); i++)
            {
                if (!isalpha(p.Contact_no[i]))
                {
                    valid = 1;
                }
                else
                {
                    valid = 0;
                    break;
                }
            }
            if (!valid)
            {
                printf("\n\tContact no. contain Invalid character :( Enter again :)");
                goto F;
            }
        }
    } while (!valid);
// *********** Problem ***********
H:
    printf("\n\n\t\tProblem : ");
    scanf("%s", p.Problem);
    p.Problem[0] = toupper(p.Problem[0]);
    if (strlen(p.Problem) > 30 || strlen(p.Problem) < 3)
    {
        printf("\n\tInvalid! ( The max range for problem is 30 and min range is 3 :)");
        goto H;
    }
    else
    {
        for (int i = 0; i < strlen(p.Problem); i++)
        {
            if (isalpha(p.Problem[i]))
            {
                valid = 1;
            }
            else
            {
                valid = 0;
                break;
            }
        }
        if (!valid)
        {
            printf("\n\tProblem contain Invalid character :( Enter again :)");
            goto H;
        }
    }
// *********** Prescribed Doctor ***********
I:
    printf("\n\n\t\tPrescribed Doctor : ");
    scanf("%s", p.Doctor);
    p.Doctor[0] = toupper(p.Doctor[0]);
    if (strlen(p.Doctor) > 30 || strlen(p.Doctor) < 3)
    {
        printf("\n\tInvalid! ( The max range for Doctor name is 30 and min range is 3 :)");
        goto I;
    }
    else
    {
        for (int i = 0; i < strlen(p.Doctor); i++)
        {
            if (isalpha(p.Doctor[i]))
            {
                valid = 1;
            }
            else
            {
                valid = 0;
                break;
            }
        }
        if (!valid)
        {
            printf("\n\t Doctor name contain Invalid character :( Enter again :)");
            goto I;
        }
    }
    fwrite(&p, sizeof(p), 1, ek);
    printf("\n\n\n\t...Information Record Successful.... ");
    fclose(ek); // file close

SD:
    getch();
    printf("\n\n\tDo you want to add more[Y/N]?? ");
    scanf(" %c", &ans);
    if (toupper(ans) == 'Y')
    {
        AddRecord();
    }
    else if (toupper(ans) == 'N')
    {
        printf("\n\t\tThank You :) :) ");
        getch();
        MainMenu();
    }
    else
    {
        printf("\n\tInvalid Input \n");
        goto SD;
    }
}

// ********************** PatientList Function **********************
void PatientList(void)
{
    int row;
    system("cls");
    Title();
    printf("\n\t\t!!!!!!!!!!!!!!!!! List Patients Record !!!!!!!!!!!!!!!!!");
    gotoxy(4, 10);
    printf("Full Name");
    gotoxy(21, 10);
    printf("Gender");
    gotoxy(28, 10);
    printf("Age");
    gotoxy(34, 10);
    printf("Address");
    gotoxy(52, 10);
    printf("Contact No.");
    gotoxy(67, 10);
    printf("Problem");
    gotoxy(91, 10);
    printf("Prescribed Doctor \n");
    printf(" **************************************************************************************************************");
    FILE *ek;
    ek = fopen("Record1", "rb");
    row = 12;
    while (fread(&p, sizeof(p), 1, ek) == 1)
    {
        gotoxy(1, row);
        printf("| %s %s", p.First_Name, p.Last_Name);
        gotoxy(20, row);
        printf("| %c", p.Gender);
        gotoxy(27, row);
        printf("| %d", p.age);
        gotoxy(32, row);
        printf("| %s", p.Address);
        gotoxy(50, row);
        printf("| %s", p.Contact_no);
        gotoxy(65, row);
        printf("| %s", p.Problem);
        gotoxy(90, row);
        printf("| %s ", p.Doctor);
        gotoxy(110, row);
        printf("|");
        row++;
        gotoxy(1, row);
        printf("--------------------------------------------------------------------------------------------------------------");
        row++;
    }
    fclose(ek);
    getch();
    MainMenu();
}

// ********************** SearchRecord Function **********************
void SearchRecord(void)
{
    char temp_name[20];
    char temp_gender;
    int temp_age;
    char temp_address[20];
    char temp_contact_no[15];
    char temp_doctor[20];

    int row = 8;
    int choose;
    system("cls");
    Title();
    printf("\n\t\t!!!!!!!!!!!!!!!!! Search Patients Record !!!!!!!!!!!!!!!!!");
    gotoxy(4, ++row);
    row++;
    printf("\t\t\t1. Search Patients by Name");
    gotoxy(4, ++row);
    row++;
    printf("\t\t\t2. Search Patients by Gender");
    gotoxy(4, ++row);
    row++;
    printf("\t\t\t3. Search Patients by Age");
    gotoxy(4, ++row);
    row++;
    printf("\t\t\t4. Search Patients by Address");
    gotoxy(4, ++row);
    row++;
    printf("\t\t\t5. Search Patients by Contact No.");
    gotoxy(4, ++row);
    row++;
    printf("\t\t\t6. Search Patients by Doctor");
    gotoxy(4, ++row);
    row++;
    printf("\t\t\t\tChoose from 1 to 6 : ");
    scanf("%d", &choose);
    row++;

    switch (choose)
    {
    case 1:
        gotoxy(4, ++row);
        row++;
        printf("\tEnter Patients Name to be viewed : ");
        scanf("%s", temp_name);
        fflush(stdin);
        temp_name[0] = toupper(temp_name[0]);
        break;
    case 2:
        gotoxy(4, ++row);
        row++;
        printf("\tEnter Patients Gender to be viewed : ");
        scanf("%c", &temp_gender);
        fflush(stdin);
        temp_gender = toupper(temp_gender);
        break;
    case 3:
        gotoxy(4, ++row);
        row++;
        printf("\tEnter Patients Age to be viewed : ");
        scanf("%d", &temp_age);
        fflush(stdin);
        break;
    case 4:
        gotoxy(4, ++row);
        row++;
        printf("\tEnter Patients Address to be viewed : ");
        scanf("%s", temp_address);
        temp_address[0] = toupper(temp_address[0]);
        fflush(stdin);
        break;
    case 5:
        gotoxy(4, ++row);
        row++;
        printf("\tEnter Patients Contact No. to be viewed : ");
        scanf("%s", temp_contact_no);
        fflush(stdin);
        break;
    case 6:
        gotoxy(4, ++row);
        row++;
        printf("\tEnter Patients Prescribed Doctor to be viewed : ");
        scanf("%s", temp_doctor);
        temp_doctor[0] = toupper(temp_doctor[0]);
        fflush(stdin);
        break;

    default:
        gotoxy(4, ++row);
        row++;
        printf("\t\tInvalid input! Please choose 1 to 6 :)");
        getch();
        SearchRecord();
    }
    row = 8;
    system("cls");
    Title();
    printf("\n\t\t!!!!!!!!!!!!!!!!! Search Patients Record !!!!!!!!!!!!!!!!!");
    gotoxy(4, ++row);
    row++;
    gotoxy(4, row);
    printf("Full Name");
    gotoxy(21, row);
    printf("Gender");
    gotoxy(28, row);
    printf("Age");
    gotoxy(34, row);
    printf("Address");
    gotoxy(52, row);
    printf("Contact No.");
    gotoxy(67, row);
    printf("Problem");
    gotoxy(91, row);
    printf("Prescribed Doctor");
    gotoxy(1, ++row);
    printf("**************************************************************************************************************");
    FILE *ek;
    ek = fopen("Record1", "rb");
    row++;
    while (fread(&p, sizeof(p), 1, ek) == 1)
    {
        if ((strcmp(p.First_Name, temp_name) == 0) || p.Gender == temp_gender || p.age == temp_age || (strcmp(p.Address, temp_address) == 0) || (strcmp(p.Contact_no, temp_contact_no) == 0) || (strcmp(p.Doctor, temp_doctor) == 0))
        {
            gotoxy(1, row);
            printf("| %s %s", p.First_Name, p.Last_Name);
            gotoxy(20, row);
            printf("| %c", p.Gender);
            gotoxy(27, row);
            printf("| %d", p.age);
            gotoxy(32, row);
            printf("| %s", p.Address);
            gotoxy(50, row);
            printf("| %s", p.Contact_no);
            gotoxy(65, row);
            printf("| %s", p.Problem);
            gotoxy(90, row);
            printf("| %s ", p.Doctor);
            gotoxy(110, row);
            printf("|");
            row++;
            gotoxy(1, row);
            printf("--------------------------------------------------------------------------------------------------------------");
            row++;
        }
    }
    if ((strcmp(p.First_Name, temp_name) != 0))
    {
        gotoxy(1, ++row);
        printf("\t\t\tRecord not found!");
        getch();
    }
M:
    row++;
    gotoxy(1, ++row);
    printf("\t\t\t\tDo you want to view more [Y/N] : ");
    scanf("%c", &ans);
    if (toupper(ans) == 'Y')
    {
        SearchRecord();
    }
    else if (toupper(ans) == 'N')
    {
        row++;
        gotoxy(1, ++row);
        printf("\t\t\t\tThank You :) :)");
        getch();
        fclose(ek);
        MainMenu();
    }
    else
    {
        row++;
        gotoxy(1, ++row);
        printf("\t\t\tInvalid input! Press a valid key [Y/N]");
        goto M;
    }
}

// ********************** EditRecord Function **********************
void EditRecord(void)
{
    int i, b, valid = 0;
    char ch;
    char name[20];
    int row = 8;
    system("cls");
    Title();
    FILE *ek, *ft;
    ek = fopen("Record1", "rb");
    ft = fopen("TempRecord", "ab");
    if (ek == NULL)
    {
        printf("\n\t Can not open file!!");
        getch();
        MainMenu();
    }
    printf("\n\t\t!!!!!!!!!!!!!!!!! Edit Patients Record !!!!!!!!!!!!!!!!!");
    gotoxy(4, ++row);
    row++;
    printf("\t\t\t1. Enter the First name of Patient : ");
    scanf("%s", name);
    fflush(stdin);
    name[0] = toupper(name[0]);
    gotoxy(4, ++row);
    row++;
    if (ft == NULL)
    {
        printf("\n\t Can not open file!!");
        getch();
        MainMenu();
    };
    gotoxy(4, ++row);
    row++;
    printf("\t\t****** Existing Record *******");
    gotoxy(4, ++row);
    row++;
    gotoxy(4, row);
    printf("Full Name");
    gotoxy(21, row);
    printf("Gender");
    gotoxy(28, row);
    printf("Age");
    gotoxy(34, row);
    printf("Address");
    gotoxy(52, row);
    printf("Contact No.");
    gotoxy(67, row);
    printf("Problem");
    gotoxy(91, row);
    printf("Prescribed Doctor");
    gotoxy(1, ++row);
    printf("**************************************************************************************************************");
    row++;

    while (fread(&p, sizeof(p), 1, ek) == 1)
    {
        if ((strcmp(p.First_Name, name) == 0))
        {
            valid = 1;
            gotoxy(1, row);
            printf("| %s %s", p.First_Name, p.Last_Name);
            gotoxy(20, row);
            printf("| %c", p.Gender);
            gotoxy(27, row);
            printf("| %d", p.age);
            gotoxy(32, row);
            printf("| %s", p.Address);
            gotoxy(50, row);
            printf("| %s", p.Contact_no);
            gotoxy(65, row);
            printf("| %s", p.Problem);
            gotoxy(90, row);
            printf("| %s ", p.Doctor);
            gotoxy(110, row);
            printf("|");
            row++;
            gotoxy(1, row);
            printf("--------------------------------------------------------------------------------------------------------------");
            row++;
            gotoxy(10, row);
        A:
            printf("\n\n\t\tNew First Name : ");
            scanf("%s", p.First_Name);
            p.First_Name[0] = toupper(p.First_Name[0]);
            if (strlen(p.First_Name) > 20 || strlen(p.First_Name) < 3)
            {
                printf("\n\tInvalid! ( The max range for first name is 20 and min range is 3 :)");
                goto A;
            }
            else
            {
                for (int i = 0; i < strlen(p.First_Name); i++)
                {
                    if (isalpha(p.First_Name[i]))
                    {
                        valid = 1;
                    }
                    else
                    {
                        valid = 0;
                        break;
                    }
                }
                if (!valid)
                {
                    printf("\n\tFirst name contain Invalid character :( Enter again :)");
                    goto A;
                }
            }

            // *********** Last Name ***********
        B:
            printf("\n\n\t\tNew Last Name : ");
            scanf("%s", p.Last_Name);
            p.Last_Name[0] = toupper(p.Last_Name[0]);
            if (strlen(p.Last_Name) > 20 || strlen(p.Last_Name) < 3)
            {
                printf("\n\tInvalid! ( The max range for last name is 20 and min range is 3 :)");
                goto B;
            }
            else
            {
                for (int i = 0; i < strlen(p.Last_Name); i++)
                {
                    if (isalpha(p.Last_Name[i]))
                    {
                        valid = 1;
                    }
                    else
                    {
                        valid = 0;
                        break;
                    }
                }
                if (!valid)
                {
                    printf("\n\tLast name contain Invalid character :( Enter again :)");
                    goto B;
                }
            }
            // *********** Gender ***********
            do
            {
                printf("\n\n\t\tUpdate Gender[F/M] : ");
                scanf(" %c", &p.Gender);
                p.Gender = toupper(p.Gender);
                if (toupper(p.Gender) == 'M' || toupper(p.Gender) == 'F')
                {
                    ok = 1;
                }
                else
                {
                    ok = 0;
                }
                if (!ok)
                {
                    printf("\n\tGender contain Invalid character :( Enter either F or M :)");
                }
            } while (!ok);
        // *********** Age ***********
        D:
            printf("\n\n\t\tNew Age : ");
            scanf(" %d", &p.age);
            if (p.age >= 100 || p.age < 0)
            {
                printf("\n\tInvalid age! Please enter valid age betwwen 1 to 100");
                goto D;
            }
            // *********** Address ***********

        E:
            printf("\n\n\t\t New Address ( village ): ");
            scanf("%s", p.Address);
            p.Address[0] = toupper(p.Address[0]);
            if (strlen(p.Address) > 30 || strlen(p.Address) < 3)
            {
                printf("\n\tInvalid Address! ( The max range for address is 30 and min range is 3 :)");
                goto E;
            }

            // *********** Contact Number ***********
            do
            {
            F:
                printf("\n\n\t\tNew Contact No : ");
                scanf("%s", p.Contact_no);
                if (strlen(p.Contact_no) > 10 || strlen(p.Contact_no) != 10)
                {
                    printf("\n\tSorry :( Invalid contact no. must contain 10 numbers. Enter Again :) ");
                    goto F;
                }
                else
                {
                    for (int i = 0; i < strlen(p.Contact_no); i++)
                    {
                        if (!isalpha(p.Contact_no[i]))
                        {
                            valid = 1;
                        }
                        else
                        {
                            valid = 0;
                            break;
                        }
                    }
                    if (!valid)
                    {
                        printf("\n\tContact no. contain Invalid character :( Enter again :)");
                        goto F;
                    }
                }
            } while (!valid);
        // *********** Problem ***********
        H:
            printf("\n\n\t\tUpdate Problem : ");
            scanf("%s", p.Problem);
            p.Problem[0] = toupper(p.Problem[0]);
            if (strlen(p.Problem) > 30 || strlen(p.Problem) < 3)
            {
                printf("\n\tInvalid! ( The max range for problem is 30 and min range is 3 :)");
                goto H;
            }
            else
            {
                for (int i = 0; i < strlen(p.Problem); i++)
                {
                    if (isalpha(p.Problem[i]))
                    {
                        valid = 1;
                    }
                    else
                    {
                        valid = 0;
                        break;
                    }
                }
                if (!valid)
                {
                    printf("\n\tProblem contain Invalid character :( Enter again :)");
                    goto H;
                }
            }
            printf("\n Press U character for the Updating operations : ");
            ch = getche();
            if (ch == 'u' || ch == 'U')
            {
                fwrite(&p, sizeof(p), 1, ft);
                printf("\n\n\n\t...Patient Record updated Successfully.... ");
            }
        }
        else
        {
            fwrite(&p, sizeof(p), 1, ft);
        }
    }
    if (!valid)
    {
        printf("\n\t\tNo Record Found.....");
    }
    fclose(ft);
    fclose(ek);
    remove("Record1");
    rename("TempRecord", "Record1");
    getch();
    MainMenu();
}

// ********************** DeleteRecord Function ******************
void DeleteRecord(void)
{
    int found = 0;
    char ch;
    char name[20];
    int row = 8;
    system("cls");
    Title();
    FILE *ek, *ft;
    ek = fopen("Record1", "rb");
    ft = fopen("TempRecord", "ab");
    if (ek == NULL)
    {
        printf("\n\t Can not open file!!");
        getch();
        MainMenu();
    }
    printf("\n\t\t!!!!!!!!!!!!!!!!! Deleted Patients Record !!!!!!!!!!!!!!!!!");
    gotoxy(4, ++row);
    row++;
    printf("\t\t\tEnter First name of Patient to delete : ");
    scanf("%s", name);
    fflush(stdin);
    name[0] = toupper(name[0]);
    gotoxy(4, ++row);
    row++;
    if (ft == NULL)
    {
        printf("\n\t Can not open file!!");
        getch();
        MainMenu();
    };
    gotoxy(4, ++row);
    row++;
    printf("\t\t****** Existing Record *******");
    gotoxy(4, ++row);
    row++;
    gotoxy(4, row);
    printf("Full Name");
    gotoxy(21, row);
    printf("Gender");
    gotoxy(28, row);
    printf("Age");
    gotoxy(34, row);
    printf("Address");
    gotoxy(52, row);
    printf("Contact No.");
    gotoxy(67, row);
    printf("Problem");
    gotoxy(91, row);
    printf("Prescribed Doctor");
    gotoxy(1, ++row);
    printf("**************************************************************************************************************");
    row++;

    while (fread(&p, sizeof(p), 1, ek) == 1)
    {
        if ((strcmp(p.First_Name, name) == 0))
        {
            gotoxy(1, row);
            printf("| %s %s", p.First_Name, p.Last_Name);
            gotoxy(20, row);
            printf("| %c", p.Gender);
            gotoxy(27, row);
            printf("| %d", p.age);
            gotoxy(32, row);
            printf("| %s", p.Address);
            gotoxy(50, row);
            printf("| %s", p.Contact_no);
            gotoxy(65, row);
            printf("| %s", p.Problem);
            gotoxy(90, row);
            printf("| %s ", p.Doctor);
            gotoxy(110, row);
            printf("|");
            row++;
            gotoxy(1, row);
            printf("--------------------------------------------------------------------------------------------------------------");
            row++;
            gotoxy(10, row);

            printf("\n Press d character for the Updating operations : ");
            ch = getche();
            if (ch == 'd' || ch == 'D')
            {
                fwrite(&p, sizeof(p), 1, ft);
                printf("\n\n\n\t...Patient Record Deleted Successfully.... ");
            }
            found = 1;
        }
        else
        {
            fwrite(&p, sizeof(p), 1, ft);
        }
    }
    if (found == 0)
    {
        printf("\n\t\tNo Record Found.....");
    }
    fclose(ft);
    fclose(ek);
    remove("Record1");
    rename("TempRecord", "Record1");
    getch();
    MainMenu();
}

// ********************** Exit Function **********************
void Exit(void)
{
    system("cls");
    Title();
    printf("\n\n\n\t\t\t\tThank You For Visiting :) ");
    getch();
}