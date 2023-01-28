#include <iostream>

using namespace std;

int main()
{
    int x, y, z, max;
    cout << " Enter three different numbers  : ";
    cin >> x >> y >> z;

    if(x>y)
        max = x;
    if(y>z)
        max = y;
    if(z>x)
        max = z;

    cout << " The largest number is : " << max ;

    return 0;
}
