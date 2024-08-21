/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author yursd
 */
public class Main {
    public static void main(String[] args) {
        // Crear instancias de cada clase que implementa Animal
        Animal miPerro = new Perro();
        Animal miGato = new Gato();
        Animal miVaca = new Vaca();

        // Llamar al método hacerSonido() para cada instancia
        miPerro.hacerSonido();
        miGato.hacerSonido();
        miVaca.hacerSonido();
    }
}
