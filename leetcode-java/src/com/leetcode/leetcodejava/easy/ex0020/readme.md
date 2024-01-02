# [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)

#### \#String \#Stack

## Solução Força Bruta

O método principal **isValid** recebe uma String de entrada e retorna se ela é válida ou não. A String é considerada válida se todas
as suas substrings de parênteses são válidas. O método percorre cada caractere na String de entrada e gera todas as
substrings possíveis que começam no caractere atual. Para cada substring, é chamado o método **isValidSubstring**. Se a
substring é válida, o método retorna true. Se nenhuma substring válida for encontrada após verificar todas as substrings
possíveis, o método retorna false.

O método auxiliar **isValidSubstring** verifica se uma substring é válida. Ele usa uma `pilha` para acompanhar os parênteses abertos.
O método percorre cada caractere na substring. Se o caractere atual é um parêntese aberto, ele é empurrado para a `pilha`.
Se o caractere atual é um parêntese fechado, o método verifica o topo da `pilha`. Se a `pilha` está vazia ou o topo da
`pilha` não é o parêntese aberto correspondente, o método retorna false. Se todos os caracteres na substring foram
verificados e a pilha está vazia, o método retorna true.

Já o método auxiliar **isMatchingPair** verifica se um par de parênteses é um par correspondente. O método recebe dois caracteres
como entrada, um parêntese aberto e um parêntese fechado, e retorna true se eles formam um par correspondente. Caso
contrário, retorna false .

### Complexidade de Tempo
>**O (n^3)** - Onde **n** é o comprimento da String de entrada. Temos dois loops aninhados que percorrem a String de 
> entrada, o que nos dá uma complexidade de tempo de **O (n^2)**. Dentro desses loops, chamamos o método **isValidSubstring**
> em cada substring. Como esse método também percorre a substring, adiciona outra dimensão à nossa complexidade de tempo.

### Complexidade de Espaço
>**O (n)** - Onde **n** é o comprimento da String de entrada. Estamos utilizando uma `pilha` para acompanhar os parênteses
> abertos. No pior caso, todos os caracteres na String de entrada são parênteses abertos, então teríamos que adicionar
> todos eles à `pilha`.

## Solução Ideal

Inicializamos uma `pilha` para armazenar parênteses abertos. Em seguida, itera sobre cada caractere na String de entrada.
Se o caractere é um parêntese aberto, ele é empilhado na `pilha`. Se o caractere é um parêntese fechado, e correspondente
ao último parêntese aberto na `pilha` (ou seja, `(` com `)`, `{` com `}` ou `[` com `]`), o parêntese aberto é desempilhado
da `pilha`. Se o caractere é um parêntese fechado, e não corresponde ao último parêntese aberto na `pilha`, ou se a `pilha`
está vazia, o código retorna false, indicando que a String de entrada não é válida. Após iterar por todos os caracteres na
String de entrada, se a `pilha` estiver vazia, o código retorna true, indicando que a String de entrada é válida. Caso
contrário, retorna false.

### Complexidade de Tempo
>**O (n)** - Onde **n** é o comprimento da String de entrada. Cada caractere na String de entrada é processada exatamente
> uma vez. Portanto, se a String de entrada tem **n** caracteres, o código levará um tempo proporcional a **n** para ser
> executado.

### Complexidade de Espaço
>**O (n)** - Onde **n** é o comprimento da String de entrada. No pior cenário, todos os caracteres na String de entrada
> são parênteses abertos, o que significa que todos eles serão empilhados na `pilha`. Portanto, se a String de entrada
> tem **n** caracteres, o código usará uma quantidade de memória proporcional a **n**.