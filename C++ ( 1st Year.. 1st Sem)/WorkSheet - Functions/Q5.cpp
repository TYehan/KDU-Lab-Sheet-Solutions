//T_Yehan
#include <iostream>
using namespace std;

int is_prime(int n);
int n;

int main()
{
    cout << "Enter a positive integer number : ";
    cin >> n;
    is_prime(n);
    if(is_prime(n)==1)
        cout << n << " is a prime number " << endl;
    else
        cout << n << " is not a prime number " << endl;
    return 0;
}

int is_prime(int n)
{
    if(n<=1)
    return 0;

    for(int i=2; i<=n-1; i++)
    {
        if(n==2 || n%i==0)
        return 0;
    }
    return 1;
}
