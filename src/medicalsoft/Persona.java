/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsoft;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author estudiante
 */
public class Persona {
    
    public Persona(String nom, String ape) {
        this.nombres = nom;
        this.apellidos = ape;
    }
    public Persona(){
    
    }
    
    private String nombres;
    private String apellidos;
    private String fecha_nacimiento;
    private String identificacion;
    private String genero;
    private String direccion;
    private String telefono;
    private String celular;      
    
    public String getNombres() {
        return nombres.toUpperCase();
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public int getEdad(){
    
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate fechaNac = LocalDate.parse(this.fecha_nacimiento, fmt);
    LocalDate ahora = LocalDate.now();
    
    Period periodo = Period.between(fechaNac, ahora);   
    
    return periodo.getYears();
    }
    
    public boolean getValidarEmail(){
        
        
    return true;
    }
    
    public String getFullName(){
    
    return this.nombres+" "+this.apellidos;
    }
    
    
    
    
}
