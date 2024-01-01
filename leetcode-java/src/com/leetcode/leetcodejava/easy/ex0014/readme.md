# [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/)

#### \#String \#Trie

## Solução Força Bruta

Se o array de Strings for nulo ou vazio, retorna uma String vazia. Caso contrário, inicia um loop externo que percorre
cada caractere da primeira String. Para cada caractere, inicia um loop interno que percorre as outras Strings do array.
Se o caractere atual da String atual não for igual ao caractere da primeira String, ou se chegarmos ao final da String
atual, retorna o prefixo comum encontrado até o momento. Se o loop externo terminar sem encontrar um caractere desigual,
isso significa que a primeira String é o prefixo comum mais longo, então retorna a primeira String.

### Complexidade de Tempo
>**O (n * m)** - Onde **n** é o número de Strings no array e **m** é o comprimento da String mais curta. Isso ocorre
> porque, no pior dos casos, precisamos comparar cada caractere de cada String (**n** * **m** comparações).

### Complexidade de Espaço
>**O (1)** - Isso significa que o espaço necessário não aumenta com o tamanho da entrada. Isso ocorre porque não estamos
> usando nenhuma estrutura de dados adicional que cresça com o tamanho da entrada.

## Solução Ideal

Se o array de Strings for nulo ou vazio, retorna uma String vazia. Caso contrário, ordenamos o array de
Strings e pegamos a primeira e a última String. Inicializamos um contador para rastrear a posição do caractere que
estamos comparando. Então, entramos em um loop, comparando o caractere atual da primeira e da última String. Se os
caracteres forem iguais, incrementa o contador, caso contrário, interrompe o loop. Finalmente, se o contador for 0,
retorna uma String vazia, indicando que não há prefixo comum. Caso contrário, retorna o prefixo comum.

### Complexidade de Tempo
>**O (n * m log n)** - Onde **n** é o número de Strings e **m** é o comprimento da String mais curta. Isso ocorre porque,
> no pior dos casos, precisamos ordenar o array de String, que leva o tempo **O (n log n)**, e depois comparar cada
> caractere da primeira e da última String, que leva o tempo de **O (m)**.

### Complexidade de Espaço
>**O (1)** - Isso significa que o espaço necessário não aumenta com o tamanho da entrada. Isso ocorre porque não estamos
> usando nenhuma estrutura de dados adicional que cresça com o tamanho da entrada.