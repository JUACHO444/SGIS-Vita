/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

/**
 *
 * @author juach
 */
public interface ICitaControlller {
    public String listar(boolean ordenar, String orden);

    public String devolver(int id, String username);
}
