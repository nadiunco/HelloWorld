class Fecha {
  // Atributos
  private int dia;
  private int mes;
  private int anyo;
  private boolean formato;

  // Métodos

  /**
    Se encarga de dar valor inicial a la fecha.
    @param d Valor del dia
    @param m Valor del mes
    @param a Valor del año
    @return Verdadero si la fecha es válida o Falso en caso contrario
  */
  public boolean inicializar(int d, int m, int a) {
    boolean error = false;

    // Valida el dia
    if (d>0 && d<31)
      dia = d;
    else {
      dia = 1;
      error = true;
    }

    // Valida el mes
    if (m >= 1 && m <= 12)
      mes = m;
    else {
      mes = 1;
      error = true;
    }

    // Valida el año
    if (a>0)
      anyo = a;
    else {
      anyo = 1;
      error = true;
    }

    formato = true;
    return error;   
  }  

  /**
    Formatea la fecha y la retorna como cadena de caracteres
    @return La fecha con el formato dado
  */
  public String consultar() {
    String salida;
    this.cambiarFormato();
    if (formato == true)
      salida = dia + "/" + mes + "/" + anyo;
    else
      salida = mes + "/" + dia + "/" + anyo;
    return salida;
  }

  /**
     Cambia el formato de la fecha
  */
  public void cambiarFormato(){
    // Si esta true o sea DMA, cambia a false, o sea MDA, o lo contrario
    formato = !formato;
  }
}