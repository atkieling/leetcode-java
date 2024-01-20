# [Remove Element](https://leetcode.com/problems/remove-element/)

#### \#Array \#TwoPointers

## Solução Força Bruta

Inicializamos um novo array `newArray` e um contador `j`. Iteramos sobre o array `nums` e, para cada elemento que não é
igual ao valor `val`, adicionamos esse elemento ao `newArray` e incrementamos `j`. Após a iteração, copiamos os elementos
de `newArray` de volta para `nums` e retornamos `j`, que é o novo comprimento do array após a remoção de todos os
elementos igual a `val`.

### Complexidade de Tempo
>**O (n)** - Onde **n** é o número de elementos no array. Isso significa que o tempo necessário para executar o algoritmo
> é diretamente proporcional ao número de elementos no array. Nesse caso, cada elemento do array precisa ser verificado
> uma vez, portanto, se houver **n** elementos, o algoritmo precisará de **n** operações para concluir a tarefa.

### Complexidade de Espaço
>**O (n)** - Onde **n** é o número de elementos no array. Indica que a quantidade de memória necessária para executar o
> algoritmo é diretamente proporcional ao número de elementos no array. Nesse caso, um novo array é criado com
> potencialmente o mesmo número de elementos que o array original, portanto, se houver **n** elementos, o algoritmo
> precisará de **n** unidades de espaço para armazenar o novo array.

## Solução Ideal

Inicializamos um contador `i` para 0 e iteramos sobre o array com outro contador `j`. Se o elemento atual não é o valor
que queremos remover, movemos esse elemento para a posição `i` e incrementamos `i`. Ao final da iteração, retornamos `i`,
que será o novo comprimento do array. Isso efetivamente remove todas as ocorrências do valor no array.

### Complexidade de Tempo
>**O (n)** - Onde **n** é o número de elementos no array. Essa solução envolve a iteração através do array uma vez. Durante
> essa iteração, para cada elemento, realizamos uma operação: verificamos se o elemento é igual ao valor que queremos 
> remover e, se não for, movemos esse elemento para uma nova posição no array. Como estamos percorrendo cada elemento do
> array exatamente uma vez, o tempo total que nossa solução leva é diretamente proporcional ao número de elementos no
> array.

### Complexidade de Espaço
>**O (1)** - Utilizamos um contador `i` e outro contador `j` para iterar o array. Não importa o tamanho do array, sempre
> usamos apenas essas duas variáveis. Não estamos criando nenhum novo array ou estrutura de dados que aumente com o
> tamanho do array de entrada. Portanto, a quantidade de memória que usamos não aumenta com o tamanho do array.