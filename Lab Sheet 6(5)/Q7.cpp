#include <iostream>
using namespace std;

bool condi;
bool isVowel(char ch);

    //char ch;

int main()
{
    char ch;
    cout << "Enter a character: ";
    cin >> ch;
    isVowel(ch);
    cout << condi;

    //return 0;
}

bool isVowel(char ch)
{
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        condi = true;
    else
        condi = false;
    return condi;
}
