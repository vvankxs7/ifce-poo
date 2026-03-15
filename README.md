POO Exercicios
Repositorio de exercicios de Programacao Orientada a Objetos em Java, desenvolvido durante o curso Tecnico em Informatica no IFCE Maracana.

Conteudo
Classe Produto
Classe modelo com atributos encapsulados, metodos get e set, compareTo e toString.
Atributos:

nome (String)
preco (float)

Metodos:

setNome / getNome
setPreco / getPreco
compareTo(Produto p) — compara preco entre dois objetos, retorna 1, -1 ou 0
toString() — retorna os dados formatados

DemoProduto
Classe de execucao que demonstra o uso da classe Produto com as seguintes funcionalidades:

Leitura de N produtos via teclado usando Scanner
Calculo e impressao da media dos precos
Encontra e imprime o produto com maior preco usando compareTo
Ordena os produtos por preco crescente usando bubble sort com compareTo
Imprime todos os produtos ordenados
Imprime o ultimo produto do vetor


Conceitos Praticados

Encapsulamento de atributos com private
Metodos getter e setter
Metodo toString para impressao de objetos
Metodo compareTo para comparacao entre objetos
Instanciacao de objetos com new
Vetor de objetos
Leitura de dados com Scanner
Calculo de media com for
Busca do maior valor com for
Ordenacao bubble sort com dois fors aninhados
Acesso ao ultimo elemento com length - 1

Tecnologias

Java
Scanner (java.util.Scanner)


Autor
Curso Tecnico em Informatica — IFCE Maracanau
Professor: Jean Marcelo da Silva Maciel

Compile os arquivos na seguinte ordem:
javac Produto.java
javac DemoProduto.java

executar:
java DemoProduto

