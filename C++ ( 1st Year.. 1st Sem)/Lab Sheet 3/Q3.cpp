//T_Yehan
#include <iostream>

using namespace std;

int main()
{
    int num1, num2, num3, total=0;
    float average=0;

    cout << " Enter number 1 : ";
    cin >> num1;
    cout << " Enter number 2 : ";
    cin >> num2;
    cout << " Enter number 3 : ";
    cin >> num3;

    total = num1+num2+num3;
    average = total / 3;

    cout << "----------------------------------" << endl
         << " The total is : " << total << endl
         << " The average is : " << average << endl
         << "----------------------------------" << endl;

    return 0;
}
