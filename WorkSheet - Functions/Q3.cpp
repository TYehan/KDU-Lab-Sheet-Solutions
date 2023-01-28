#include <iostream>
using namespace std;

int num=0;

int main()
{
        cout << "Enter an integer number : ";
        cin >> num;
        if(num==0)
            cout << num << " is neither even nor odd " << endl;
        else if(num%2==0 && num!=0)
            cout << num << " is an even number " << endl;
        else
            cout << num << " is an odd number " << endl;

    return 0;
}
