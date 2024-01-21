# [Search Insert Position](https://leetcode.com/problems/search-insert-position)

#### \#Array \#BinarySearch

## Solução Força Bruta

Verificamos o primeiro elemento do array e comparamos com o valor alvo. Se for igual, retornamos o índice desse elemento.
Se for maior, também retornamos o índice desse elemento, pois o valor alvo seria inserido antes dele para manter o array
ordenado. E se for menor, passamos para o próximo elemento e repetimos o processo. Se percorrermos todo o array sem
encontrar o valor alvo ou um elemento maior, retornamos o tamanho do array, pois o valor alvo seria o último elemento
para manter o array ordenado.

### Complexidade de Tempo
>**O (n)** - Onde **n** é o número de elemento no array. Estamos percorrendo o array elemento por elemento, portanto, se
> o array tiver **n** elementos, no pior caso (quando o valor alvo é maior do que todos os elementos do array), teremos
> que percorrer todos os **n** elementos.

### Complexidade de Espaço
>**O (1)** - Não estamos usando nenhum espaço adicional que aumente com o tamanho da entrada. Estamos apenas utilizando
> variáveis que ocupam um espaço constante. Portanto, a complexidade do espaço é **O (1)**, que significa que o espaço
> de memória usado não aumenta com o tamanho da entrada.

## Solução Ideal

Inicializamos dois ponteiros, `low` e `high`, para representar os limtes do array. Entramos em um loop enquanto `low` for
menor ou igual a `high`. Dentro do loop, calculamos o índice médio do array e verificamos se o valor no índice médio é
igual ao valor alvo. Se for, retornamos o índice médio. Se o valor no índice médio for menor que valor alvo, movemos o
ponteiro `low` para a direta do meio. Se o valor no índice médio for maior que o valor alvo, movemos o ponteiro `high`
para a esquerda do meio. Se o loop terminar sem encontrar o valor alvo, retornamos `low`, que representa o índice onde o
valor alvo poderia ser inserido para manter o array ordenado.

### Complexidade de Tempo
>**O (log n)** - A **Busca Binária** funciona dividindo repetidamente o array de pesquisa pela metade. Se o valor alvo for
> igual ao elemento no meio do array, então encontramos o valor alvo e o algoritmo termina. Se o valor alvo for maior que
> o elemento do meio, então descartamos a metade inferior do array e continuamos a busca na metade superior. Se o valor
> alvo for menor que o elemento do meio, então descaratamos a metade superior do array e continuamos a busca na metade
> inferior. Portanto, a cada passo, estamos efetivamente reduzindo o tamanho do array de pesquisa pela metade. Isso
> significa que o número de passos que o algoritmo leva para terminar é proporcional ao logaritmo do tamanho do array de
> entrada, base 2. É por isso que a complexidade de tempo da **Busca Binária** é **O (log n)**.

### Complexidade de Espaço
>**O (1)** - Significa que, independentemente do tamanho do array de entrada, a quantidade de memória usada pelo algoritmo
> não muda. Isso ocorre porque, na **Busca Binária**, estamos usando algumas variáveis adicionais (`low`, `high` e `mid`)
> e não estamos criando nenhuma estrutura de dados adicional que cresça com o tamanho da entrada. Portanto, a complexidade
> de espaço é constante, ou **O (1)**.