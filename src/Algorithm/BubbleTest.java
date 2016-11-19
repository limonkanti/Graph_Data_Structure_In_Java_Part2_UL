
package Algorithm;

public class BubbleTest 
{
     void bubbleSort(int ar[]) 
     {
         int n=ar.length;
         int temp;
         for(int i=0;i<n;i++)
         {
             for(int j=1;j<n-i;j++)
             {
                 if(ar[j-1]>ar[j])
                 {
                     temp=ar[j-1];
                     ar[j-1]=ar[j];
                     ar[j]=temp;
                 }
             }
         }
         
     }
    
    
     public static void main(String args[]) {
        int ar[] = {4, -3, 5, 2, 1};
        BubbleTest ob = new BubbleTest();
        ob.bubbleSort(ar);
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }

    }
    
}
