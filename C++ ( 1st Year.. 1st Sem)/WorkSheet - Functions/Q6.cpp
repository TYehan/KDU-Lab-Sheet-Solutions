#include <iostream>
using namespace std;

int mark;
string grade(string g);
string g;

int main()
{
    cout << " Enter your marks out of 100 : ";
    cin >> mark;
    if(mark<=0 && mark>=100)
    {
        grade(g);
        cout << grade(g) << endl;
    }
    else
        cout << " Error: Invalid marks " << endl;
    return 0;
}

string grade(string g)
{
    if(mark>=91 && mark<=100)
        return "AA";
    else if(mark>=81 && mark<=90)
        return "AB";
    else if(mark>=71 && mark<=80)
        return "BB";
    else if(mark>=61 && mark<=70)
        return "BC";
    else if(mark>=51 && mark<=60)
        return "CD";
    else if(mark>=41 && mark<=50)
        return "DD";
    else if(mark<=40)
        return "Fail";
}
