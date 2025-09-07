#include <stdio.h>
#include <stdlib.h>

typedef struct student
{
    int roll;
    char name[20];
    struct subject
    {
        int scode;
        char sname[20];
        int mark;
    } sub[3];
    int total;
    float percentage;
} student;

void create()
{
    student *s;
    FILE *fp;
    int n, i, j;
    printf("Enter how many students you want : ");
    scanf("%d", &n);

    s = (student *)calloc(n, sizeof(student));

    fp = fopen("mystudents.txt", "w");

    for (i = 0; i < n; i++)
    {
        s[i].total = 0;
        s[i].percentage = 0;
        printf("Enter Roll No : ");
        scanf("%d", &s[i]);
        fflush(stdin);
        printf("Enter Name : ");
        scanf("%[^\n]s", s[i].name);
        for (j = 0; j < 3; j++)
        {
            printf("Enter Marks of subject%d : ", j + 1);
            scanf("%d", &s[i].sub[j].mark);
            s[i].total += s[i].sub[j].mark;
        }
        s[i].percentage = s[i].total / 3.0;
        fwrite(&s[i], sizeof(student), 1, fp);
    }
    fclose(fp);
}
void display()
{
    student s1;
    int j;
    FILE *fp;
    fp = fopen("mystudents.txt", "r");
    while (fread(&s1, sizeof(student), 1, fp))
    {
        printf("\n%-5d%-20s", s1.roll, s1.name);
        for (j = 0; j < 3; j++)
        {
            printf("%4d", s1.sub[j].mark);
        }
        printf("%5d%7.2f", s1.total, s1.percentage);
    }
}
void append()
{
    student *s;
    FILE *fp;
    int n, i, j;
    printf("Enter how many students you want : ");
    scanf("%d", &n);

    s = (student *)calloc(n, sizeof(student));

    fp = fopen("mystudents.txt", "a");

    for (i = 0; i < n; i++)
    {
        s[i].total = 0;
        s[i].percentage = 0;
        printf("Enter Roll No : ");
        scanf("%d", &s[i]);
        fflush(stdin);
        printf("Enter Name : ");
        scanf("%[^\n]s", s[i].name);
        for (j = 0; j < 3; j++)
        {
            printf("Enter Marks of subject%d : ", j + 1);
            scanf("%d", &s[i].sub[j].mark);
            s[i].total += s[i].sub[j].mark;
        }
        s[i].percentage = s[i].total / 3.0;
        fwrite(&s[i], sizeof(student), 1, fp);
    }
    fclose(fp);
}
void noofrecord()
{
    student s1;
    FILE *fp;
    fp = fopen("mystudents.txt", "r");
    fseek(fp, 0, SEEK_END);
    int n = ftell(fp) / sizeof(student);
    printf("\n\nNO OF RECORDS = %d", n);
    fclose(fp);
}
void search()
{
    student s1;
    int j, roll, found = 0;
    FILE *fp;
    fp = fopen("mystudents.txt", "r");
    printf("Enter Roll No to Search : ");
    scanf("%d", &roll);
    while (fread(&s1, sizeof(student), 1, fp))
    {
        if (s1.roll == roll)
        {
            found = 1;
            printf("\n%-5d%-20s", s1.roll, s1.name);
            for (j = 0; j < 3; j++)
            {
                printf("%4d", s1.sub[j].mark);
            }
            printf("%5d%7.2f", s1.total, s1.percentage);
        }
    }
    if (!found)
    {
        printf("\nRecord Not Found\n");
    }
    fclose(fp);
}

void update()
{
    student s1;
    int j, roll, found = 0;
    FILE *fp, *fp1;
    fp = fopen("mystudents.txt", "r");
    fp1 = fopen("temp.txt", "w");
    printf("Enter Roll No to Update : ");
    scanf("%d", &roll);
    while (fread(&s1, sizeof(student), 1, fp))
    {
        if (s1.roll == roll)
        {
            s1.total = 0;
            s1.percentage = 0;
            found = 1;
            fflush(stdin);
            printf("Enter New Name : ");
            scanf("%[^\n]s", s1.name);
            for (j = 0; j < 3; j++)
            {
                printf("Enter New Marks of subject%d : ", j + 1);
                scanf("%d", &s1.sub[j].mark);
                s1.total += s1.sub[j].mark;
            }
            s1.percentage = s1.total / 3.0;
        }
        fwrite(&s1, sizeof(student), 1, fp1);
    }
    fclose(fp);
    fclose(fp1);
    if (found)
    {
        fp1 = fopen("temp.txt", "r");
        fp = fopen("mystudents.txt", "w");

        while (fread(&s1, sizeof(student), 1, fp1))
        {
            fwrite(&s1, sizeof(student), 1, fp);
        }

        fclose(fp);
        fclose(fp1);
    }
    else
    {
        printf("\nRecord Not Found\n");
    }
}

