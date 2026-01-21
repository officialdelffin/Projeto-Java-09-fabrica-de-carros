/* Projeto : Fabrica de carro

 Fábrica de Carros em Java para consolidar conceitos de herança, polimorfismo e sobrescrita de métodos. O sistema simula a produção de diferentes tipos de veículos a partir de uma classe base, utilizando polimorfismo
 para especializar comportamentos e sobrescrita para funcionalidades específicas de cada modelo. Foco em POO e reúso de código. */


import br.com.officialdelffin.CarModel.ElectricCar;

import java.util.Scanner;

// Classe de execução do sistema : :
public class Main {


    // Objetos :

    // Permite o input do usuário :
    static Scanner userInput = new Scanner( System.in );


    // Atributos :

    // Armazena escolha do usuário :
    static int userChoice = 0;


    // Métodos :

    // Executa o sistema principal :
    public static void main( String[] args ) {


        // Apresentações :
        System.out.println( "Olá seja bem vindo à nossa fábrica de carros! \n" );


        // Mostrando as opções disponíveis :
        System.out.print( """
                
                Digite o número do tipo de carro você deseja criar :
                
                1 - Carro elétrico
                2 - Carro à combustão
                
                """  );


        // Armazena a escolha do usuário :
        userChoice = userInput.nextInt();


        // Dando espaço para ficar organizado no terminal :
        System.out.println( " " );


        // Se a escolha do usuário for 1 :
        if ( userChoice == 1 ) {


            // Faz a instancia do objeto carroEletríco :
            ElectricCar electricCar = new ElectricCar();


            // Pede o nome do modelo do carro :
            System.out.println( "Primeiro, digite o modelo do carro :" );


            // Armazena a cor do carro :
            electricCar.setColor( userInput.nextLine() );


            // Dando espaço para ficar organizado no terminal :
            System.out.println( " " );


            // Pede o usuário para falar o ano que estamos :
            System.out.println( "Digite o ano em que estamos : \n" );


            // Armazena o ano que estamos que vai ser o ano de lançamento do carro :
            electricCar.setYearOfRelease( userInput.nextInt() );


            // Dando espaço para ficar organizado no terminal :
            System.out.println( " " );


            // Pede a autonomia do carro :
            System.out.println( "Por ultimo para criar o carro, digite a autonomia do carro : " );


            // Armazena a autonomia do carro :
            electricCar.setAutonomy( userInput.nextInt() );


            // Dando espaço para ficar organizado no terminal :
            System.out.println( " " );


            // Fecado que o carro foi criado :
            System.out.println( "O veículo " + electricCar.getName() + " foi criado com sucesso!" );






        }


        // Se a escolha do usuário for 2 :
        else if ( userChoice == 2 ) {




        }


        // Se não for nenhum dos dois :
        else {




        }


    }


}