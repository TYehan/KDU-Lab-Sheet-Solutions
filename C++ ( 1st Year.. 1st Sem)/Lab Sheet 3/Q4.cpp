#include <iostream>

using namespace std;

int main()
{
    int mark1, mark2, mark3, mark4, mark5;
    float percentage=0;

    cout << " Enter subject mark 1 : ";
    cin >> mark1;
    cout << " Enter subject mark 2 : ";
    cin >> mark2;
    cout << " Enter subject mark 3 : ";
    cin >> mark3;
    cout << " Enter subject mark 4 : ";
    cin >> mark4;
    cout << " Enter subject mark 5 : ";
    cin >> mark5;

    percentage = (mark1+mark2+mark3+mark4+mark5)*100/500;

    cout << "----------------------------------" << endl
         << " The percentage is : " << percentage << "%" << endl
         << "----------------------------------" << endl;

    return 0;
}
