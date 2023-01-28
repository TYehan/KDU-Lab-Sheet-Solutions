#include <iostream>
using namespace std;

int main()
{
    int x, y;

    cout << " Enter the x coordinate point : ";
    cin >> x;
    cout << " Enter the y coordinate point : ";
    cin >> y;

    if(x>0 && y>0)
        cout << x << "," << y << " lies in the First Quadrant ";
    if(x<0 && y>0)
        cout << x << "," << y << " lies in the Second Quadrant ";
    if(x<0 && y<0)
        cout << x << "," << y << " lies in the Third Quadrant ";
    if(x>0 && y<0)
        cout << x << "," << y << " lies in the Forth Quadrant ";
    if(x==0 && y==0)
        cout << x << "," << y << " lies on the origin ";
    if(x!=0 && y==0)
        cout << x << "," << y << " lies on x - axis ";
    if(x==0 && y!=0)
        cout << x << "," << y << " lies on y - axis ";

    return 0;
}
