package nek.ug.app;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Leccion Ken Luzuriaga");
        Matricula matri = new Matricula();
        Character[] provincias = {'A','B','C','U', 'H','X','O','E','W','G','I','L',
                'R','M','V','N','Q','S','P','Y','J','K','T','Z'};
        String[] tipos = {"CC","CD","OI","AT","IT"};

        String placa = new Scanner(System.in).nextLine().toUpperCase();
        String[] placaSeparada2 = placa.split("-");

        System.out.println();
        //imprime lo que escribiste en array
        Arrays.stream(placaSeparada2).forEach(p->{
            System.out.print(p+"  ");}
        );
        System.out.println();
        System.out.println("hay '-' "+matri.validarLen(placaSeparada2));
        System.out.println("es tipo "+matri.validarTipoEspecial(tipos,placaSeparada2[0]));
        System.out.println("letras==3 "+matri.validarLengString(placaSeparada2[0]));
        System.out.println("es prov "+matri.validarProvincia(provincias,placaSeparada2));
        System.out.println("es numero "+matri.validarNumeros(placaSeparada2));

        boolean end = matri.validarLen(placaSeparada2) && (matri.validarTipoEspecial(tipos, placaSeparada2[0])
                ||  matri.validarLengString(placaSeparada2[0]))
                && matri.validarProvincia(provincias,placaSeparada2)
                &&  matri.validarNumeros(placaSeparada2);

            System.out.println("Placa -> "+ end);

    }

}
