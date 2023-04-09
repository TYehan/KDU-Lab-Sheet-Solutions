#include <iostream>
using namespace std;

int n;
void isPal();

int main()
{
    cout << " Enter a number : ";
    cin >> n;
    isPal();

    return 0;
}
void isPal()
{
    int check_n,remain,reverse_n=0;
    check_n=n; //storing number to compare it later
    while(n!=0)
    {
        remain = n%10;
        reverse_n = reverse_n*10 + remain;
        n/=10;
    }
    if(reverse_n==check_n)
        cout << "\n The number is palindrome" << endl;
    else
        cout << "\n The number is not a palindrome" << endl;
}
