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
            return aumentarI(numeroNatural, 1, "");
        }
        if (numeroNatural < 9) {
            return aumentarI(numeroNatural, 6, "V");
        }
        return null;
    }

    private String aumentarI(int numeroNatural, int inicio, String letra) {
        for (int i = inicio; i <= numeroNatural; i++) {
            letra += "I";
        }
        return letra;
    }
}
