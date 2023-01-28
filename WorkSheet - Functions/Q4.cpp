#include <iostream>
using namespace std;

void elg(); //function use to find the eligibility
int age;

int main()
{
    cout << " Enter your age : ";
    cin >> age;
    elg();
    return 0;
}
void elg()
{
    if(age>=18)
        cout << " You are elligible to vote" << endl;
    else
        cout << " You are not ellible to vote" << endl;
}
