# TwoSums

O algoritmo `TwoSums` implementa uma solução eficiente para encontrar dois números em um array cuja soma seja igual a um determinado valor alvo (`target`). Esse problema é comumente conhecido como "Two Sum Problem".

## Descrição do Problema

Dado um array de números inteiros `nums` e um valor alvo `target`, encontre os índices de dois números no array cuja soma seja igual a `target`. Assumimos que cada entrada terá exatamente uma solução, e você não pode usar o mesmo elemento duas vezes.

Por exemplo:
- Para `nums = [2, 7, 11, 15]` e `target = 9`, a resposta seria `[0, 1]` porque `nums[0] + nums[1] = 2 + 7 = 9`.

## Funcionamento do Algoritmo

O algoritmo utiliza a estratégia de armazenar os complementos dos números em um mapa (`HashMap`). Enquanto itera pelo array, verifica se o complemento de um número já está presente no mapa. Se sim, isso significa que encontramos os dois números que somam o `target`.

## Uso do Algoritmo

1. Instancie a classe `TwoSums`.
2. Chame o método `twoSum(nums, target)`, passando o array de números e o valor alvo.
3. O método retornará um array com os índices dos números que somam o `target`.

Exemplo de uso:

```java
TwoSums twoSums = new TwoSums();
int[] nums = { 2, 7, 11, 15 };
int target = 9;
int[] indices = twoSums.twoSum(nums, target);
System.out.println("Índices dos números que somam " + target + ": " + indices[0] + ", " + indices[1]);
```
## Complexidade de Tempo
A complexidade de tempo do algoritmo é O(n), onde 'n' é o número de elementos no array nums, devido à iteração do array e operações de mapa de tempo constante.
