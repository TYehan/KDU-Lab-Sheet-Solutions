#include <iostream>
using namespace std;

int main()
{
    int x, y, z;

    cout << " Enter the three sides of the triangle " << endl;
    cin >> x >> y >> z;

    if(x+y>=z && y+z>=x && z+x>=y)
    {
    if(x==y && y == z)
        cout << " This is an Equilateral Triangle ";
    else if(x==y || y==z || z==x)
        cout << " This is an Isosceles Triangle ";
    else
        cout << " This is a Scalene Triangle ";
    }
    else
        cout << " Invalid side lengths ";

    return 0;
}
