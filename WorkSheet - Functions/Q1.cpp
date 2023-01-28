#include <iostream>
using namespace std;

int radius;
float cir, area; // cir is circumference
const float pi = (22/7);
void solve();

int main()
{
    cout << "Enter the radius : ";
    cin >> radius;
    if(radius>=0)
        solve();
    else
        cout << "Error, Enter a positive value" << endl;
    return 0;
}
void solve()
{
    cir = 2*pi*radius;
    area = pi*radius*radius;

    cout << "The circumference is : "<< cir<< endl;
    cout << "The area is : "<<area<< endl;
}
