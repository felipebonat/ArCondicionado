package testes;

import exercicio.ArCondicionado;

public class Principal {

    public static void main(String[] args) {
        //ArCondicionado objeto = new ArCondicionado("LG", 18, 1,true,false, 0);
        ArCondicionado objeto = new ArCondicionado("LG",18);
        System.out.println("Modelo ArCondicionado: " + objeto.getModelo());
        objeto.setModelo("Samsung");
        System.out.print("Modelo ArCondicionado: " + objeto.getModelo());
    }
}
