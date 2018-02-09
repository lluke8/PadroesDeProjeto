package aplicacao;

import adapter.AdapterFigura;
import figuras.Circulo;
import figuras.Figura;
import figuras.FiguraComposta;
import figuras.Losango;
import figuras.Quadrado;
import figuras.Triangulo;

public class Teste {

	public static void main(String[] args) {
		Figura circulo = new Circulo();
		Figura figuraComp = new FiguraComposta();
		Figura triangulo = new Triangulo();
		
		
		((FiguraComposta) figuraComp).add(circulo);
		((FiguraComposta) figuraComp).add(triangulo);
		
		System.out.println(circulo.desenha());
		System.out.println(figuraComp.desenha());
		
		System.out.println("Figura Composta formada por:");
		for (Figura figura : ((FiguraComposta) figuraComp).getFiguras()) {
			System.out.println(figura.desenha());
		}
		
		
		System.out.println("\nAdapter");
		AdapterFigura a = new AdapterFigura(new Losango());
		System.out.println(a.desenharFigura());
		a.setFiguraAdaptada(new Quadrado());
		System.out.println(a.desenharFigura());
		
	}

}
