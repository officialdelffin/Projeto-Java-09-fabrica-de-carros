package br.com.officialdelffin.CarModel;

// Importações :
import br.com.officialdelffin.CarMold.CarMold;


// Classe para carro elétrico :
public class ElectricCar extends CarMold {


    // Metodos :

    // Sobrecarga do metodo :
    @Override
    public void displaysAutonomy () {


        //  Exibe a autonomia do veiculo elétrico :
        System.out.println( "A autonomia do veículo " + getName() + " é de " + getAutonomy() + " kWh." );


    }


}
