# [Roman to Integer](https://leetcode.com/problems/roman-to-integer/)

#### \#HashTable \#Math \#String

## Solução Força Bruta

Inicializamos a variável `result` com 0. Esta variável armazenará o resultado final. Percorremos a String de entrada de
trás para frente usando um loop `for`. A razão para percorrer de trás para frente é que, em números romanos, quando um
símbolo menor aparece antes de um maior, isso significa que o valor do símbolo menor deve ser subtraído do maior. Dentro
do loop, utilizamos uma instrução `switch` para verificar qual é o numeral romano atual. Para cada caso (ou seja, para
cada numeral romano), adicionamos seu valor correspondente ao resultado. No entanto, se o numeral for `I` e o resultado
atual for maior ou igual a 5, subtraímos o valor em vez de adicioná-lo. Fazemos algo semelhante para os símbolos `X` e 
`C`. Finalmente, após o loop ter percorrido todos os caracteres na String, retornamos o resultado.

### Complexidade de Tempo
>**O (n)** - Onde **n** é o comprimento da String de entrada. Isso ocorre porque percorremos cada caractere da String
> uma vez. Portanto, se a String tiver **n** caracteres, teremos que fazer **n** operações. 

### Complexidade de Espaço
>**O (1)** - Pois não estamos usando nenhum espaço adicional que escala com o tamanho da entrada. A única variável que
> estamos usando para armazenar o resultado não depende do tamanho da entrada. Portanto, a complexidade de espaço é 
> constante.


## Solução Ideal

Criamos um `map` para associar cada numeral romano ao seu valor correspondente. Em seguida, inicializamos a variável 
`result` com 0 para armazenar o resultado final. Depois, percorremos a String de entrada do início ao fim utilizando um
loop `for`. Dentro do loop, verificamos se o numeral romano atual é maior que o anterior. Se for, significa que estamos
lidando com um caso onde um numeral romano menor precede um maior, como em `IV`. Então, subtraímos duas vezes o valor
do numeral anterior (subtraímos duas vezes porque na iteração anterior, adicionamos o valor do numeral romano anterior
ao resultado, então precisamos subtrair uma vez para anular essa adição, e outra vez para realizar a subtração correta).
Caso o numeral romano atual não for maior que o anterior, simplesmente adicionamos seu valor ao resultado. Finalmente,
após o loop ter percorrido todos os caracteres na String, retornamos o resultado.

### Complexidade de Tempo
>**O (n)** - Onde **n** é o comprimento da String de entrada. Isso ocorre porque percorremos cada caractere da String
> uma vez. Portanto, se a String tiver **n** caracteres, teremos que fazer **n** operações.

### Complexidade de Espaço
>**O (1)** - Estamos utilizando duas variáveis (`result` e `map`) para armazenar os dados. O espaço necessário para a 
> variável `result` é constante, pois ela armazena apenas um único número inteiro, independentemente do tamanho da
> entrada. A variável `map`, por outro lado, armazena um mapeamento fixo de numerais romanos para seus valores
> correspondentes. O tamanho deste `map` é constante, pois existem apenas sete numerais romanos. Então, o espaço
> necessário para o `map` não muda, independentemente do tamanho da entrada. Portanto, a complexidade de espaço é
> constante.