void delete_rec()
{
    student s1;
    int j, roll, found = 0;
    FILE *fp, *fp1;
    fp = fopen("mystudents.txt", "r");
    fp1 = fopen("temp.txt", "w");
    printf("Enter Roll No to Delete : ");
    scanf("%d", &roll);
    while (fread(&s1, sizeof(student), 1, fp))
    {
        if (s1.roll == roll)
        {
            found = 1;
        }
        else
        {
            fwrite(&s1, sizeof(student), 1, fp1);
        }
    }
    fclose(fp);
    fclose(fp1);
    if (found)
    {
        fp1 = fopen("temp.txt", "r");
        fp = fopen("mystudents.txt", "w");

        while (fread(&s1, sizeof(student), 1, fp1))
        {
            fwrite(&s1, sizeof(student), 1, fp);
        }

        fclose(fp);
        fclose(fp1);
    }
    else
    {
        printf("\nRecord Not Found\n");
    }
}

void sort_total_on_screen(){
    student *s, s1;
    FILE *fp;
    int i, j;
    fp = fopen("mystudents.txt", "r");
    fseek(fp, 0, SEEK_END);
    int n = ftell(fp)/sizeof(student);
    s = (student*)calloc(n, sizeof(student));

    rewind(fp);
    for(i=0; i<n; i++){
        fread(&s[i], sizeof(student), 1, fp);
    }
    for(i=0; i<n; i++){
        for(j=i+1; j<n; j++){
            if(s[i].total<s[j].total){
                s1 = s[i];
                s[i] = s[j];
                s[j] = s1;
            }
        }
    }

    for(i=0; i<n; i++){
        printf("\n%-5d%-20s", s[i].roll, s[i].name);
        for (j = 0; j < 3; j++)
        {
            printf("%4d", s[i].sub[j].mark);
        }
        printf("%5d%7.2f", s[i].total, s[i].percentage);
    }

    fclose(fp);
}

void sort_total_in_file(){
    student *s, s1;
    FILE *fp;
    int i, j;
    fp = fopen("mystudents.txt", "r");
    fseek(fp, 0, SEEK_END);
    int n = ftell(fp)/sizeof(student);
    s = (student*)calloc(n, sizeof(student));

    rewind(fp);
    for(i=0; i<n; i++){
        fread(&s[i], sizeof(student), 1, fp);
    }

    fclose(fp);

    for(i=0; i<n; i++){
        for(j=i+1; j<n; j++){
            if(s[i].total<s[j].total){
                s1 = s[i];
                s[i] = s[j];
                s[j] = s1;
            }
        }
    }

    fp = fopen("mystudents.txt", "w");

    for(i=0; i<n; i++){
        printf("\n%-5d%-20s", s[i].roll, s[i].name);
        for (j = 0; j < 3; j++)
        {
            printf("%4d", s[i].sub[j].mark);
        }
        printf("%5d%7.2f", s[i].total, s[i].percentage);
        fwrite(&s[i], sizeof(student), 1, fp);
    }

    fclose(fp);
}

int main()
{
    int ch;
    do
    {
        printf("\n1. CREATE");
        printf("\n2. DISPLAY");
        printf("\n3. APPEND");
        printf("\n4. NO OF RECORDS");
        printf("\n5. SEARCH");
        printf("\n6. UPDATE");
        printf("\n7. DELETE");
        printf("\n8. SORT BY TOTAL DESC - ON SCREEN");
        printf("\n9. SORT BY TOTAL DESC - ON FILE");
        printf("\n0. EXIT");
        printf("\nEnter your choice : ");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            create();
            break;
        case 2:
            display();
            break;
        case 3:
            append();
            break;
        case 4:
            noofrecord();
            break;
        case 5:
            search();
            break;
        case 6:
            update();
            break;
        case 7:
            delete_rec();
            break;
        case 8:
            sort_total_on_screen();
            break;
        case 9:
            sort_total_in_file();
            break;
        default:
            printf("\nInvalid Input");
            break;
        }
    } while (ch != 0);
}