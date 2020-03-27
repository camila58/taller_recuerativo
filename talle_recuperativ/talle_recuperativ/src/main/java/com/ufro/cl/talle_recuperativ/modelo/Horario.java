package com.ufro.cl.talle_recuperativ.modelo;

import java.util.Arrays;

public class Horario {

    private static Horario horario;
    private Asignatura[][] asignaturas;//dia-periodo

    public static Horario getInstance(){
        if (horario == null){
            horario = new Horario();
        }
        return horario;
    }

    public Horario() {
        asignaturas= new Asignatura[5][10];
    }

    public void agregarAsignatura(int dia, int periodo,Asignatura asigna){
        asignaturas[dia][periodo] = asigna;
    }

    public void eliminarAsignatura(int dia, int periodo){
        asignaturas[dia][periodo] = null;
    }

    public static Horario getHorario() {
        return horario;
    }

    public static void setHorario(Horario horario) {
        Horario.horario = horario;
    }

    public Asignatura[][] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura[][] asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "asignaturas=" + Arrays.toString(asignaturas) +
                '}';
    }
}
