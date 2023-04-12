//T_Yehan
#include <iostream>
using namespace std;

int main()
{
    int b_no,x,i; // b_no is Base number and x is exponent
    double power;

    cout << "Enter the base number : ";
    cin >> b_no;
    cout << "Enter the exponent : ";
    cin >> x;

    i=1;
    power=1;

    while(i<=x)
    {
        power = power * b_no;
        i++;
    }

    cout.setf(ios::fixed);
    cout.precision(0);
    cout << b_no << " ^ " << x << " ,is : " << power << endl;

    return 0;
}
