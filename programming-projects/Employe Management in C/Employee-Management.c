#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<stdlib.h>
#include<windows.h>

// Function Declaration
void loadingBar();
void normalLoadingBar();
void welcomeScreen();
void addRecord();
void listRecords();
void modifyRecords();
void deleteRecords();

// Cursor Ke Position Btane ke liye ------->
COORD coord={0,0};
void gotoxy(int x, int y){
    coord.X=x;
    coord.Y=y;
    SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), coord);
}

FILE *filep, *filetemp;

char askKey;
struct emp{
    char name[20];
    char state[10];
    int age;
    float salary;
}e;
//struct emp e;

char empname[20];
long int resize=sizeof(e);

// Main Function ------->
int main(){
    welcomeScreen();
}

// Loading Bar ------->
void loadingBar(){
    system("cls");
    gotoxy(20,10);
    printf("Loading..");
    for(int i=0; i<20; i++){
        for(int j=0; j<100000; j++){
            for(int k=0; k<300; k++){
            }
        }
        printf(".");
    }
    system("cls");
}

// Normal Loading Bar ------->
void normalLoadingBar(){
    for(int i=0; i<25; i++){
        for(int j=0; j<100000; j++){
            for(int k=0; k<200; k++){
            }
        }
        printf(".");
    }
}

// Welcome Screen ------->
void welcomeScreen(){
        start:
        system("cls");
        gotoxy(10,4);
        printf("<< ------------ Employee Management ------------ >>");
        gotoxy(20,6);
        printf("1. Add Record");
        gotoxy(20,8);
        printf("2. List Records");
        gotoxy(20,10);
        printf("3. Modify Records");
        gotoxy(20,12);
        printf("4. Delete Records");
        gotoxy(20,14);
        printf("5. Exit");
        gotoxy(20,16);
        printf("Enter Your Choice : ");
        fflush(stdin);
        char ch=getche();
            
        switch(ch){
            case '1':
                addRecord();
                break;
            case '2':
                listRecords();
                break;
            case '3':
                modifyRecords();
                break;
            case '4':
                deleteRecords();
                break;
            case '5':
                system("cls");
                exit(0);
                break;
            default:
                goto start;
    }
}

// Add Record ------->
void addRecord(){
    askKey='y';
    anotherRecord:
    loadingBar();
    gotoxy(10,4);
    printf("<< ------------ Add Record ------------ >>");
    // File Opening
    filep=fopen("emp.txt", "w");
   /* if(filep==NULL){
        filep=fopen("EMP.DAT", "wb+");
        if(filep==NULL){
            printf("Can not Open File.");
            exit(1);
        }
    }*/

    fseek(filep,0,SEEK_END);
    while(askKey=='y'){
        gotoxy(20, 6);
        printf("Enter Name : ");
        scanf("%s",e.name);
        gotoxy(20, 8);
        printf("Enter Your State : ");
        scanf("%s",e.state);
        gotoxy(20, 10);
        printf("Enter Age : ");
        scanf("%d", &e.age);
        gotoxy(20, 12);
        printf("Enter Basic Salary : ");
        scanf("%f", &e.salary);
        gotoxy(20, 14);
        printf("Press Enter to Continue...");
        getch();
        fwrite(&e, resize, 1, filep);
        gotoxy(20,16);
        printf("Saving....");
        normalLoadingBar();
        gotoxy(20, 18);
        printf("Record Saved Successfully.....");
        gotoxy(20, 20);
        printf("Add Another Record (y/n) : ");
        fflush(stdin);
        askKey = getche();
        if(askKey=='y'){
            goto anotherRecord;
        }
        else{
            welcomeScreen();
        }
    }
    fclose(filep);
}

// List Records ------->
void listRecords(){
    loadingBar();
    gotoxy(5,2);
    printf("<< -------- List Records -------- >>");
    gotoxy(7,4);
    printf(" | - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |");
    gotoxy(7,5);
    printf(" |  Emp ID  |    Employee Name      |   State     |  Age  |    Salary  |");
    gotoxy(7,6);
    printf(" | - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |");
    // File Opening
    filep=fopen("emp.txt", "r");
    /*if(filep==NULL){
        filep=fopen("EMP.DAT", "wb+");
        if(filep==NULL){
            printf("Can not Open File.");
            exit(1);
        }
    }*/
    //gotoxy(7,8);
    // Cusor ko suru me le jane ke liye
    rewind(filep);
    while(fread(&e, resize, 1, filep)==1){
        printf("%S %s %d %.2f", e.name, e.state, e.age, e.salary);
    }
    fclose(filep);
    getch();
}

// Modify Records ------->
void modifyRecords(){
    loadingBar();
    gotoxy(10,4);
    printf("<< ------------ Modify Records ------------ >>");
}

// Delete Records ------->
void deleteRecords(){
    loadingBar();
    gotoxy(10,4);
    printf("<< ------------ Delete Records ------------ >>");
}

