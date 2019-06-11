/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author User
 */
public class PairTiempo {
    private Integer Inicio;
    private Integer Fin;

    public Integer getInicio() {
        return Inicio;
    }

    public void setInicio(Integer Inicio) {
        this.Inicio = Inicio;
    }

    public Integer getFin() {
        return Fin;
    }

    public void setFin(Integer Fin) {
        this.Fin = Fin;
    }

    public PairTiempo() {
        this.Inicio = null;
        this.Fin = null;
    }
    
    public PairTiempo(Integer Inicio, Integer Fin) {
        this.Inicio = Inicio;
        this.Fin = Fin;
    }
    
}
