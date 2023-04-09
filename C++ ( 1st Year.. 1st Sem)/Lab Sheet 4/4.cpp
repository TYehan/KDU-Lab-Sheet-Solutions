#include <iostream>

using namespace std;

int main()
{
    char ch;
    cout << "Enter a character : ";
    cin >> ch;

    switch (ch)
    {
        case 'A':
        case 'a':
        case 'E':
        case 'e':
        case 'I':
        case 'i':
        case 'O':
        case 'o':
        case 'U':
        case 'u':
            cout << "The letter " << ch << " is a vowel";
            break;
        default:
            cout << "The letter " << ch << " is a consonant";
    }

    return 0;
}
