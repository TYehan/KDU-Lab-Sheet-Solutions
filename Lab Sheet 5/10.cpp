#include <iostream>
using namespace std;

int main()
{
    int rows;

    cout << " Enter the number of rows : ";
    cin >> rows;

    for(int i=rows; i>=1; i--)
    {
        for(int space=i; space<=rows; space++)
        {
            cout << "  ";
        }
        for(int j=1; j<=(2*i-1); j++)
        {
            cout << "* ";
        }
        cout << "\n";
    }
    return 0;
}
