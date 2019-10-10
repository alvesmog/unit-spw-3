package modulo3_aula2;

public class Triangulo implements AreaCalculavel {
	
	private int base;
	private int altura;
	
	public Triangulo (int b, int a) {
		this.base = b;
		this.altura = a;
	}
	
	@Override
	public double calculaArea() {
		return (this.base*this.altura)/2;
	}
	
}
