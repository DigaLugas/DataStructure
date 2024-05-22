#include <stdio.h>
#include <stdlib.h>
#include <time.h>

//Função para trocar dois valores inteiros
void trocar(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

//Função para realizar o Bubble Sort
void bubble_sort(int *array, int tamanho) {
    int i, j, trocado;
    for (i = 0; i < tamanho - 1; i++) {
        trocado = 0;
        for (j = 0; j < tamanho - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                trocar(&array[j], &array[j + 1]);
                trocado = 1;
            }
        }
        //Se nenhuma troca ocorreu em uma iteração do loop interno, o array já está ordenado
        if (!trocado) {
            break;
        }
    }
}

int main(void) {
    srand(time(NULL));

    int tamanho;

   
    printf("Digite o tamanho desejado para o array: ");
    if (scanf("%d", &tamanho) != 1 || tamanho <= 0) {
        fprintf(stderr, "Entrada inválida. Digite um número inteiro positivo.\n");
        return 1;
    }

    //Alocar memória para o array 
    int *array = (int *)malloc(tamanho * sizeof(int));
    if (array == NULL) {
        fprintf(stderr, "Falha na alocação de memória.\n");
        return 1;
    }

    //Preencher o array
    printf("Array original: ");
    for (int i = 0; i < tamanho; i++) {
        array[i] = rand() % 100 + 1;
        printf("%d ", array[i]);
    }
    printf("\n");

    //Realizar o Bubble Sort
    bubble_sort(array, tamanho);

    //Imprimir o array ordenado
    printf("Array ordenado: ");
    for (int i = 0; i < tamanho; i++) {
        printf("%d ", array[i]);
    }
    printf("\n");

    //Liberar a memória 
    free(array);

    return 0;
}
