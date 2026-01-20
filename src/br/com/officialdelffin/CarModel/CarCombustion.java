package br.com.officialdelffin.CarModel;

// Importações :
import br.com.officialdelffin.CarMold.CarMold;


// Classe para carro a combustão :
public class CarCombustion extends CarMold {


    // Sobrecarga do metodo :
    @Override
    public void displaysAutonomy (){


        //  Exibe a autonomia do veiculo a combustão :
        System.out.println( "A autonomia do veículo " + getName() + " é de " + getAutonomy() + " Km/l." );


    }


}
