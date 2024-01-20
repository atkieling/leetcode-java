# [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

#### \#Array \#TwoPointers

## Solução Força Bruta

Verificamos se o array de entrada está vazio e, se estiver, retornamos 0. Em seguida, criamos um novo array para armazenar
os elementos únicos e adicionamos o primeiro elemento do array de entrada a ele. Inicializamos um contador para rastrear
o número de elementos únicos. Percorrendo o array de entrada, começando do segundo elemento, e para cada elemento,
comparamos com o último elemento adicionado ao novo array. Se forem diferentes, adicionamos ao novo array e incrementamos
o contador. Depois de percorrer todo o array de entrada, copiamos os elementos únicos de volta para o array de entrada.
Finalmente, retornamos o contador, que representa o número de elementos únicos do array.

### Complexidade de Tempo
>**O (n)** - Onde **n** é o número de elementos no array. Isso ocorre porque percorremos o array duas vezes: uma vez para
> copiar os elementos únicos para o novo array e outra vez para copiá-lo de volta para o array original.

### Complexidade de Espaço
>**O (n)** - Onde **n** é o número de elementos no array. Isso ocorre porque criamos um novo array para armazenar os
> elementos únicos. O tamanho desse novo array é o mesmo que o do array de entrada, portanto, o espaço que usamos é
> diratamente proporcional ao tamanho do array de entrada. Portanto, a complexidade do espaço da solução é **O (n)**,
> indicando que o espaço necessário aumenta linearmente com o tamanho da entrada.

## Solução Ideal

Começamos inicializando duas variáveis, `k` e `i`. `K` rastreia a posição no array onde o próximo elemento único deve ser
colocado, enquanto `i` é usado para iterar sobre o array. Para cada elemento, encontramos o próximo elemento que é
diferente do elemento atual, avançando o índice `j` enquanto o elemento no índice `j` é igual ao elemento no índice `i`.
Uma vez que encontramos um elemento que é diferente, substituímos o elemento na posição `k` pelo elemento na posição `i`,
garantindo que todos os elementos até o índice `k` são únicos. Atualizamos o índice `i` para `j - 1`, garantindo que na
próxima iteração, começamos a partir do próximo elemento que é diferente do elemento atual. Após iterar sobre todo o
array, retornamos `k`, que é a quantidade de elementos únicos no array.

### Complexidade de Tempo
>**O (n)** - Onde **n** é o número de elementos no array. Estamos percorrendo o array uma vez, então para cada elemento
> no array, estamos fazendo uma operação.

### Complexidade de Espaço
>**O (1)** - Estamos modificando o array original e não estamos usando nenhum espaço extra que cresça com o tamanho da
> entrada. Isso significa que não importa o quão grande seja o array, a quantidade de memória que usamos não aumenta.