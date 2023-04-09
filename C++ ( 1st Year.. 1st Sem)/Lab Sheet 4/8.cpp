#include <iostream>
using namespace std;

int main()
{
    int mark;
    cout << " Enter marks : ";
    cin >> mark;

    if(mark==100)
    {
        cout << " A " << endl;
        cout << " Superb ";
    }
    else if(mark<=99 && mark>=90)
    {
        cout << " A " << endl;
        cout << " Excellent ";
    }
    else if(mark<=89 && mark>=80)
    {
        cout << " B " << endl;
        cout << " Very Good ";
    }
    else if(mark<=79 && mark>=70)
    {
        cout << " C " << endl;
        cout << " Good ";
    }
    else if(mark<=69 && mark>=60)
    {
        cout << " D " << endl;
        cout << " Average ";
    }
    if(mark<=60 && mark>=0)
    {
        cout << " F " << endl;
        cout << " Weak ";
    }
    return 0;
}
