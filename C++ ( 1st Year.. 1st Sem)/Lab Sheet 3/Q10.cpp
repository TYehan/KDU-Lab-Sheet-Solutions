//T_Yehan
#include <iostream>

using namespace std;

int main()
{
    int a, b;
    cout << " Enter a : " ;
    cin >> a;
    cout << " Enter b : " ;
    cin >> b;

    cout << " Before swap a = " << a << " b = " << b << endl;

            a = a * b;
            b = a / b;
            a = a / b;

    cout << " After swap a = " << a << " b = " << b << endl;

    return 0;
}
