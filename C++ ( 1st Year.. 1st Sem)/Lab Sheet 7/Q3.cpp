#include <iostream>
using namespace std;

int reduce(int &m,int &n);
void g_c_d(int num,int denom);
int m,n,gcd;

int main()
{
    cout << "Enter two positive integers :" << endl;
    cin >> m >> n;

    if(reduce(m,n))
        cout << m <<'/'<< n << endl;
    else
        cout << "fraction error";
}

int reduce(int &m,int &n)
{
    if(m>0 && n>0)
    {
        g_c_d(m,n);
        m/=gcd;
        n/=gcd;
        return 1;
    }
    else
        return 0;
}

void g_c_d(int num,int denom)
{
    for(int i=1; i<=num || i<=denom; i++)
    {
        if(num%i==0 && denom%i==0)
        gcd = i;
    }
}
