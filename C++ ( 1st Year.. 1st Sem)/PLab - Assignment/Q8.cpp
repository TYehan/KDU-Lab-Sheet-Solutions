#include <iostream>
using namespace std;

int main()
{
    int day;

    cout << " Enter the day number : " << endl;
    cin >> day;

    if(day>=6 && day<=7)
        cout << day << " is weekend day. ";
    else
        cout << day << " is a week day. ";
    return 0;
}
