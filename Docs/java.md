## Java

Em todo arquivo Java, somos obrigados a declarar ao menos uma classe.

O nome da classe principal deve ser igual ao nome do arquivo.

Se houver uma classe pública no arquivo, ela obrigatoriamente deve ter o mesmo nome do arquivo.

Não é necessário que todas as classes sejam públicas, mas apenas uma pode ser pública e deve corresponder ao nome do arquivo. todo arquivo java somos obrigados a declarar uma classe

O nome da classe deve ser igual o nome do arquivo.

### Resumo sobre Variáveis e Tipos Primitivos no Java

#### Declaração de Variáveis

- **Exemplo**: `int idade = 25;`
  - O valor pode ser alterado ao longo do código, mas o tipo da variável não pode ser modificado.
- É possível usar `var` para declarar variáveis sem especificar o tipo explicitamente. O Java irá inferir o tipo com base no valor atribuído.
  - **Exemplo**: `var meuNome = "Allison";`

#### Tipos Primitivos

- **Números Inteiros**: Não possuem casas decimais.

  - `byte`: 8 bits, valores de -128 a 127.
  - `short`: 16 bits, valores de -32.768 a 32.767.
  - `int`: 32 bits, valores de -2.147.483.648 a 2.147.483.647.
  - `long`: 64 bits, usado para valores maiores.

- **Números Decimais**:

  - `float`: 32 bits, precisão simples (menos casas decimais).
  - `double`: 64 bits, precisão dupla (mais casas decimais).

float f = 10.5f;
long l = 10000L;

- **Texto**:

  - `String`: Representa palavras ou frases. Deve ser declarada entre aspas duplas (`"texto"`).
  - `char`: Representa um único caractere. Deve ser declarado entre aspas simples (`'c'`).

- **Booleano**:
  - `boolean`: Representa valores lógicos, podendo ser `true` ou `false`.

#### Observação sobre `String`

- A `String` é uma classe no Java, e por isso seu nome começa com letra maiúscula (`S` maiúsculo).
- **Exemplo**: `String saudacao = "Olá, mundo!";`
- Strings permitem manipulação de texto e possuem diversos métodos úteis.
