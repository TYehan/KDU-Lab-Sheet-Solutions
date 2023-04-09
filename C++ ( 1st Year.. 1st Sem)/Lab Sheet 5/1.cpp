#include <iostream>

using namespace std;

int main()
{
    int number, i;
    double fact;

    cout << " Input a number to find the factorial : ";
    cin >> number;

    i=1;
    fact=1;

    while(i<=number)
    {
        fact = fact*i;
        i++;
    }
    cout.setf(ios::fixed);
    cout.precision(0);
    cout << " The factorial of the given number is : " << fact << endl;

    return 0;
}
