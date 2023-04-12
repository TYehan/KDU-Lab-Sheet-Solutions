//T_Yehan
#include <iostream>
using namespace std;

int main()
{
    int units;
    const float unit_price=100;

    cout << " Enter the units : ";
    cin >> units;

    cout.setf(ios::fixed);
    cout.precision(2);

    cout << " Unit Price : " << unit_price << endl
         << " Bill Amount : " << unit_price*units ;

    return 0;
}
