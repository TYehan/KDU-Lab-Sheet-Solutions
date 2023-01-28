#include <iostream>
using namespace std;

int main()
{
    int quantity;
    float unit_price, total, discount=0, pay;

    cout << " Enter the unit price : ";
    cin >> unit_price;
    cout << " Enter the quantity : ";
    cin >> quantity;


    total = quantity*unit_price;

    cout << " Enter the paying amount : ";
    cin >> pay;

    if(pay<total)
        cout << " Insufficient Money " ;
    else
    {

    if(quantity>10) //one item free if quantity is greater than 10
        quantity = quantity + 1;
    if(total>2500) //3.5% discount is given if total is greater than 2500
        discount = (total*3.5)/100;

    cout.setf(ios::fixed);
    cout.precision(2);

    cout << "----------------------------------------------" << endl
         << "--------------------BILL----------------------" << endl
         << "----------------------------------------------" << endl
         << "\n\t Unit Price : \t" << unit_price << endl
         << "\n\t Item Quantity \t: " << quantity << endl;
         if(discount)
            cout << "\n\t Discount : \t" << discount << endl
         << "\n\t Total : \t" << (total-discount) << endl
         << "\n\t Change : \t" << (pay-total+discount) << endl
         << "----------------------------------------------" << endl;

         return 0;
    }
}
