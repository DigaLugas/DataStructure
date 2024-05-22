# BinaryConvertor

O `BinaryConvertor` é uma classe que oferece métodos para converter números binários em decimais (`BinaryToDecimal`) e vice-versa (`DecimalToBinary`).

## Funcionamento dos Métodos

### `BinaryToDecimal`

Este método recebe uma string representando um número binário e retorna o valor decimal correspondente. Ele realiza a conversão iterativamente, utilizando uma pilha (`Stack`) para armazenar os bits do número binário e calcular o valor decimal.

### `DecimalToBinary`

Este método recebe uma string representando um número decimal e retorna a sua representação em binário como uma string. Ele primeiro converte a entrada para um inteiro, verifica se é válida, e então realiza a conversão para binário, também utilizando uma pilha (`Stack`) para armazenar os bits.

## Uso dos Métodos

1. Instancie a classe `BinaryConvertor`.
2. Chame o método `BinaryToDecimal(binary)` passando a representação binária como argumento para converter para decimal.
3. Chame o método `DecimalToBinary(decimal)` passando a representação decimal como argumento para converter para binário.

Exemplo de uso:

```java
BinaryConvertor convertor = new BinaryConvertor();
String binaryNumber = "1010";
int decimalResult = convertor.BinaryToDecimal(binaryNumber);
System.out.println("Decimal de " + binaryNumber + ": " + decimalResult);

String decimalNumber = "42";
String binaryResult = convertor.DecimalToBinary(decimalNumber);
System.out.println("Binário de " + decimalNumber + ": " + binaryResult);
```
## Exceções
Para o método DecimalToBinary, se a entrada não puder ser convertida para um número inteiro, uma exceção NumberFormatException será lançada e o método retornará uma string vazia.