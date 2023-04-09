#include <iostream>
using namespace std;

int i,j,r1,r2,c1,c2;

int main()
{
    do{
    r1=0;r2=0;c1=0;c2=0;
    cout << "\nEnter rows and column for first matrix: ";
    cin >> r1 >> c1;
    cout << "\nEnter rows and column for second matrix: ";
    cin >> r2 >> c2;

    if(c1!=r2)
        cout << "\nError! column of first matrix not equal to row of second. " << endl;

    }while(c1!=r2);


//initializing matrices
    int matrix1[r1][c1],matrix2[r2][c2],matrixMul[r1][c2];

//Taking the first matrix
    cout << "\nEnter elements of matrix 1:" << endl;
    for(i=0; i<r1; i++)
    {
        for(j=0; j<c1; j++)
        {
            cout << "Enter element a" << i+1 << j+1 <<" : ";
            cin >> matrix1[i][j];
        }
    }
    for(i=0; i<r1; i++)
    {
        for(j=0; j<c1; j++)
        {
            cout << matrix1[i][j] << " ";
        }
        cout << "\n";
    }
//Taking the second matrix
    cout << "\nEnter elements of matrix 2:" << endl;
    for(i=0; i<r2; i++)
    {
        for(j=0; j<c2; j++)
        {
            cout << "Enter element b" << i+1 << j+1 <<" : ";
            cin >> matrix2[i][j];
        }
    }
    for(i=0; i<r2; i++)
    {
        for(j=0; j<c2; j++)
        {
            cout << matrix2[i][j] << " ";
        }
        cout << "\n";
    }
//Apply 0 to all in array, to avoid garbage values
    for(i=0; i<r1; i++)
    {
        for(j=0; j<c2; j++)
        {
            for(int k=0; k<c2; k++)
            {
                matrixMul[i][k]=0;
            }
        }
    }
//Adding them together and storing in another
    for(i=0; i<r1; i++)
    {
        for(j=0; j<c1; j++)
        {
            for(int k=0; k<c2; k++)
            {
                matrixMul[i][k]+=(matrix1[i][j]*matrix2[j][k]);
            }
            /* 11= (11*11+12*21+13*31+14+41) */
        }
    }

    cout << "\nOutput Matrix:" << endl;
    for(int x=0; x<r1; x++)
    {
        for(int y=0; y<c2; y++)
        {
            cout << matrixMul[x][y] << " ";
        }
        cout << "\n";
    }

    return 0;
}
