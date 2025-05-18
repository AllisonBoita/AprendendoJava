## Resumo sobre loops em Java

Loops são estruturas de repetição que permitem executar um bloco de código várias vezes, de acordo com uma condição. Em Java, os principais tipos de loops são:

- **for**: usado quando se sabe o número de repetições.
- **while**: executa enquanto a condição for verdadeira.
- **do-while**: executa pelo menos uma vez e depois verifica a condição.

Esses comandos ajudam a automatizar tarefas repetitivas e a percorrer coleções de dados.

### Exemplos de loops em Java

```java
// Exemplo de loop for
for (int i = 0; i < 5; i++) {
    System.out.println("Valor de i: " + i);
}

// Exemplo de loop while
int j = 0;
while (j < 5) {
    System.out.println("Valor de j: " + j);
    j++;
}

// Exemplo de loop do-while
int k = 0;
do {
    System.out.println("Valor de k: " + k);
    k++;
} while (k < 5);
```

Tanto pra array lists quanto vetores podemos usar essa forma:

for (String nome : meusNomes){
            System.out.println(nome);
        }