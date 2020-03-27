package com.ufro.cl.talle_recuperativ.modelo.enumerations;

public enum Dia {
    LUNES("lunes"),MARTES("martes"),MIERCOLES("miercoles"),
    JUEVES("jueves"),VIERNES("viernes"),SABADO("sabado"),
    DOMINGO("domingo");
    private final String diaFinal;
    Dia(String diaFinal) {
        this.diaFinal=diaFinal;
    }

    public String getDiaFinal() {
        return diaFinal;
    }

}
