package as;

import as.model.Marca;
import as.model.Producto;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    //crear un objeto instancia de clase
    //uso nombre de la clase y operdador new

    Producto producto = new Producto();

    Producto producto2 = new Producto(1, "Bicicleta rodado 12", 254879, 10);

    Producto producto3 = new Producto(2, "Bicicleta rodado 20");

    String texto = producto2.obtenerTextoProducto();

    //llamar a metodo nombreObjeto.nombreMetodo
    System.out.println(texto);

    //System.out.println(producto3.obtenerTextoProducto());

    //System.out.println(producto.obtenerTextoProducto());

    producto.mostrarProducto();
    producto3.mostrarProducto();

    System.out.println("nombre del producto3: " + producto3.getNombre());

    producto.setId(1);
    producto.setNombre("Casco Bicicleta");
    producto.setPrecio(28000);
    producto.setStock(5);
    producto.setVigente(true);
    System.out.println("El producto 1 esta vigente? " + producto.getStrVigente());
    producto.mostrarProducto();

    Marca marca1 = new Marca("SLP");
    System.out.println("Marca1: "+marca1.getMarca());

    Marca marca2 = new Marca("BMX");
    System.out.println("Marca 2: "+ marca2.getId()+""+marca2.getMarca());

    Marca marca = new Marca("asdasd");
    System.out.println("Marca 2: "+ marca.getId()+""+marca.getMarca());

    Producto producto4 = new Producto(1, "rodado 26 rojo",654654, 5);

    //los atributos y metodos static son unicos para la clase, se usan
    //a partir del nombre de la clase

  }
}