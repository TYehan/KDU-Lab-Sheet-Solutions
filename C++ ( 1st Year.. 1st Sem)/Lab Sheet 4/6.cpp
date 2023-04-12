//T_Yehan
#include <iostream>

using namespace std;

int main()
{
    char ch;
    cout << "Enter a character : ";
    cin >> ch;

    switch(ch)
    {
        case 'A'...'Z': cout << ch << " is an uppercase character ";
        break;
        case 'a'...'z': cout << ch << " is a lowercase character ";
        break;
        case '0'...'9': cout << ch << " is a number ";
        break;
        default:
            cout << ch << " is a special character ";
            break;
    }

    return 0;
}
