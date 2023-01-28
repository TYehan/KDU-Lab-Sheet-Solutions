#include <iostream>
using namespace std;

int sum_from_to(int first,int last);
int sum;

int main()
{
    int first,last;

    cout << "Enter the first number : ";
    cin >> first;
    cout << "Enter the last number : ";
    cin >> last;
    sum_from_to(first,last);
    cout << "\nsum from "<<first<<" to "<<last<<" is "<<sum<< endl;

    return 0;
}

int sum_from_to(int first,int last)
{
    if(first<last)
    {
        for(int i=first; i<=last; i++)
        {
            sum += i;
        }
    }
    else
    {
        for(int i=first; i>=last; i--)
        {
            sum += i;
        }
    }
    return sum;
}
