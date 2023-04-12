//T_Yehan
#include <iostream>

using namespace std;

int main()
{
    int x, y, z;

    cout << " Enter number x : ";
    cin >> x;
    cout << " Enter number y : ";
    cin >> y;
    cout << " Enter number z : ";
    cin >> z;

    cout << "----------------------------------" << endl
         << " (x+y)*z = " << (x+y)*z << endl
         << " x*y + y*z = " << x*y + y*z << endl
         << "----------------------------------" << endl;

    return 0;
}
