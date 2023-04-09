#include <iostream>
#include <conio.h>
#include <windows.h>
using namespace std;

int a,b;
int area;
char ch;

//Area of a Square
void square()
{
    cout << " \nEnter the length : ";
    cin >> a;
    cout << " \nEnter the width : ";
    cin >> b;
    area = a*b;
    cout << " \nThe Area is : " << area << endl;
}

//Area of a Triangle
void triangle()
{
    cout << " \nEnter the base length : ";
    cin >> a;
    cout << " \nEnter the height : ";
    cin >> b;
    area = (a*b)/2;
    cout << " \nThe Area is : " << area << endl;
}

//Area of a Circle
void circle()
{
    const int pi=3.14;
    cout << "\nEnter the radius : ";
    cin >> a;
    area = pi*a*a;
    cout << " \nThe Area is : " << area << endl;
}

//Area of a Parallelogram
void para()
{
    cout << " \nEnter the base : ";
    cin >> a;
    cout << " \nEnter the height : ";
    cin >> b;
    area = a*b;
    cout << " \nThe Area is : " << area << endl;
}

//menu
void menu()
{
    cout <<"\n-----------------------------------" << endl
         <<"\t\tMENU" << endl
         <<"-----------------------------------" << endl
         <<" [1]\tArea of a Square/Rectangle" << endl
         <<" [2]\tArea of a Triangle" << endl
         <<" [3]\tArea of a Circle" << endl
         <<" [4]\tArea of a Parallelogram" << endl
         <<" [5]\tExit" << endl
         <<"-----------------------------------" << endl;
}

int main()
{
    int op;

    do{
        system("cls");
        menu();
        cout <<" \nSelect the option number 1-5 : ";
        cin >> op;

        switch(op)
        {
            case 1: square();
                break;
            case 2: triangle();
                break;
            case 3: circle();
                break;
            case 4: para();
                break;
            case 5: cout << " \nExit" << endl;
                break;
            default: cout << " \nInvalid Input " << endl;
                break;
        }

        if(op==1 || op==2 || op==3 || op==4)
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
