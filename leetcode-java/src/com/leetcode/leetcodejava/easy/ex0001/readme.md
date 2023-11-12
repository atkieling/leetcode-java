# [Two Sum](https://leetcode.com/problems/two-sum/)

#### \#Array \#HashTable

## Solução Simples (Força Bruta)

Considera todos os pares possíveis de números na matriz de entrada, e verifica se a soma de algum desses valores é 
igual ao valor alvo. 

A solução simples requer dois loops, um dentro do outro. O loop externo fará um loop sobre o array e, para cada 
elemento visitado, o loop interno fará um loop sobre os elementos restantes no array e verificará se os dois 
elementos somam o valor alvo.

Assim que tivermos os dois valores que somam o valor alvo, simplesmente retornamos os dois índices do array com esses 
valores.

### Complexidade de tempo
>**O(n^2)** - O código usa loops aninhados para comparar todos os pares de elementos no array.

### Complexidade de espaço
>**O(1)** - O espaço não depende do tamanho da matriz de entrada, portanto, apenas o espaço constante é usado.


