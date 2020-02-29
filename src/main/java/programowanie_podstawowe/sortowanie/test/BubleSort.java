package programowanie_podstawowe.sortowanie.test;

public class BubleSort {

    protected void bubleSort(int[] tab){

        for (int i=0;i< tab.length-1; i++){
            for (int j=0;j<tab.length-1-i;j++){
                if (tab[j]>tab[j+1]){
                    Swap.swap(tab,j,j);
                }
            }
        }
    }
}
//    procedure bubbleSort( A : lista elementów do posortowania )
//   n = liczba_elementów(A)
//           do
//           for (i = 0; i < n-1; i++) do:
//        if A[i] > A[i+1] then
//        swap(A[i], A[i+1])
//        end if
//        end for
//        n = n-1
//        while n > 1
//        end procedure