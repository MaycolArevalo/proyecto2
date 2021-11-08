/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos;

import java.io.Serializable;

/**
 *
 * @author Maycol
 */
public class datosAlumnos implements Serializable {
    
    private String nombre;
    private String apellido;
    private String carne;
    private int edad;
    private char sexo;
    private String carrera;
    private int totalCreditos;
    private int cantidadCursosAprobados;
    private int cursosAprobados;
    private int semestre;
    
    private String nombreCurso1;
    
    private int codigoCurso1;
    
    private float  zonaCurso1;
    
    private float examenFinalCurso1;
    
    private String fechaCurso1;
    
    private int cursosReprobados;
    
    
    private String nombreRep1;
       
    private int codigoRep1;
    
    private float zonaRep1;

    public datosAlumnos() {
    }

    public datosAlumnos(String nombre, String apellido, String carne, int edad, char sexo, String carrera, int totalCreditos, int cantidadCursosAprobados, int cursosAprobados, int semestre, String nombreCurso1, int codigoCurso1, float zonaCurso1, float examenFinalCurso1, String fechaCurso1, int cursosReprobados, String nombreRep1, int codigoRep1, float zonaRep1) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carne = carne;
        this.edad = edad;
        this.sexo = sexo;
        this.carrera = carrera;
        this.totalCreditos = totalCreditos;
        this.cantidadCursosAprobados = cantidadCursosAprobados;
        this.cursosAprobados = cursosAprobados;
        this.semestre = semestre;
        this.nombreCurso1 = nombreCurso1;
        this.codigoCurso1 = codigoCurso1;
                
        this.zonaCurso1 = zonaCurso1;
        this.examenFinalCurso1 = examenFinalCurso1;
        this.fechaCurso1 = fechaCurso1;
        this.cursosReprobados = cursosReprobados;
        this.nombreRep1 = nombreRep1;
        this.codigoRep1 = codigoRep1;
        this.zonaRep1 = zonaRep1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getTotalCreditos() {
        return totalCreditos;
    }

    public void setTotalCreditos(int totalCreditos) {
        this.totalCreditos = totalCreditos;
    }

    public int getCantidadCursosAprobados() {
        return cantidadCursosAprobados;
    }

    public void setCantidadCursosAprobados(int cantidadCursosAprobados) {
        this.cantidadCursosAprobados = cantidadCursosAprobados;
    }

    public int getCursosAprobados() {
        return cursosAprobados;
    }

    public void setCursosAprobados(int cursosAprobados) {
        this.cursosAprobados = cursosAprobados;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getNombreCurso1() {
        return nombreCurso1;
    }

    public void setNombreCurso1(String nombreCurso1) {
        this.nombreCurso1 = nombreCurso1;
    }

    public int getCodigoCurso1() {
        return codigoCurso1;
    }

    public void setCodigoCurso1(int codigoCurso1) {
        this.codigoCurso1 = codigoCurso1;
    }

    public float getZonaCurso1() {
        return zonaCurso1;
    }

    public void setZonaCurso1(float zonaCurso1) {
        this.zonaCurso1 = zonaCurso1;
    }

    public float getExamenFinalCurso1() {
        return examenFinalCurso1;
    }

    public void setExamenFinalCurso1(float examenFinalCurso1) {
        this.examenFinalCurso1 = examenFinalCurso1;
    }

    public String getFechaCurso1() {
        return fechaCurso1;
    }

    public void setFechaCurso1(String fechaCurso1) {
        this.fechaCurso1 = fechaCurso1;
    }

    public int getCursosReprobados() {
        return cursosReprobados;
    }

    public void setCursosReprobados(int cursosReprobados) {
        this.cursosReprobados = cursosReprobados;
    }

    public String getNombreRep1() {
        return nombreRep1;
    }

    public void setNombreRep1(String nombreRep1) {
        this.nombreRep1 = nombreRep1;
    }

    public int getCodigoRep1() {
        return codigoRep1;
    }

    public void setCodigoRep1(int codigoRep1) {
        this.codigoRep1 = codigoRep1;
    }

    public float getZonaRep1() {
        return zonaRep1;
    }

    public void setZonaRep1(float zonaRep1) {
        this.zonaRep1 = zonaRep1;
    }

   
    
    
    
    
    
      
}
    
            

  