# [Two Sum](https://leetcode.com/problems/two-sum/)

#### \#Array \#HashTable

## Força Bruta (Solução Fraca)

Utilizamos dois loops `for` para iterar sobre cada par possível de números no array. Se a soma de um par de números é
igual ao valor alvo, retornamos os índices desses números.

### Complexidade de Tempo
>**O (n^2)** - Como estamos utilizando dois loops `for` aninhados, a complexidade de tempo é `O (n^2)`, onde **n** é o número
> de elementos no array. Isso ocorre porque, no pior caso, teremos que comparar cada número com todos os outros números
> no array.

### Complexidade de Espaço
>**O (1)** - A complexidade de espaço é `O (1)`, o que significa que o espaço necessário não aumenta com o tamanho do array de
> entrada. Isso ocorre porque não estamos usando nenhuma estrutura de dados adicional cujo tamanho dependa do tamanho
> do array de entrada.


## HashMap (Solução Ideal)

Iteramos sobre o array de números uma vez. Para cada número, calculamos o complemento `(target - nums[i])`. Se o 
complemento estiver contido no `HashMap`, significa que encontramos os números em que a soma é igual ao valor alvo, 
então  retornamos seus índices. Se o complemento não estiver contido no `HashMap`, adicionamos o `nums[i]` e seu
`índice` no `HashMap`.

### Complexidade de tempo
>**O (n)** - Como estamos utilizando um único loop **for**, a complexidade de tempo é `O (n)`, onde **n** é o número
> de elementos no array. Isso ocorre porque, no pior caso, teremos que iterar sobre cada número no array uma vez.

### Complexidade de Espaço
>**O (n)** - A complexidade de espaço é `O (n)`, o que significa que o espaço necessário aumenta linearmente com o
> tamanho do array de entrada. Isso ocorre porque estamos usando um **HashMap** para armazenar os números à medida que
> os iteramos. No pior caso, todos os números serão armazenados no **HashMap**, portanto, o espaço necessário é proporcional
> ao tamanho do array de entrada.