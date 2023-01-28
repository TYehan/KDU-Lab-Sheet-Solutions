#include <iostream>
using namespace std;

int i,j;

int main()
{
    int matrix1[3][3],matrix2[3][3];
    int matrixSum[3][3];

//Taking the first matrix
    cout << "Enter the elements of the first matrix" << endl;
    for(i=0; i<3; i++)
    {
        for(j=0; j<3; j++)
        {
            cout << "Enter element " << i+1 <<" "<< j+1 <<" : ";
            cin >> matrix1[i][j];
        }
    }
    for(i=0; i<3; i++)
    {
        for(j=0; j<3; j++)
        {
            cout << matrix1[i][j] << " ";
        }
        cout << "\n";
    }
//Taking the second matrix
    cout << "\nEnter the elements of the second matrix" << endl;
    for(i=0; i<3; i++)
    {
        for(j=0; j<3; j++)
        {
            cout << "Enter element " << i+1 <<" "<< j+1 <<" : ";
            cin >> matrix2[i][j];
        }
    }
    for(i=0; i<3; i++)
    {
        for(j=0; j<3; j++)
        {
            cout << matrix2[i][j] << " ";
        }
        cout << "\n";
    }
//Adding them together and storing in another
    for(i=0; i<3; i++)
    {
        for(j=0; j<3; j++)
        {
            matrixSum[i][j]=matrix1[i][j]+matrix2[i][j];
        }
    }

    cout << "\nAddition of the above matrices" << endl;
    for(i=0; i<3; i++)
    {
        for(j=0; j<3; j++)
        {
            cout << matrixSum[i][j] << " ";
        }
        cout << "\n";
    }

    return 0;
}
