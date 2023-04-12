//T_Yehan
#include <iostream>
#include <iomanip>
using namespace std;


    int d, m, y, o;
    string month;

    void output(); //declaring a function

int main ()
{


    cout << " Enter the day : ";
    cin >> d;
    cout << " Enter the month : ";
    cin >> m;
    cout << " Enter the year : ";
    cin >> y;

    cout << "---------------------------" << endl
         << "------ Output Format ------" << endl
         << "---------------------------" << endl
         << " Option 1: 21.05.2001 " << endl
         << " Option 2: 21.05.01 " << endl
         << " Option 3: 21st May 2001 " << endl
         << " \n Enter the option no: ";

    cin >> o;

    switch (m)  //switch to take the month by its no.
    {
        case 1:
            month = "January";
            break;
        case 2:
            month = "February";
            break;
        case 3:
            month = "March";
            break;
        case 4:
            month = "April";
            break;
        case 5:
            month = "May";
            break;
        case 6:
            month = "June";
            break;
        case 7:
            month = "July";
            break;
        case 8:
            month = "August";
            break;
        case 9:
            month = "September";
            break;
        case 10:
            month = "October";
            break;
        case 11:
            month = "November";
            break;
        case 12:
            month = "December";
            break;
        default:
            cout << " Invalid Month No.";
            break;
    }


    if(m!=2)  // Checking whether the month has 30 days or 31 days
    {
        if(m%2==1 || m==8)
        {
            if(d<=31)
                output();
            else
                cout << " Invalid Day No. ";
        }
        else
        {
            if(d<=30)
                output();
            else
                cout << " Invalid Day No. ";
        }
    }



    if(m==2)   // For the month February checking whether it is a leap year or not
    {
       if(y%100==0)
    {
        if(y%400==0)
        {
            if(d<=29)
            output();
            else
                cout << " Invalid Day No. ";
        }
            else if(d<=28)
        {
            output();
        }
        else
            cout << " Invalid Day No. ";
    }
    else
      if(y%4==0)
      {
            if(d<=29)
            output();
            else
                cout << " Invalid Day No. ";
      }
            else if(d<=28)
      {
            output();
      }
      else
            cout << " Invalid Day No. ";

    }

    return 0;
}


void output()  //Function with was declared to take the output
{
    if(d>=1) // Limiting the day no. to start from 1
    {

    switch (o)
    {
    case 1:
        cout << "\n\t" << setw(2) << setfill('0') << d  << "." << setw(2) << setfill('0') << m << "." << y ;
        break;
    case 2:
        cout << "\n\t" << setw(2) << setfill('0') << d  << "." << setw(2) << setfill('0') << m << "." << y%100 ;
        break;
    case 3:
        switch (d)
        {
        case 1:
        case 21:
        case 31:
            cout << "\n\t" << setw(2) << setfill('0') << d << "st " << month << " " << y ;
            break;
        case 2:
        case 22:
            cout << "\n\t" << setw(2) << setfill('0') << d << "nd " << month << " " << y ;
            break;
        case 3:
            cout << "\n\t" << setw(2) << setfill('0') << d << "rd " << month << " " << y ;
            break;
        default:
            cout << "\n\t" << setw(2) << setfill('0') << d << "th " << month << " " << y ;
            break;
        }
    }
    }
    else
        cout << " Invalid Day No. ";


}

