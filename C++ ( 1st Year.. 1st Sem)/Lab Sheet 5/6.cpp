//T_Yehan
#include <iostream>
using namespace std;

int main()
{
    int num, number, sum=0, remainder=0; //number is taken to store the input num value

    cout << " Input the number : ";
    cin >> num;
    number = num;

    while(num!=0)
    {
        remainder = num % 10;
        sum = sum + remainder;
        num /= 10;
    }

    cout << " The sum of the digits of " << number << " is : " << sum << endl;

    return 0;
}
