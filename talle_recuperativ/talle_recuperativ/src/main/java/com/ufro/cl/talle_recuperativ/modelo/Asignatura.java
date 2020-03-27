package com.ufro.cl.talle_recuperativ.modelo;

import com.ufro.cl.talle_recuperativ.modelo.enumerations.Dia;

public class Asignatura {
    private String nombre;
    private String sala;
    private Dia dia;
    private int periodo;

    public Asignatura() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "asignatura{" +
                "nombre='" + nombre + '\'' +
                ", sala='" + sala + '\'' +
                ", dia=" + dia.toString() +
                ", periodo=" + periodo +
                '}';
    }
}
