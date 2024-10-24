import java.util.*;
public class spiralmatrix{
    public static void spiral(int matrix[][])
    {   int sr=0,sc=0,ec=matrix[0].length-1,er=matrix.length-1;
        
        while(sr<=er&&sc<=ec)
        {
            //top
            for(int i=sc;i<=ec;i++)
            {
                System.out.print(matrix[sc][i]);
            }
            // System.out.println();
            //right
            for(int i=sr+1;i<=er;i++)
            {
                System.out.print(matrix[i][ec]);
            }
            //bottom
            for(int i=ec-1;i>=sc;i--)
            {
                if(sr==er) 
                {
                    break;
                }
                System.out.print(matrix[er][i]);
            }
            // System.out.println();
            //left
            for(int i=er-1;i>=sr+1;i--)
            {
                if(sc==ec)
                {
                    break;
                }
               System.out.print(matrix[i][sc]);
            }
            // System.out.println();
            sr++;
            er--;
            sc++;
            ec--;
        }
    }
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int m=sc.nextInt();
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}}; 
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<m;j++)
        //     {
        //         matrix[i][j]=sc.nextInt();
        //     }
        // }
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<m;j++)
        //     {
        //         System.out.print(matrix[i][j]+"  ");
        //     }
        //     System.out.println();
        // }
        spiral(matrix);
        System.out.print("Bobyeeeeeeeeeeeeeeeeeeeeeeee");
        

    }
}
