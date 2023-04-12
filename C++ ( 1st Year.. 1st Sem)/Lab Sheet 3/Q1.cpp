//T_Yehan
#include <iostream>
#include <string.h>

using namespace std;

int main()
{
    string name, address;
    int age;

    cout << "Enter your Name: " ;
    getline(cin, name);

    cout << "Enter your Age: " ;
    cin >> age;

    cin.sync();
    cout << "Enter your Address: " ;
    getline(cin, address);



    cout << "--------------------------------" << endl
         << "Name : " << name << endl
         << "Age : " << age << endl
         << "Address : " << address << endl
         << "--------------------------------" << endl;

    return 0;
}
