# [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)

#### \#LinkedList \#Recursion

## Solução Força Bruta

Verificamos se alguma das listas é nula e, se for, retornamos a outra. Se ambas não forem nulas, adicionamos todos os
elementos em um `ArrayList`, ordenamos esse `ArrayList` e criamos uma nova lista vinculada a partir dos elementos
ordenados. E por fim, retornamos essa lista.

### Complexidade de Tempo
>**O (n log n)** - Percorrendo as duas listas vinculadas (`l1` e `l2`) para adicionar todos os elementos a um `ArrayList`
> leva tempo linear, ou seja, **O (n)**, onde **n** é o número total de elementos em `l1` e `l2`.
> Ordenar o `ArrayList` leva tempo **O (n log n)**, onde **n** é o número de elementos no `ArrayList`.
> Criar a lista vinculada mesclada a partir dos elementos ordenados, também leva tempo linear, ou seja, **O (n)**.
> Portanto, a complexidade total de tempo é denominada pelo passo de ordenação, tornando-a **O (n log n)**.

### Complexidade de Espaço
>**O (n)** - O espaço extra é usado para o `ArrayList` que armazena todos os elementos de `l1` e `l2`. Portanto, a
> complexidade de espaço é **O (n)**, onde **n** é o número total de elementos em `l1` e `l2`. Além disso, a nova lista
> vinculada também usa espaço **O (n)**. Portanto, a complexidade total de espaço é **O (n)**.

## Solução Ideal

Verificamos se alguma das listas é nula e, se for, retornamos a outra. Em seguida, comparamos os valores dos primeiros
nós de `l1` e `l2`. O nó com o menor valor se torna o novo nó na lista mesclada. Então, definimos o próximo nó, e para
isso é feita uma `chamada recursiva`, avançando um nó de cada vez em `l1` e `l2` (dependendo de qual valor é menor), até
que as listas sejam completamente percorridas. O resultado é uma única lista encadeada que contém todos o nós de `l1` e
`l2` em ordem crescente.

### Complexidade de Tempo
>**O (n)** - Onde **n** é o número total de nós nas duas listas. Isso ocorre porque cada nó é visitado uma vez durante a
> mesclagem.

### Complexidade de Espaço
>**O (n)** - Onde **n** é o comprimento da lista mais longa. Isso ocorre por causa da `pilha` de `chamada recursiva`. Cada
> `chamada recursiva` adiciona uma nova chamada à `pilha` de chamadas, e essa `pilha` precisa de espaço na memória.