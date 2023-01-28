#include <iostream>
using namespace std;

int initial[10], split_1[5], split_2[5];

int main()
{
    cout << "Enter 10 numbers into the array:" << endl;

    for(int i=0; i<10; i++)
        cin >> initial[i];

    for(int i=0; i<5; i++)
        split_1[i]=initial[i];

    for(int i=5; i<10; i++)
        split_1[i]=initial[i];

    cout << "INITIAL array:" << endl;
    for(int i=0; i<10; i++)
        cout << initial[i] << " ";
        cout <<"\n\n";
    cout << "After Splitting:" << endl;
    for(int i=0; i<5; i++)
        cout << split_1[i] << " ";
        cout <<"\n";
    for(int i=5; i<10; i++)
        cout << split_1[i] << " ";

    return 0;
}
