# Vetores (Arrays) em Java

Vetores, também conhecidos como arrays, são estruturas de dados fundamentais em Java. Eles permitem armazenar múltiplos valores do mesmo tipo em uma única variável, facilitando a organização e manipulação de grandes quantidades de dados.

## Declaração e Inicialização

Para declarar e inicializar um vetor em Java, você pode utilizar a seguinte sintaxe:

```java
String frutas[] = {"Maça", "Banana", "Uva", "Melancia"};
System.out.println(frutas[0]); // Saída: Maça
```

Neste exemplo, o vetor `frutas` é criado com quatro elementos e o acesso ao primeiro elemento é feito pelo índice 0.

## Tamanho Fixo

Ao declarar um vetor dessa forma, seu tamanho é fixo e não pode ser alterado posteriormente. Tentar acessar um índice fora do intervalo válido resultará em um erro de "ArrayIndexOutOfBoundsException".

## Propriedade `.length`

Para descobrir o tamanho de um vetor, utilize a propriedade `.length`:

```java
System.out.println(frutas.length); // Saída: 4
```

## Inicialização sem Valores

Se você ainda não sabe quais valores irá armazenar, pode apenas definir o tamanho do vetor:

```java
String[] meusNomes = new String[10];
```

Posteriormente, é possível atribuir valores aos elementos individualmente ou substituir todo o vetor:

```java
meusNomes = new String[] {"Allison", "Marcio", "Cleber", "Juca"};
System.out.println(meusNomes[3]); // Saída: Juca
```

## Resumo

- Vetores armazenam múltiplos valores do mesmo tipo.
- O tamanho do vetor é fixo após a inicialização.
- O acesso aos elementos é feito por índices, começando do zero.
- Use `.length` para obter o tamanho do vetor.
- É possível inicializar o vetor vazio e atribuir valores depois.

Esses conceitos são essenciais para manipulação eficiente de dados em Java.
