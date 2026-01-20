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


        // Avisa que o carro acelerou :
        System.out.println( name + " acelerou o carro!" );


    }


    // Metodo que faz o carro freiar :
    public void brake () {


        // Avisa que o carro freiou :
        System.out.println( name + " freiou o carro!" );


    }


    // Metodo que exibe a autonomia do carro :
    public void displaysAutonomy () {


        // Mostra a autonomia do veiculo :
        System.out.println( "A autonomia do veículo " + name + " foi de " + autonomy );


    }


    // Métodos Getter e Setter :


    // Mostra o nome do carro
    public String getName () {


        return name;


    }


    // Mostra a cor do carro
    public String getColor () {


        return color;


    }


    // Mostra o ano de lançamento do carro
    public int getYearOfRelease () {


        return yearOfRelease;


    }


    // Mostra a autonomia do carro
    public int getAutonomy () {


        return autonomy;


    }


    // Permite colocar o nome no atributo :
    public void setName( String name ) {


        this.name = name;


    }


    // Permite colocar a cor no atributo :
    public void setColor( String color ) {


        this.color = color;


    }


    // Permite colocar o ano de lançamento no atributo :
    public void setYearOfRelease( int yearOfRelease ) {


        this.yearOfRelease = yearOfRelease;


    }


    // Permite colocar a autonomia no atributo :
    public void setAutonomy( int autonomy ) {


        this.autonomy = autonomy;


    }
}
