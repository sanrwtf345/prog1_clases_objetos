package as.model;

public class Marca {
  private int id;
  private String marca;
  private static int cantidadDeMarcas;

  public Marca(){
    cantidadDeMarcas++;
    //le doy un id automatico a cada marca, es decir las enumero
    this.id = cantidadDeMarcas;
  }
  public Marca(String marca){
    this.marca = marca;
    cantidadDeMarcas++;
    this.id = cantidadDeMarcas;
  }
  public int getId(){return this.id;}
  public String getMarca(){return this.marca;}

}
