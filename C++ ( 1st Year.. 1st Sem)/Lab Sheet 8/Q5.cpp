//T_Yehan
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
    cout << "INPUT : ";
    for(int i=0; i<s; i++)
        cout << num[i] <<" ";

    int i=s-1;
    int j=i-1;
    int temp = num[i];
    while(j>=0 && i>=0)
    {
        num[i]=num[j];
        i--;
        j--;
    }
    num[i]=temp;

    cout << "\nOUTPUT : ";
    for(i=0; i<s; i++)
    cout << num[i] <<" ";

    return 0;
}
