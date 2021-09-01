package nek.ug.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatriculaTest {
    Character[] provincias = {'A','B','C','U', 'H','X','O','E','W','G','I','L',
            'R','M','V','N','Q','S','P','Y','J','K','T','Z'};
    String[] tipos = {"CC","CD","OI","AT","IT"};
    @Test
    public void deberiaValidarLength(){
    Matricula m = new Matricula("CIC-0525");
        Assertions.assertTrue(m.validarLen(m.getNumPlaca().split("-")));
    }
    @Test
    public void deberiaValidarTipoOrLenParteString(){
    Matricula m = new Matricula("CIC-0525");
        Assertions.assertTrue(m.validarTipoEspecial(tipos, m.getNumPlaca().split("-")[0])
        || m.validarLengString(m.getNumPlaca().split("-")[0]));
    }
    @Test
    public void deberiaValidarProvincia(){
    Matricula m = new Matricula("CIC-0525");
        Assertions.assertTrue(m.validarProvincia(provincias,m.getNumPlaca().split("-")));
    }
    @Test
    public void deberiaValidarEsNumero(){
    Matricula m = new Matricula("CIC-0525");
        Assertions.assertTrue(m.validarNumeros(m.getNumPlaca().split("-")));
    }
}