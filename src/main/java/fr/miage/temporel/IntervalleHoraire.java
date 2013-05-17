/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.temporel;

import java.util.Date;

/**
 *
 * @author E063762G
 */
public class IntervalleHoraire {

    private Date dateDebut;
    private Date dateFin;
    private double duree;

    public IntervalleHoraire(Date dateDebut, Date dateFin, double duree) {
        super();
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.duree = duree;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public double getDuree() {
        return duree;
    }

    public void setDuree(double duree) {
        this.duree = duree;
    }
}