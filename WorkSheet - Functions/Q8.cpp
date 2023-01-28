#include <iostream>
using namespace std;

float num1,num2,add,sub,mul;
int addition(float num1,float num2);
int subtraction(float num1,float num2);
int multiplication(float num1,float num2);

int main()
{
    cout << " Enter the first number : ";
    cin >> num1;
    cout << " Enter the second number : ";
    cin >> num2;
    cout << "---------------------------------"<< endl
         <<num1<<" + "<<num2<<" = "<<addition(num1,num2)<< endl
         <<num1<<" - "<<num2<<" = "<< subtraction(num1,num2)<< endl
         <<num1<<" * "<<num2<<" = "<< multiplication(num1,num2)<< endl;
    return 0;
}
int addition(float num1,float num2)
{
    add = num1+num2;
    return add;
}
int subtraction(float num1,float num2)
{
    sub= num1-num2;
    return sub;
}
int multiplication(float num1,float num2)
{
    mul= num1 * num2;
    return mul;
}
