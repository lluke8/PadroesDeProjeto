package adapter;

import figuras.Figura;

public class AdapterFigura extends Figura{
	
	private Figura figuraAdaptada;
	
	public AdapterFigura(Figura figuraAdaptada) {
		this.figuraAdaptada = figuraAdaptada;
	}
	public Figura getFiguraAdaptada() {
		return figuraAdaptada;
	}
	public void setFiguraAdaptada(Figura figuraAdaptada) {
		this.figuraAdaptada = figuraAdaptada;
	}
	@Override
	public String desenha() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double volume(){
		return 0;
	}
	
	public String desenharFigura(){
		return "AdapterFigura: " + this.figuraAdaptada.getClass().getSimpleName();
	}

}

