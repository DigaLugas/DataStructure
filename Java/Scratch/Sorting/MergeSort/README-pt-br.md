# Merge Sort Algorithm in Java

Este é um exemplo simples de implementação do algoritmo Merge Sort em Java usando listas encadeadas (`LinkedList`). O código é organizado da seguinte forma:

- **`MergeSort` Class**: Contém os métodos `sortList` e `merge` para ordenar a lista usando o algoritmo Merge Sort.

- **Método `sortList`**: Divide a lista em duas metades, recursivamente ordena cada metade e, em seguida, mescla as partes ordenadas.

- **Método `merge`**: Realiza a etapa de mesclagem das sublistas ordenadas, combinando-as em uma lista ordenada maior.

- **Método `main`**: Demonstração de uso da classe `MergeSort`, onde é criada uma lista com alguns números desordenados, que são então ordenados usando o método `sortList`.

## Como Executar

1. Certifique-se de ter o Java Development Kit (JDK) instalado em seu sistema.

2. Compile o arquivo Java `MergeSort.java` usando o comando:

```bash
javac MergeSort.java
```
3. Execute o programa compilado usando o comando:

```bash
    java MergeSort.java
```

## Exemplo de Saída

A saída do programa será a lista ordenada dos números inseridos. Por exemplo:
 
 ```bash
 Lista ordenada:
8 23 25 72 73
```


## Observações

- Este código demonstra a implementação básica do algoritmo Merge Sort em Java. Para uso em aplicações reais, considere otimizações e adaptações de acordo com o contexto e requisitos específicos.

- O algoritmo Merge Sort é eficiente para ordenar grandes conjuntos de dados, pois tem uma complexidade de tempo de O(n log n) no pior caso.
