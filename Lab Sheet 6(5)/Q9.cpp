#include <iostream>
using namespace std;

int g_c_d(int x,int y);
int gcd;
int x,y;
int main()
{
    cout << "Enter two positive integers : "<<endl;
    cin >> x >> y;
    if(x<=0 || y<=0)
    cout << "\nThe greatest common divisor is : 0";
    else
    g_c_d(x,y);
    return 0;
}

int g_c_d(int x,int y)
{
    for(int i=1; i<=x||i<=y; i++)
    {
        if(x%i==0 && y%i==0)
        gcd = i;
    }
    cout << "\nThe greatest common divisor is : "<<gcd<<endl;
    return gcd;
}
