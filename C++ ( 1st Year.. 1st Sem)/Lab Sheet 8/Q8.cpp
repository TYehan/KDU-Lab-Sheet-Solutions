#include <iostream>
using namespace std;

int i,j;
bool isBool;

int main()
{
    int matrix[3][3];
    int matrixFirst[3][3];

    cout << "Enter the elements of the matrix" << endl;
    for(i=0; i<3; i++)
    {
        for(j=0; j<3; j++)
        {
            cout << "Enter element " << i+1 <<" "<< j+1 <<" : ";
            cin >> matrix[i][j];
        }
    }

   for(i=0; i<3; i++)
    {
        for(j=0; j<3; j++)
        {
            matrixFirst[j][i]=matrix[i][j];
        }
    }

    for(i=0; i<3; i++)
    {
        for(j=0; j<3; j++)
        {
            if(matrixFirst[i][j]==matrix[i][j])
                isBool=true;
            else
                isBool=false;
                break;     //breaking if there is any wrong pair
        }
    }

        if(isBool)
            cout << "\nThis matrix is a symmetric";
        else
            cout << "\nThis matrix is not a symmetric matrix";

    return 0;
}
