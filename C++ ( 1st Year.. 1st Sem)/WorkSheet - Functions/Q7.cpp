//T_Yehan
#include <iostream>
using namespace std;

int number, i;
double fact;
int factorial(int fact);

int main()
{

    cout << " Input a number to find the factorial : ";
    cin >> number;
    if(number<0)
        cout << " Error : Invalid Number " << endl;
    else
    {
        cout.setf(ios::fixed);
        cout.precision(0);
        cout << " The factorial of the given number is : " << factorial(fact) << endl;
    }
    return 0;
}
int factorial(int fact)
{
    i=1;
    fact=1;
    while(i<=number)
    {
        fact = fact*i;
        i++;
    }
    return fact;
}
