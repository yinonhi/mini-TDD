import java.util.Random;

public class Factory {
	Worker[] workers;
	public Factory(int size) {
		int i;
		workers=new Worker[size];
		for(i=0;i<size;i++)
		{
			workers[i]=new Worker();
		}
	}
	public void failSort(){	}
	public void BubbleSort()
	{
		long millis = System.currentTimeMillis();
		int n = workers.length;  
        Worker temp;  
         for(int i=0; i < n; i++)
         {  
                 for(int j=1; j < (n-i); j++)
                 {  
                          if(workers[j-1].salary > workers[j].salary){   
                                 temp =workers[j-1];  
                                 workers[j-1] = workers[j];  
                                 workers[j] = temp;  
                          }
                 }
         }
         long millis1 = System.currentTimeMillis();
         System.out.println("Bubble sort took : "+(millis1-millis));
	}
	//here start the merge sort
	void merge(int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
 
        Worker L[] = new Worker [n1];
        Worker R[] = new Worker [n2];

        for (int i=0; i<n1; ++i)
            L[i] = workers[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = workers[m + 1+ j];
 
        int i = 0, j = 0;
 
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i].salary <= R[j].salary)
            {
                workers[k] = L[i];
                i++;
            }
            else if(L[i].salary > R[j].salary)
            {
                workers[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            workers[k] = L[i];
            i++;
            k++;
        }
 
        while (j < n2)
        {
            workers[k] = R[j];
            j++;
            k++;
        }
    }
	void manageMergeSort(int start,int size)
	{
		long millis = System.currentTimeMillis();
		mergeSort(start,size);
		long millis1 = System.currentTimeMillis();
		System.out.println("Merge Sort took : "+(millis1-millis));
	}
    void mergeSort( int l, int r)
    {
        if (l < r)
        {
            int m = l+(r-l)/2;
            mergeSort( l, m);
            mergeSort(m+1, r);
            merge(l, m, r);
        }
    }
    void printArray()
    {
        int n = workers.length;
        for (int i=0; i<n; ++i)
            System.out.println(workers[i].toString());
        System.out.println();
    }
    void shuffleWorkerArray()
    {
    	Random rand=new Random();
    	for(int i=workers.length-1;i>0;i--)
    	{
    		int index=rand.nextInt(i+1);
    		Worker temp=workers[index];
    		workers[index]=workers[i];
    		workers[i]=temp;
    	}
    }
}
