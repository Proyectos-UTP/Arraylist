
package paquete;

import java.util.ArrayList;

public class NewMain {

    public static void main(String[] args) {
    //se crea el arraylist "cars"
    ArrayList<String> cars = new ArrayList<String>();
    //se añaden elementos al arraylist
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    System.out.println(cars);
    
    System.out.println("");
    
    //se añade el elemento "Mazda al arraylist en la posición 0"
    cars.add(0, "Mazda");
    System.out.println(cars);
    System.out.println("");
    //se accede a un elemento del arraylist
    System.out.println(cars.get(3));
    System.out.println("");
    //se cambia un elemento del arraylist
    cars.set(0, "Opel");
    System.out.println(cars);
    System.out.println("");
    //se elimina un elemento del arraylist
    cars.remove(0);
    System.out.println(cars);
    System.out.println("");
    //se muestra cuantos elementos hay en un arraylist
    System.out.println(cars.size());
    System.out.println("");
    //se eliminan todos los elementos en un arrraylist
    cars.clear();
    System.out.println(cars);
    }
    
}
