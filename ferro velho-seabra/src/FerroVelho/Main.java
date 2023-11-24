package FerroVelho;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import FerroVelho.Classes.EnumAutomovel;
import FerroVelho.Classes.EnumQualidade;
import FerroVelho.Classes.EnumTipo;

public class Main {

    //Teste dos Enums
	public static void main(String[] args) {
        //listar valores das enums
        for(EnumAutomovel a : EnumAutomovel.values())
            System.out.printf("%s%n", a);

        for(EnumTipo b : EnumTipo.values())
            System.out.printf("%s%n", b);

        for(EnumQualidade c : EnumQualidade.values())
            System.out.printf("%s%n", c);
    }

}