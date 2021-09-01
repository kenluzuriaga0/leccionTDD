package nek.ug.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Matricula {
    String numPlaca;

public boolean validarLen(String[] placaSeparada){
    return    placaSeparada.length>=2;

}
public boolean validarProvincia(Character[]provincias ,String[] placaSeparada){
    try{
        return    Arrays.asList(provincias).contains(placaSeparada[0].charAt(0));
    }catch(Exception exception){
        System.out.println("Error prov: "+exception.getMessage());
        return false;
    }

}
public boolean validarTipoEspecial(String[]tipos ,String placaSeparada) {
    try {
        return Arrays.asList(tipos).contains(String.valueOf(placaSeparada.charAt(0)) + placaSeparada.charAt(1));
    } catch (Exception exception) {
        System.out.println("Error tipo " + exception.getMessage());
        return false;
    }
}
public boolean validarLengString(String placaSeparada) {
    return placaSeparada.length()==3  ;

}
public boolean validarNumeros(String[] placaSeparada) {
    try {
    int parteNumero = Integer.parseInt(placaSeparada[1]);
    return parteNumero<=9999;
    } catch (Exception exception) {
    //no es numero
        return false;
    }
}

}
