package comunicacion;

public class Alfabeto extends Pictograma {
	private static String[] letras;
	private String interpretacion;

	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		Alfabeto.letras = letras;
		this.interpretacion = interpretacion;
	}

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public Integer cantidadletras() {
		return letras.length;
	}

	@Override
	public String interpretacion() {
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