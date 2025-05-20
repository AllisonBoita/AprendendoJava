Casting em Java é o processo de conversão de um tipo de dado para outro.

Em determinadas situações, precisamos transformar o tipo de uma variável para realizar operações específicas.

Por exemplo, ao ler um arquivo `.txt` com idades como `"20 40 60 34"`, os valores são lidos como `String`, mas podemos precisar deles como inteiros.

Para isso, utilizamos o casting.

**Importante:** O casting transforma o valor, não a variável original.

### Casting Explícito

Ocorre quando informamos explicitamente a conversão desejada. Exemplo:

```java
double resultado = 0.5;
int resultadoInt = (int) resultado; // resultadoInt será 0
```

### Casting Implícito

Acontece automaticamente quando não há risco de perda de informação:

```java
int meuInt = 10;
double meuDouble = meuInt; // meuDouble será 10.0
System.out.println(meuDouble);
```

### Conversão de String para int

Quando precisamos converter uma `String` para `int`, não basta apenas fazer casting. Usamos métodos utilitários, como:

```java
String meuString = "20";
int meuInt2 = Integer.parseInt(meuString); // meuInt2 será 20
```

**Resumo:**

- Use casting explícito para conversões que podem perder dados (ex: `double` para `int`).
- Use casting implícito para conversões seguras (ex: `int` para `double`).
- Para converter `String` em tipos numéricos, utilize métodos como `Integer.parseInt`.asting é algo que permite que possamos fazer a conversão de um tipo de um dado pro outro.
