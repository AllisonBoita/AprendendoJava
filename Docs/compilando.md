## Compilador em Java

O compilador Java (`javac`) é responsável por traduzir o código fonte escrito em arquivos `.java` para bytecode, que é armazenado em arquivos `.class`. Esse bytecode pode ser executado em qualquer máquina que possua a Java Virtual Machine (JVM), tornando o Java uma linguagem multiplataforma.

### Etapas da compilação:

1. **Escrita do código fonte:** O desenvolvedor cria arquivos `.java` contendo o código.
2. **Compilação:** Utilizando o comando `javac NomeDoArquivo.java`, o código é convertido em bytecode.
3. **Execução:** O comando `java NomeDaClasse` executa o bytecode na JVM.

### Vantagens do processo de compilação Java:

- **Portabilidade:** O bytecode pode ser executado em qualquer sistema operacional com JVM.
- **Verificação:** O compilador identifica erros de sintaxe antes da execução.
- **Desempenho:** O bytecode é otimizado para execução eficiente pela JVM.
