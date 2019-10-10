package modulo3_aula2;

public class Retangulo implements AreaCalculavel {
	
	private int largura;
	private int altura;
	
	public Retangulo(int l, int a) {
		this.largura = l;
		this.altura = a;
	}
	
	@Override
	public double calculaArea() {
		return this.largura * this.altura;
	}

}
