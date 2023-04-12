//T_Yehan
#include <iostream>
using namespace std;

void swap_floats(int a,int b);
float x,y;

int main()
{
    cout << "Enter two float numbers : " << endl;
    cin >> x >> y;
    swap_floats(x,y);
    cout << x << " " << y << endl;

    return 0;
}

void swap_floats(int a,int b)
{
    float temp;
    temp = x;
    x = y;
    y = temp;
}
