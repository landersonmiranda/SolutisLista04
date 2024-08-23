# 📚 Solutis School Dev Trail - Lista 04

### Lista de Exercícios 04 – Orientação a Objetos Avançada em Java 
Este exercício tem como objetivo exercitar a compreensão de conceitos avançados de orientação a objetos em Java, incluindo a utilização de interfaces, classes abstratas e herança.

## 📝 Questões abordadas no projeto

1. Criar uma interface AnimalIF com os métodos comer, moverse, dormir;
2. Criar uma classe abstrata AnimalAB que implementa a interface AnimalIF e
define os métodos abstrados assinado na interface;
3. Crie as classes concertas Cachorro, Gato, Elefante, Leão que herdarão da classe
AnimalAB e sobrescreva os métodos abstratos comer, moverse, dormir; As
ações desses métodos consistem em alterar o estado interno do objeto através
dos atributos de instância que representam a quantidade de comida ingerida ao
comer, a quantidade de caminho percorrido ao moverse, e a quantidade de horas
ao dormir;
4. Crie uma classe Peixe e Pombo. De quem vamos herdar? Um peixe nada e um
pombo voa então os métodos nadar e voar devem estar na classe abstrata
Animal? Não. Então criem uma classe abstrata AnimalMarinhoAB
,AnimalVoadorAB, AnimalTerrestreAB que implementa a classe abstrata
AnimalAB para representar a classe abstrata para animais marinhos e aéreos
“que voam”.
5. Para todas as classes derivem os atributos de cada objeto a partir da
representação real de cada animal, ou seja, seus atributos serão nome, tipo
animal, idade, habitat, quantidade de patas, quantidadeAssas, envergaduraAssa,
altura, peso. Descubram em quais classes abstratas criadas acima esses atributos
se encaixam e os criem.
