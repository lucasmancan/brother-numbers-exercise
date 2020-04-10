# Números Irmãos

Dois números inteiros não negativos são chamados de irmãos se eles podem ser
obtidos uns dos outros, apenas reorganizando os dígitos de suas representações
decimais. Por exemplo, 123 e 213 são irmãos. 535 e 355 também são irmãos.
Um conjunto que consiste em um inteiro não negativo N e todos os seus irmãos é
chamado de família de N. Por exemplo, a família de 553 é composta por três números:
355, 535 e 553.

Escreva um algoritmo de contenha uma função com as seguintes entradas e saídas:

* Entrada: N (inteiro)
* Saída: inteiro

Dado um número inteiro não negativo N, a função deve retornar o maior número na
família de N. Ela deve retornar -1 se o resultado exceder 100.000.000.
Exemplo, uma resposta para este exercício pode ter o seguinte formato:

```
 solution int(int N);
```

A inserção de N=213 nesta função deve retornar 321. Para N=553, a função deve
retornar 553. 


## Entendimento do problema

O problema em questão exemplifica a lógica de um anagrama,
 onde através da organização dos caracteres é possivel descobrir elementos diferentes. 
 
 Nesse caso em específico ele não pede todas as possibilidades de anagramas, mas sim o maior deles. 
 Portanto, para chegar nesse resultado é só separar os digitos do número, ordena-los de forma decrescente e depois juntar novamente.
 
 Assim, sempre vai retornar o maior valor (lembrando que tem que retornar -1 se o maior anagrama for maior que 100.000.000).


Obs: No serviço desenvolvido consta a minha tentativa de descobrir todas as possíbilidades de anagramas, o que vai ser melhorada até sua resolução completa e performática.
### Testes

Para garantir o funcionamento do algorítimo, testes unitários foram desenvolvidos e podem ser utilizados para testar a reslução do exercício.

#### Fluxo de testes

Executar a Classe BrotherNumbersServiceTest

### Tecnologias

** Java 11
** JUnit
*** Maven

## Autor

* **Lucas Frederico Mançan** - (lucasfmancan@gmail.com)


