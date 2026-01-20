package br.com.officialdelffin.CarMold;


// Classe que é o molde para todos os carros :
public class CarMold {


    // Atributos :

    // Atributos de todos os carros :
    private String name         = "";
    private String color        = "";
    private int yearOfRelease   = 0;
    private int autonomy        = 0;


    // Métodos :

    // Metodo que faz o carro acelerar :
    public void accelerate () {


        System.out.println( name + " acelerou o carro!" );


    }


    // Metodo que faz o carro freiar :
    public void brake () {


        System.out.println( name + " freiou o carro!" );


    }


    // Metodo que exibe a autonomia do carro :
    private void displaysAutonomy () {


        System.out.println( "A autonomia do veículo " + name + " foi de " + autonomy );


    }


}
