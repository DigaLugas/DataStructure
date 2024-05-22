# Reverse Bits
Este é um programa simples em Java que implementa a reversão dos bits de um número inteiro de 32 bits. A função reverseBits realiza essa operação de forma eficiente usando operações bitwise.

## Funcionamento

O programa implementa a função reverseBits na classe ReverseBits. Esta função recebe um número inteiro como argumento e retorna o mesmo número após ter seus bits invertidos.

Para realizar a inversão dos bits, o programa utiliza uma série de operações bitwise que dividem o número em grupos menores de bits e os invertem sucessivamente. O algoritmo funciona da seguinte forma:

1. Inverte os 16 bits mais significativos com os 16 bits menos significativos.
2. Inverte os 8 bits mais significativos de cada byte com os 8 bits menos significativos de cada byte.
3. Inverte os 4 bits mais significativos de cada nibble (grupo de 4 bits) com os 4 bits menos significativos.
4. Inverte os 2 bits mais significativos de cada grupo de 2 bits com os 2 bits menos significativos.
5. Inverte os bits individuais, alternando bits pares com bits ímpares.

O resultado final é o número com seus bits invertidos, que é retornado pela função `reverseBits`.

## Complexidade

A complexidade de tempo e espaço do algoritmo de inversão de bits é constante O(1). Isso ocorre porque o algoritmo realiza um número fixo de operações bitwise, independentemente do tamanho do número de entrada. Portanto, a complexidade não depende do tamanho do número inteiro de 32 bits.

## Uso
Para usar a função reverseBits, basta criar uma instância da classe ReverseBits e chamar o método reverseBits com um número inteiro como argumento. Por exemplo:

```bash
ReverseBits solution = new ReverseBits();
int num = 10; // Número a ser invertido
int reversed = solution.reverseBits(num);
System.out.println("Número original: " + num);
System.out.println("Número invertido: " + reversed);
```


