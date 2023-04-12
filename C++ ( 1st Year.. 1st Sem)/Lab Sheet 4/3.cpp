//T_Yehan
#include <iostream>

using namespace std;

int main()
{
    float num1, num2, large=0;
    cout << "Enter a two numbers : ";
    cin >> num1 >> num2;

    large = num1;

    if(large<num2)
    large = num2;


    cout << " The largest number is " << large;


    return 0;
}
