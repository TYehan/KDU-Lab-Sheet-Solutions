#include <iostream>
using namespace std;

int s;

int main()
{
    cout << "Enter the required array size : ";
    cin >> s;
    int num[s];
    cout << "Enter the values into the array:" << endl;

    for(int i=0; i<s; i++)
        cin >> num[i];

    cout << "INITIAL ARRAY: ";
    for(int i=0; i<s; i++)
        cout << num[i] <<" ";

    //taking each element one by one to check
    for(int cElement=0; cElement<=s; cElement++)
    {
        for(int i=cElement; i<s; i++)//checking the selected element with other elements
        {
            if(num[cElement]>num[i])
                swap(num[cElement],num[i]);
        }
    }
    cout << "\nSORTED ARRAY: ";
    for(int i=0; i<s; i++)
        cout << num[i] <<" ";

    return 0;
}
