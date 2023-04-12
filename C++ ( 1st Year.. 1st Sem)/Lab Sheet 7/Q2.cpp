//T_Yehan
#include <iostream>
#include <conio.h>
using namespace std;

void digital_name();
int n;

int main()
{
    cout << "Enter an integer between 1 to 9 : ";
    cin >> n;
    if(n>=1 && n<=9)
        digital_name();
    else
        cout << "digit error" << endl;
        getch();
    return 0;
}

void digital_name()
{
    string numbers[10]={"digit error","one","two","three","four","five","six","seven","eight","nine"};
    cout << numbers[n] << "\n";
}
