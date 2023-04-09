#include <iostream>
using namespace std;

int num[20];
int p, n, o, e, z; //positive, negative odd ,even zeros

int main()
{
    cout << "Enter 20 numbers in to the array" << endl;
    for(int i=0; i<20; i++)
        cin >> num[i];

//Counting Positive numbers
    p=0;
    for(int i=0; i<20; i++)
        {
            if(num[i]>0)
                p++;
        }

//Counting Negative numbers
    n=0;
    for(int i=0; i<20; i++)
        {
            if(num[i]<0)
                n++;
        }

//Counting Even numbers
    e=0;
    for(int i=0; i<20; i++)
        {
            if(num[i]%2==0)
                e++;
        }

//Counting Odd numbers
    o=0;
    for(int i=0; i<20; i++)
        {
            if(num[i]%2!=0)
                o++;
        }

//Counting Zeros
    z=0;
    for(int i=0; i<20; i++)
        {
            if(num[i]==0)
                z++;
        }

    cout << "Number of positive numbers : " << p << endl
         << "Number of negative numbers : " << n << endl
         << "Number of even numbers : " << e << endl
         << "Number of odd numbers : " << o << endl
         << "Number of zeros : " << z << endl;

    return 0;
}
