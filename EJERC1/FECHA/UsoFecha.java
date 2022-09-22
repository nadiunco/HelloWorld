class UsoFecha {
  //compilar y ejecutar en shell
  
  //javac -classpath .:/run_dir/junit-4.12.jar:target/dependency/* -d . Fecha.java UsoFecha.java
  //java -classpath .:/run_dir/junit-4.12.jar:target/dependency/* UsoFecha

  //javac Fecha.java UsoFecha.java
  //java  UsoFecha
  
  public static void main(String[] args) {
    // ejemplo1();
    ejemplo2();
  }

  /**
     Muestra dos fechas una válida y otra inválida
  */
  public static void ejemplo1(){
    System.out.println("Hola a todos!");

    Fecha hoy = new Fecha();
    
    Fecha ayer;
    ayer = new Fecha();

    boolean error = hoy.inicializar(38, 100, -2022);
    if (error == true)
      System.out.println("Error al iniciar la fecha de hoy...");

    error = ayer.inicializar(14, 3, 2022);
    // ayer.dia = 54321;

    if (error)
      System.out.println("Error al iniciar la fecha de ayer...");

    
    System.out.println("Hoy: " + hoy.consultar());
    System.out.println("Ayer: " + ayer.consultar());    
  }

  /**
     Muestra dos fechas con diferentes formatos
  */
  public static void ejemplo2(){
    Fecha hoy, ayer;
    hoy = new Fecha(); ayer = new Fecha();

    hoy.inicializar(14, 3, 2022);
    ayer.inicializar(13, 3, 2022);
    ayer.cambiarFormato();
    
    System.out.println("Hoy: " + hoy.consultar());
    System.out.println("Ayer: " + ayer.consultar());
  }
}