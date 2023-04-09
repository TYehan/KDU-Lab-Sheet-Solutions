#include <iostream>
using namespace std;

int main()
{
    int number, reversed_n=0, remain; //remain is  the remainder

    cout << " Input a number : ";
    cin >> number;

    while(number!=0)
    {
        remain = number % 10;
        reversed_n = reversed_n * 10 + remain;
        number /= 10;
    }

    cout << " Reverse number : " << reversed_n;

    return 0;
}
