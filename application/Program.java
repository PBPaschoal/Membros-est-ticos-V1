/* Rio de Janeiro, Dia 12/01/2023
Primeira versão do programa.
Uma Class possui membros, esses membros são atributos e métodos.

Exemplo:

Class: Product

Atributos:
- Name: string
- Price: double
- Quantity: int

Métodos:

+ TotalValueInStock(): double
+ AddProducts(quantity: int): void
+ RemoveProducts(quantity: int): void

*Membros estáticos*

Também chamados de mebros de classe 
- Em oposição a membros e instância

São membros que fazem sentido independentemente de objetos.
Não precisam de objeto para serem chamados. São chamados a partir do próprio nome da classe.

Aplicações comuns:
- Classes utilitárias - Exemplo: Math.sqrt(dobule)
- Declaração de constantes

Uma classe que possui somente membros estáticos, pode ser uma classe estática também.
Esta classe não poderá ser instanciada.

Problema exemplo:

Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto seria o valor de uma circunferência e do volume de uma esfera para um raio daquele valor.
Informar também o valor de PI com duas casas decimais.

Exemplo:
Enter radius: 3.0
Circumference: 18.84
Volume: 113.04
PI value: 3.14

Checklist

- Versão 1: métodos na própria classe do programa
Nota: dentro de um método estático você não pode chamar mebros de instância da mesma classe.

- Versão 2: classe Calculator com membros de instância

- Versão 3: classe Calculator com método estático */


package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static final double PI = 3.14159; //Constante (não vai mudar mais) OBS: Padrão de nome para constantes devem ser tudo em letra maiuscula

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = teclado.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume(radius);
		
		System.out.printf("circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		
		teclado.close();

	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}