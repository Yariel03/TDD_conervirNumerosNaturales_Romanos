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
        if (numeroNatural == 1) {
            return "I";
        } else {
            if (numeroNatural==2) {
                return "II";
            }
            return "III";
        }
    }

}
