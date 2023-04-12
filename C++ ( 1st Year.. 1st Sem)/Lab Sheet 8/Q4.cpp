//T_Yehan
#include <iostream>
using namespace std;

int num1[10], num2[10];

int main()
{
    cout << "Enter 10 numbers into the array:" << endl;

    for(int i=0; i<10; i++)
        cin >> num1[i];

    for(int i=0; i<10; i++)
        num2[i]=num1[9-i];

    for(int i=0; i<10; i++)
        cout << num2[i] << " ";

    return 0;
}

