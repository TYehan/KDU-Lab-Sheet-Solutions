#include <iostream>

using namespace std;

int main()
{
    const float pi = 3.14;
    float area, perimeter, radius;

    cout<< "Enter the radius : ";
    cin>> radius;

    perimeter = 2*pi*radius;
    area = radius*radius * 22/7;

    cout<< "------------------------------" << endl
        << " The perimeter is, " << perimeter << endl
        << " The area is, " << area << endl
        << "------------------------------" ;

    return 0;
}
