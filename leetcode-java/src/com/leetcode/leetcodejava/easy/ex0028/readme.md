# [Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)

#### \#TwoPointers \#String \#StringMatching

## Solução Força Bruta

Iniciamos determinando os comprimentos das Strings `haystack` e `needle`, armazenando-os nas variáveis `l` e `n`,
respectivamente. Em seguida, iniciamos um loop que percorre a String `haystack` desde o índice 0 até `n- l + 1`, pois
estamos procurando uma substring do tamanho de `needle` dentro de `haystack`. Para cada índice de início, extraímos uma
substring de `haystack` do tamanho de `needle` e comparamos com `needle`. Se a substring e `needle` forem iguais,
retornamos o índice de início, pois encontramos a primeira ocorrência de `needle` em `haystack`. Se não encontramos uma
ocorrência após percorrer toda a `haystack`, retornamos -1, indicando que `needle` não é parte de `haystack`.

### Complexidade de Tempo
>**O (nm)** - Onde **n** é o tamanho da `haystack` e **m** é o tamanho da `needle`. Isso ocorre porque para cada caractere
> na `haystack`, estamos verificando até `m` caracteres na `needle`.. Portanto, no pior caso, teríamos que fazer `n * m`
> comparações.

### Complexidade de Espaço
>**O (1)** - Significa que o espaço necessário não aumenta com o tamanho da entrada. Isso ocorre porque não estamos usando
> nenhuma estrutura de dados adicional que cresce com o tamanho da entrada. Estamos apenas usando algumas variáveis para
> armazenar os comprimentos das Strings e os índices atuais, que ocupam um espaço contante.

## Solução Ideal

Utilizada a função `indexOf` de `haystack` para encontrar o índice da primeira ocorrência de `needle`. A função `indexOf`
retorna o índice da primeira ocorrência da String específica, começando a busca no início da String. Se a String não for
encontrada, ela retorna -1.

### Complexidade de Tempo
>**O (m + n)** - No caso da função `indexOf`, ela percorre a String `haystack` e para cada caractere, ela verifica se a
> String `needle` começa naquela posição. Portanto, no pior caso, ela pode ter que verificar cada posição em `haystack`,
> o que leva um tempo proporcional ao tamanho de `haystack` que chamamos de `m`. Além disso, para cada posição, ela pode
> ter que comparar até todos os caracteres em `needle`, o que leva um tempo proporcional ao tamanho de `needle`, que
> chamamos de `n`. Portanto, a complexidade de tempo é **O (m + n)**, o que significa que o tempo que leva para executar
> aumenta linearmente com o tamanho de `m` e `n`.

### Complexidade de Espaço
>**O (1)** - A função `indexOf` não precisa de nenhum espaço adicional que aumenta com o tamanho da entrada, então a
> complexidade do espaço é **O (n)**, o que significa que a quantidade de memória necessária é constante, não importa o
> tamanho da entrada.