#include <iostream>

using namespace std;

int main()
{
    const float pound=2.2046, ounce=35.2739;
    float weight;
    cout << "Enter the weight in kilograms : ";
    cin >> weight;
    cout.setf(ios::fixed);
    cout.precision(4);
    cout << "Weight in pounds: " << weight*pound << endl
         << "Weight in ounces: " << weight*ounce << endl;

    return 0;
}
