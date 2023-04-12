//T_Yehan
#include <iostream>
using namespace std;

int a,b,c,maxi,mini;
void maximum();
void minimum();

int main()
{
    cout << "Enter three numbers : ";
    cin >> a>> b>> c;
    maximum();
    minimum();
    return 0;
}

void maximum()
{
    if(a>=b && a>=c)
        maxi=a;
    if(b>=a && b>=c)
        maxi=b;
    if(c>=a && c>=b)
        maxi=c;
    cout << "Maximum number is: "<< maxi << endl;
}
void minimum()
{
    if(a<=b && a<=c)
        mini=a;
    if(b<=a && b<=c)
        mini=b;
    if(c<=a && c<=b)
        mini=c;
    cout << "Minimum number is: "<< mini << endl;
}
