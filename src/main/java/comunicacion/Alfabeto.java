package comunicacion;

import java.util.ArrayList;

public class Alfabeto extends Pictograma {
	private static ArrayList<String> letras = new ArrayList<String>();
	private String interpretacion;

	public Alfabeto(ArrayList<String> letras, String interpretacion, String origen) {
		super(origen);
		Alfabeto.letras = letras;
		this.interpretacion = interpretacion;
	}

	public ArrayList<String> getLetras() {
		return letras;
	}

	public void setLetras(ArrayList<String> letras) {
		Alfabeto.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public Integer cantidadletras() {
		return letras.size();
	}

	@Override
	String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String objLista = String.join(", ", letras);
		return objLista;
	}

}