
package Algorithm;

public class SelectionTest 
{
     void selectionSort(int ar[]) 
     {
        int n = ar.length;
        
        for (int j = 0; j < n-1; j++) 
        {
           int index=j;
           for(int i=j+1;i<n;i++)
           {
               if(ar[i]<ar[index])
               {
                   index=i;
                   
               }
           }
           int smallest=ar[index];
           ar[index]=ar[j];
           ar[j]=smallest;
           
        }

    }

    public static void main(String args[]) {
        int ar[] = {4, -3, 5, 2, 1};
        SelectionTest ob = new SelectionTest();
        ob.selectionSort(ar);
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }

    }

    
}
