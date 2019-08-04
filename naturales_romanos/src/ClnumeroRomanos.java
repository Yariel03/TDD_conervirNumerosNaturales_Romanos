/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex-
 */
class ClnumeroRomanos {

    String convertirAromanos(int numeroNatural) {

        switch (numeroNatural) {
            case 4:
                return "IV";
            case 5:
                return "V";
            case 9:
                return "IX";
            case 10:
                return "X";
        }
        if (numeroNatural < 4) {
            return aumentarI(numeroNatural);
        }
        if (numeroNatural < 9) {
            return aumentarV(numeroNatural);
        }
        return null;
    }
    private String aumentarI(int numeroNatural){
        String resultado="";
        for (int i = 1; i <= numeroNatural; i++) {
            resultado+="I";
        }
        return resultado;
    }

    private String aumentarV(int numeroNatural){
        String resultado="V";
        for (int i = 6; i <= numeroNatural; i++) {
            resultado+="I";
        }
        return resultado;
    }

}
