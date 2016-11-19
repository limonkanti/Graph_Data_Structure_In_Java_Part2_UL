package graph_datastructure;

public class GraphAdjacencyMatrixRepresen {
    
    
     int vertices;
    private int[][] adjacency_matrix;

    public static void main(String[] args) 
    {
        int ar[][] = {
            {0, 1, 0, 0, 1},
            {1, 0, 1, 1, 1},
            {0, 1, 0, 1, 0},
            {0, 1, 1, 0, 1},
            {1, 1, 0, 1, 0}
        };
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar.length;j++)
            {
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }

    }

}
