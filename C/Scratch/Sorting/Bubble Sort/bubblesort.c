#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int swap(int* a, int* b){
int temp = *a;
*a = *b;
*b = temp;
}
int main(void){
    srand(time(NULL));
    // Declara o Array
    int array[5];

    //Popula e Imprime os itens do array
    printf("Array original: ");
    for (int i = 0; i < 5; i++)
    {
        array[i] = rand()%100 + 1;
        printf("%d ", array[i]);
    }
    printf("\n");

    //Bubblesort para ordenar o array
    for (int i = 0; i < 5; i++)
    {
        if (array[i]>array[i+1])
        {
            swap(&array[i], &array[i+1]);
        }
        
    }
    //Imprime o array ordenado
    printf("Array ordenado: ");
    for (int i = 0; i < 5; i++)
    {
        printf("%d ", array[i]);
    }
    
    return 0;
}
