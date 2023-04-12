//T_Yehan
#include <iostream>
using namespace std;

int r=0,c=0,i,j;

int main()
{
    do{
    cout << "Enter the number of rows : ";
        cin >> r;
    }while(r>10 || r<0);
    do{
    cout << "Enter the number of columns : ";
        cin >> c;
    }while(c>10 || c<0);

    int matrix[r][c];

    cout << "\nEnter the elements of the matrix" << endl;
    for(i=0; i<r; i++)
    {
        for(j=0; j<c; j++)
        {
            cout << "Enter element " << i+1 <<" "<< j+1 <<" : ";
            cin >> matrix[i][j];
        }
    }

    cout << "Initial Matrix"<< endl;
    for(i=0; i<r; i++)
    {
        for(j=0; j<c; j++)
        {
            cout << matrix[i][j] << " ";
        }
        cout << endl;
    }

    cout << "Transposed Matrix" << endl;
    for(j=0; j<c; j++)
    {
        for(i=0; i<r; i++)
        {
            cout << matrix[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}
