package as.model;

public class Producto {
  //atributos
  private int id;
  private String nombre;
  private double precio;
  private int stock;
  private boolean vigente;
  private final String tipo="Bicicleta";
  private Marca marca;

  //metodo constructor: es el metodo que se llama cada vez que creo un objeto de la clase
  public Producto() {
    this.marca = new Marca();
  }

  public Producto(int id, String nombre) {
    this.id = id;
    this.nombre = nombre;
    this.marca = new Marca();
  }

  public Producto(int id, String nombre, double precio, int stock) {
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
    this.marca = new Marca();
  }
  //crear metodos

  //si me devuelva todos los datos en un texto
  //sintaxis: modificador de acceso, tipo de dato de retorno, nombre del metodo, (argumentos)
  public String obtenerTextoProducto() {
    return "\n Producto " +
        "\n id: " + this.id +
        "\n Nombre: " + this.nombre +
        "\n Stock: " + this.stock +
        "\n Precio: " + this.precio +
        "\n "+this.getStrVigente()+
        "\n tipo: "+ tipo+
        "\n marca: "+ this.marca.getId()+""+this.marca.getMarca();

  }

  //no devuelva nada pero muestra los datos
  public void mostrarProducto() {
    System.out.println(this.obtenerTextoProducto());
  }

  //2 metodos x cada atributo: 1) para obtenerlo 2) otro para editar set

  //metodo get: siempre retorna elmismo tipo de dato que el atributo
  public int getId() {
    return this.id;
  }

  public String getNombre() {
    return this.nombre;
  }

  //metodo set: no retornan valor pero si reciben el nuevo valor del mismo tipo que el atributo al cual refiere
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getPrecio() {
    return this.precio;
  }

  public int getStock() {
    return this.stock;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public void setVigente(boolean vigente){
    this.vigente = vigente;
  }
  public boolean getVigente(){
    return this.vigente;
  }
  public String getStrVigente(){
   return this.vigente==true?"Esta vigente":"No esta vigente";
  }
  public void setMarca(Marca marca){
    this.marca = marca;
  }
  public Marca getMarca(){
    return this.marca;
  }
}
