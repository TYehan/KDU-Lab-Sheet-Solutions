#include <iostream>
using namespace std;

int is_prime(int n);
int n;

int main()
{
    cout << "Enter a positive integer: ";
    cin >> n;

    is_prime(n);
    cout << is_prime(n) << endl;

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

/*#include <iostream>
using namespace std;

int is_prime();
int n;
bool isPrime = true;

int main()
{
    cout << "Enter a positive integer: ";
    cin >> n;
    if(n<=1)
        isPrime = false;
    else
        is_prime();
    cout << isPrime;

    return 0;
}

int is_prime()
{
    for(int i=2; i<=n-1; i++)
    {
        if(n==2 || n%i==0)
            isPrime = false;
    }
    return isPrime;
}
*/
