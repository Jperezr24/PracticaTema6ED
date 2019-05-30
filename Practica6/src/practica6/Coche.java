package practica6;

/**
 * 
 * @author Jose Pérez
 * @version 1.0
 *
 */



/**
 * Construimos la clase Coche
 * 
 *
 */
public class Coche {
	
	/**
	 * Creamos los paramentros
	 * @param matricula
	 * @param combustible
	 * @param modelo
	 * @param fabricante
	 */
	String matricula;
	String combustible;
	String modelo;
	String fabricante;

	public Coche() {
		
		/**
		 * Damos un valor vacío a cada uno de los parametros
		 */
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}

	public String getMatricula()
	{
		/**
		 * Genera Matricula
		 * 
		 * @return Devuelve la matricula
		 */
		return matricula;
	}

	public void setMatricula(String matricula)
	{
		/**
		 * Iguala matricula
		 * 
		 */
		this.matricula = matricula;
	}

	public String getCombustible()
	{
		/**
		 * Genera Combustible
		 * @return Devuelve la combustible
		 */
		return combustible;
	}

	public void setCombustible(String combustible)
	{
		/**
		 * Iguala combustible
		 * 
		 */
		this.combustible = combustible;
	}

	public String getModelo()
	{
		/**
		 * Genera modelo
		 * @return Devuelve modelo
		 */
		return modelo;
	}

	public void setModelo(String modelo)
	{
		/**
		 * Iguala modelo
		 * 
		 */
		this.modelo = modelo;
	}

	public String getFabricante()
	{
		/**
		 * Genera fabricante
		 * @return Devuelve fabricante
		 */
		return fabricante;
	}

	public void setFabricante(String fabricante)
	{
		/**
		 * Iguala fabricante
		 * 
		 */
		this.fabricante = fabricante;
	}

	
	public Coche(String m, String c, String mo, String f) {
		/**
		 *  
		 * @param m
		 * @param c
		 * @param mo
		 * @param f
		 */
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}

	public String metodoGasolina(String modelo,String fabricante) {
		/**
		 * Es el metodo gasolina el cual entrarán los coches que funcionen con este combustible
		 * Creamos la variable resultado y se igualará a un modelo y fabricante junto a cuanto gasta por litro
		 * @return devuelve el resultado
		 */
		String resultado = "";
		
		resultado+="es un "+ modelo +" "+fabricante+" y gasta 1,337 euros por litro";
		
		return resultado;
		
	}
	
	public String metodoDiesel(String modelo,String fabricante) {
		
		/**
		 * Es el metodo diesel el cual entrarán los coches que funcionen con este combustible
		 * Creamos la variable resultado y se igualará a un modelo y fabricante junto a cuanto gasta por litro
		 * @return devuelve el resultado
		 */
		
		String resultado = "";
		
		resultado+="es un "+ modelo +" "+fabricante+" gasta 1,052 euros por litro ";
		
		return resultado;
		
	}
	
	public String metodoHibrido(String modelo,String fabricante) {
		
		/**
		 * Es el metodo hibrido el cual entrarán los coches hibridos
		 * Creamos la variable resultado y se igualará a un modelo y fabricante junto a cuanto gasta por litro
		 * @return devuelve el resultado
		 */
		String resultado = "";
		
		resultado+="es un "+ modelo +" "+fabricante+" no necesita combustible. ";
		
		return resultado;
		
	}
	

	public String MetodoCombustibles() {
		
		/**
		 * Este es el metodo combustibles que dependiendo de cuanto vale combustible entrará por una rama del programa u otro
		 * Se crea la variable resultado
		 * Si el combustible es Gasolina, el resultado se igualará a la matricula de este coche y llamará al metodo gasolina @see metodoGasolina
		 * Si el combustible es Diesel, el resultado se igualará a la matricula de este coche y llamará al metodo diesel @see metodoDiesel
		 * Si el coche es Hibrido, el resultado se igualará a la matricula de este coche y llamará al metodo hibrido @see metodoHibrido
		 * Si no entra en ninguna de las condiciones, el resultado se iguala a que no se tiene información del coche
		 * @param return devuelve el resultado 
		 */
		
		String resultado = "";
		
		if (combustible == "Gasolina") {
			
			resultado += "El coche con matricula " + matricula + " "+metodoGasolina(modelo, fabricante);

		} else if (combustible == "Diesel") {
			
			resultado += "El coche con matricula " + matricula + " "+metodoDiesel(modelo, fabricante);
			
		} else if (combustible == "Híbrido") {
			
			resultado += "El coche con matricula " + matricula + " "+ metodoHibrido(modelo, fabricante);
		} else {
			
			resultado += "El coche con matricula " + matricula + " " + "no dispone de información";
			
		}
		
		return resultado;
	}
}
