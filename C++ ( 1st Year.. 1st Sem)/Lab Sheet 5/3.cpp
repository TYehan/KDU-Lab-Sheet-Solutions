#include <iostream>
using namespace std;

int main()
{
   int sum=0;
   int num[100];

   for(int i=0; i<100; i++)
   {
       cout << " Enter the number " << i+1 << " : ";
       cin >> num[i];

       sum = sum + num[i];
   }

   cout << " The sum is : " << sum;

   return 0;

}
