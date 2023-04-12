//T_Yehan
#include <iostream>

using namespace std;

int main()
{
    float m, min, speed;

    cout<< "Enter the distance in Meters : ";
    cin>> m;
    cout<< "Enter the time in Minutes : ";
    cin>> min;

    speed = m/min;

    cout<< "-----------------------------------------------" << endl
        << " The speed in kilometers per hour is : " << speed*60/1000 << endl
        << " The speed in miles per hour is : " << speed*0.000621 << endl
        << "-----------------------------------------------" ;

    return 0;
}
