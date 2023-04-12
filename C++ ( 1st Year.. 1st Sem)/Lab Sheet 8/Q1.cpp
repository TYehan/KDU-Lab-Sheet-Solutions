//T_Yehan
#include <iostream>
using namespace std;

int num[10];
int maxi,mini;

int main()
{
    cout << "Enter 10 numbers in to the array" << endl;
    for(int i=0; i<10; i++)
        cin >> num[i];
    for(int i=0; i<10; i++)
        cout << num[i] << endl;

    maxi=num[0];
    for(int i=0; i<10; i++)
        {
            if(maxi<=num[i])
                maxi = num[i];
        }
        cout << "The maximum number is : " << maxi << endl;
    mini=num[0];
    for(int i=0; i<10; i++)
        {
            if(mini>=num[i])
                mini = num[i];
        }
        cout << "The minimum number is : " << mini << endl;

    return 0;
}
