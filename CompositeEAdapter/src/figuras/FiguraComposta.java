package figuras;

import java.util.ArrayList;

public class FiguraComposta extends Figura {
	protected ArrayList<Figura> figuras = new ArrayList<Figura>();
	
	public void add(Figura f) {
		figuras.add(f);
	}
	@Override
	public String desenha() {
		// TODO Auto-generated method stub
		return "Desenho da figura " + this.getClass().getSimpleName();
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
	public ArrayList<Figura> getFiguras() {
		return figuras;
	}

}
