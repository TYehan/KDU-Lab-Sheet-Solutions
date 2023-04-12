//T_Yehan
#include <iostream>
#include <conio.h>
using namespace std;

int num=0;
char ch;

void menu()
{
    cout << "\n----------------------------------------------------------" << endl
         << "\t\t\tMenu" << endl
         << "----------------------------------------------------------" << endl
         << " [1]\tEnter a New number" << endl
         << " [2]\tCheck whether the number is an odd number or not" << endl
         << " [3]\tCheck whether the number is an even number or not" << endl
         << " [4]\tCheck whether the number is a prime number or not" << endl
         << " [5]\tExit" << endl
         << "----------------------------------------------------------" << endl;
}

void  change()
{
    system("cls");
    num=0;
    cout << " \nEnter the new number" << endl;
    cin >> num;
}

void odd()
{
    if(num%2!=0)
        cout << " \nThis is an odd number\n";
    else
        cout << " \nThis is not an odd number\n";
}

void even()
{
    if(num%2==0)
        cout << " \nThis is an even number\n";
    else
        cout << " \nThis is not an even number\n";
}

void prime()
{
    int c=0;
    for(int i=1; i<=num; i++)
    {
        if(num%i==0)
            c++;
    }
    if(c==2)
        cout << " \nThis is a prime number\n";
    else
        cout << " \nThis is not a prime number\n";
}

int main()
{

    int op;
    bool isNew='FALSE';

    cout << " \nEnter the number : ";
    cin >> num;

    do{
        menu();
        cout <<" \nSelect the option number 1-5 : ";
        cin >> op;

        switch(op)
        {
            case 1: change();
                break;
            case 2: odd();
                break;
            case 3: even();
                break;
            case 4: prime();
                break;
            case 5: cout << " \nExit" << endl;
                break;
            default: cout << " \nInvalid Input " << endl;
                break;
        }


    if(op==2 || op==3 || op==4)
        {
            do{
            cout << " \nDo you want another option Y/N : " << endl;

                ch=getche();
                if(ch=='n' || ch=='N')
                op=5;
            }while(!(ch=='Y' || ch=='y' || ch=='N' || ch=='n'));
        }

    }while(op!=5);


    return 0;
}
