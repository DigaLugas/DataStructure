# BinaryTree

A classe `BinaryTree` implementa uma estrutura de árvore binária simples com operações de inserção (`insert`) e travessia em ordem (`inOrder`) e pré-ordem (`preOrder`).

## Estrutura da Árvore Binária

A árvore binária é composta por nós (`Node`), onde cada nó contém um valor inteiro (`data`), uma referência para o nó filho esquerdo (`left`) e uma referência para o nó filho direito (`right`).

## Funcionamento dos Métodos

### `insert(int data)`

Este método insere um novo valor na árvore binária mantendo a propriedade de ordenação. Ele utiliza um método recursivo privado `recInsert` para realizar a inserção de forma ordenada.

### `inOrder()`

Este método realiza uma travessia em ordem na árvore binária, ou seja, visita os nós em ordem crescente. Utiliza o método privado `recInOrder` para realizar a travessia de forma recursiva.

### `preOrder()`

Este método realiza uma travessia pré-ordem na árvore binária, ou seja, visita o nó raiz antes de visitar os filhos. Utiliza o método privado `recPreOrder` para realizar a travessia de forma recursiva.

## Uso da Árvore Binária

1. Instancie a classe `BinaryTree`.
2. Insira elementos na árvore utilizando o método `insert`.
3. Execute as operações de travessia `inOrder` ou `preOrder` para visualizar os elementos da árvore na ordem desejada.

Exemplo de uso:

```java
BinaryTree tree = new BinaryTree();
tree.insert(50);
tree.insert(30);
tree.insert(20);
tree.insert(40);
tree.insert(70);
tree.insert(60);
tree.insert(80);

System.out.println("Travessia em Ordem:");
tree.inOrder(); // Deve imprimir: 20 30 40 50 60 70 80
System.out.println("\nTravessia Pré-Ordem:");
tree.preOrder(); // Deve imprimir: 50 30 20 40 70 60 80
```
