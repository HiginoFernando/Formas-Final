package entidades;

public class forma {
	public double base;
	public double largura;
	public double altura;
	public String tipo;

	
	public forma(double base, float altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	public forma(double altura, double largura) {
		super();
		this.largura = largura;
		this.altura = altura;
	}
	
	


	public double calcularArea() {
		return calcularArea();
	}

	public String mostrarInfo(String tipo) {
		if(tipo.equalsIgnoreCase("Triangulo")) {
		return "Triangulo [base=" + base + ", largura=" + altura + "]";
	}else if(tipo.equalsIgnoreCase("Retangulo")) {
		return "Retangulo [Largura=" + largura + ", Altura=" + altura + "]";
	}
		return tipo;
}


}