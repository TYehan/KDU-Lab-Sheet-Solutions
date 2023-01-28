#include <iostream>
using namespace std;

int main()

{
    int day;
    cout << " Enter the day number: " ;
    cin >> day;

    if(day < 7)
    {
        if(day==1)
            cout << " Monday ";
        if(day==2)
            cout << " Tuesday ";
        if(day==3)
            cout << " Wednesday ";
        if(day==4)
            cout << " Thursday ";
        if(day==5)
            cout << " Friday ";
        if(day==6)
            cout << " Saturday ";
        if(day==7)
            cout << " Sunday ";
    }
    else
        cout << " Invalid Input";

    return 0;
}

