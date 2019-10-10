package modulo3_aula2;

public class Main {

	public static void main(String[] args) {
		
		AreaCalculavel area = new Quadrado(7);
		System.out.println("Área total quadrado: " + area.calculaArea());
		
		area = new Retangulo(7,10);
		System.out.println("Área total retângulo: " + area.calculaArea());
		
		area = new Triangulo(7,7);
		System.out.println("Área total triângulo: " + area.calculaArea());

	}

}
