#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<stdlib.h>
#include"Sign-Log.c"

// Declaration of all Function
void lodingBar();
int welcomeScreen();
void acceptInput();
void signUp();
void login();
void footerOption();

// <------- Main Funcation ------->
int main(){
    system("cls");
    welcomeScreen();   
}

// Loding Bar ------->
void lodingBar(){
    system("cls");
    printf("\n\n\n\n\n\n\n\n\t\t\t Loading...");
    for(int i=0; i<25; i++){
        for(int j=0; j<100000; j++){
            for(int k=0; k<200; k++){
            }
        }
        printf(".");
    }
    system("cls");
}

// Welcome Screen ------->
int welcomeScreen(){
    printf("\n\n\t\t <<===== Chandan Programmer =====>> \n");
    printf("\n\t\t\tWelcome to Login or SignUp.........\n");
    printf("\n\t\t\tPress 1 for Login\n");
    printf("\t\t\tPress 2 for Signup\n");
    printf("\t\t\tpress 0 for Exit\n\n");
    printf("\n\t\t*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n\n");
    acceptInput();
}

// Accept Input ------->
void acceptInput(){
    char ch;
    printf("\t\t\tpress Your Key : ");
    ch = getch();
            switch(ch){
            case '1': 
                login();
                break;
            case '2':
                signUp();
                break;
            case '0':
                exit(0);
                break;
            default:
                printf("\n\t\t\tInvalid Your choice Again\n ");
                acceptInput();
                break;
        }
}


// Footer Key Hint ------->
void footerOption(int val){
    printf("\n\n\t\t\tHome Page to Press 9");
    if(val==1){
        printf("\n\t\t\tLogin Page to Press %d", val);
    }
    if(val==2){
        printf("\n\t\t\tSignUp Page to Press %d", val);
    }
    printf("\n\t\t\tExit to Press 0");
    InKey:
    printf("\n\n\t\t\tPress your key : ");
    
    int key=getch();
    if(key=='2'){
        signUp();
    }
    if(key=='1'){
        login();
    }
    if(key=='0'){
        exit(0);
    }
    if(key=='9'){
        lodingBar();
        welcomeScreen();
    }
    else{
        printf("\n\n\t\t\tInvalid Key! Enter Again... ");
        goto InKey;
    }
}


