# [Palindrome Number](https://leetcode.com/problems/palindrome-number/)

#### \#Math

## Solução Força Bruta

Convertemos o número de entrada em uma String, e criamos uma nova String que é a inversão da String original. Em seguida,
comparamos as duas Strings, se forem iguais, o número é um palíndromo, caso contrário, não é um palíndromo.

### Complexidade de Tempo
>**O (n)** - Onde **n** é o número de dígitos no número. Isso ocorre porque estamos realizando três operações principais
> que dependem do tamanho do número: Conversão para String, Reversão da String e Comparação das Strings. Como essas
> operações são executadas sequencialmente (não aninhadas) a complexidade de tempo é linear.

### Complexidade de Espaço
>**O (n)** - Onde **n** é o número de dígitos no número. Isso ocorre porque estamos criando uma nova String que tem o
> mesmo tamanho que a String original. A criação dessa nova String requer espaço adicional que é proporcional ao tamanho
> do número. Portando, a complexidade de espaço é linear.


## Solução Ideal

Verificamos se `x` é negativo ou se termina com zero (mas não é zero), pois esses números não podem ser palíndromos. Em
seguida, iniciamos um loop que continua até que `x` seja menor ou igual ao número revertido, isso garante que revertamos
apenas a metade dos dígitos do número. Dentro do loop, adicionamos o último dígito de `x` ao final do número revertido, 
e removemos o último dígito de `x`. Após, verificamos se `x` e o número revertido são iguais (para números com um número
par de dígitos) ou se `x` é igual à metade do número revertido (para números com um número ímpar de dígitos). Se qualquer
uma dessas condições for verdadeira, `x` é um palíndromo.

### Complexidade de tempo
>**O (log n)** - Onde **n** é o número de dígitos no número. Isso ocorre porque estamos processando metade dos dígitos do
> número. Em outras palavras, para cada iteração do loop, estamos dividindo o número por 10, efetivamente reduzindo o
> número de dígitos que precisamos processar pela metade. Portanto, o tempo de execução aumenta logaritmicamente com o
> número de dígitos, não linearmente.

### Complexidade de Espaço
>**O (1)** - Pois não estamos usando nenhum espaço adicional que dependa do tamanho do número. Independentemente do
> número de dígitos no número, estamos usando uma quantidade constante de espaço para armazenar o número revertido e
> algumas variáveis adicionais. Portanto, a complexidade de espaço é constante.