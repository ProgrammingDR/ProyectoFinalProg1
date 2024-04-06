/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bdt;

/**
 *
 * @author Darwi
 */
public class Users {
    private String name;
    private String lastName;
    private String address;
    private String city;
    private String zipCode;
    private String phone;
    private String email;
    private String accountNumber;
    private String password;

    // Constructor
    public Users(String nombre, String apellido, String direccion, String ciudad,
                   String codigoPostal, String telefono, String correoElectronico,
                   String numeroCuenta, String contrasena) {
        this.name = nombre;
        this.lastName = apellido;
        this.address = direccion;
        this.city = ciudad;
        this.zipCode = codigoPostal;
        this.phone = telefono;
        this.email = correoElectronico;
        this.accountNumber = numeroCuenta;
        this.password = contrasena;
    }

    // Getters y Setters
    public String getNombre() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    public String getApellido() {
        return lastName;
    }

    public void setApellido(String apellido) {
        this.lastName = apellido;
    }

    public String getDireccion() {
        return address;
    }

    public void setDireccion(String direccion) {
        this.address = direccion;
    }

    public String getCiudad() {
        return city;
    }

    public void setCiudad(String ciudad) {
        this.city = ciudad;
    }

    public String getCodigoPostal() {
        return zipCode;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.zipCode = codigoPostal;
    }

    public String getTelefono() {
        return phone;
    }

    public void setTelefono(String telefono) {
        this.phone = telefono;
    }

    public String getCorreoElectronico() {
        return email;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.email = correoElectronico;
    }

    public String getNumeroCuenta() {
        return accountNumber;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.accountNumber = numeroCuenta;
    }

    public String getContrasena() {
        return password;
    }

    public void setContrasena(String contrasena) {
        this.password = contrasena;
    }
}
