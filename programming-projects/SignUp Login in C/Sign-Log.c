// Structure varable define
struct Information{
    char username[15];
    char password[15];
}inf;

// MAke a File Pointer
FILE *filep;

// SignUp Function ------->
void signUp(){
    lodingBar();

    int ch, calVal=1;

    printf("\n\n\n\n\t\t\t------------SignUp Zone -----------");

    filep=fopen("user.txt","a");

    printf("\n\n\t\t\t\tSet UserName     : ");
    gets(inf.username);
    fwrite(&inf.username, sizeof(inf.username), 1, filep);
    // fputs(inf.username, filep);

    printf("\n\t\t\t\tSet Password     : ");
    int i=0;
    while(1){
        ch=getch();
        if(ch==13){
            break;
        }
        printf("*");
        inf.password[i++]=ch;    
    }
    fwrite(&inf.password, sizeof(inf.password), 1, filep);
    // fputs(inf.password, filep);

    printf("\n\n\t\t\t Press Enter to continue.......");
    if(getch()==13){
        printf("\n\n\t\t\tInformation Saved.....");
    }
    fclose(filep);
    footerOption(calVal);
}

// Login Zone ------->
void login(){
    lodingBar();

    int chr, i, calVal=2;
    char usernam[15], pass[15], checkPass, checkUser;

    printf("\n\n\n\n\t\t\t------------Login Zone -----------");

    filep=fopen("user.txt","r");

    printf("\n\n\t\t\t\tEnter UserName     : ");
    gets(usernam);

    printf("\n\t\t\t\tEnter Password     : ");
    for(i=0; chr=getch()!=13; i++){
        pass[i]=chr;
       printf("*");
    }

    while(!feof(filep)){
        fread(&inf.username, sizeof(inf.username), 1, filep);
// printf("%s", inf.username);
        checkUser=strcmp(usernam,inf.username);

        fread(&inf.password, sizeof(inf.password), 1, filep);
// printf("%s", inf.password);
        checkPass=strcmp(pass,inf.password);

        if(checkUser==0&&checkPass==0){
            printf("\n\n\t\t\tHello %s Welcome Here...",inf.username);
            break;
        }
        else if(checkUser!=0&&checkPass==0){
            printf("\n\n\t\t\tInvalid Username !!!!");
            break;
        }
        else if(checkUser==0&&checkPass!=0){
            printf("\n\n\t\t\tInvalid Password !!!!");
            break;
        }
    }
    footerOption(calVal);
}