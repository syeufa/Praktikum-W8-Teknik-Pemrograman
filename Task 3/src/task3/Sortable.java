/*
 * TASK 3 PRAKTIKUM W8 TEKNIK PEMROGRAMAN
 * Syifa Khairina - 211524063
 */
package task3;

public interface Sortable {
 public abstract int compare(Sortable b);
 public static void shell_sort(Sortable[] a){
 //Shell sort body, source: https://www.javatpoint.com/shell-sort
 int n = a.length;
     /* Rearrange the array elements at n/2, n/4, ..., 1 intervals */  
    for (int interval = n/2; interval > 0; interval /= 2)  
    {  
        for (int i = interval; i < n; i += 1)  
        {  
            /* store a[i] to the variable temp and make  
 
the ith position empty */  
            Sortable temp = a[i];  
            int j;        
            for (j = i; j >= interval && a[j - interval].compare(temp) < 0; j -= interval)  
                a[j] = a[j - interval];  
              
            /* put temp (the original a[i]) in its correct  
position */  
            a[j] = temp;  
        }  
    }  
}  
static void printArr(int a[], int n) /* function to print the array elements */  
{  
    int i;  
    for (i = 0; i < n; i++)  
        System.out.print(a[i] + " ");  
}  
 }
  

