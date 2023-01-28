#include <iostream>
using namespace std;

void sort3(float a,float b,float c);
float x,y,z;

int main()
{
    cout << "Enter three floating points" << endl;
    cin >> x >> y >> z;
    sort3(x,y,z);
    cout << x <<"  "<< y <<"  "<< z << endl;

}

void sort3(float a,float b,float c)
{
    float temp;
    if(x>y && x>z)
    {
        if(z>y)
        {
            temp=y;
            y=z;
            z=temp;
        }
    }
    else if(y>x && y>z)
    {
        if(x>z)
        {
            temp=x;
            x=y;
            y=temp;
        }
        else
        {
            temp=x;
            x=y;
            y=z;
            z=temp;
        }
    }
    else if(z>x && z>y)
    {
        if(x>y)
        {
            temp=x;
            x=z;
            z=y;
            y=temp;
        }
        else
        {
            temp=x;
            x=z;
            z=temp;
        }
    }
}

