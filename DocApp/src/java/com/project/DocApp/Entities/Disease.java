/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.DocApp.Entities;

/**
 *
 * @author Asif
 */
public class Disease {

    public Disease(int diseaseId, int doctorId, String diseaseName, String diseaseDetail, String diseaseSymptoms, String diseaseRemidies) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(int diseaseId) {
        this.diseaseId = diseaseId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getDiseaseDetail() {
        return diseaseDetail;
    }

    public void setDiseaseDetail(String diseaseDetail) {
        this.diseaseDetail = diseaseDetail;
    }

    public String getDiseaseSymptoms() {
        return diseaseSymptoms;
    }

    public void setDiseaseSymptoms(String diseaseSymptoms) {
        this.diseaseSymptoms = diseaseSymptoms;
    }

    public String getDiseaseRemidies() {
        return diseaseRemidies;
    }

    public void setDiseaseRemidies(String diseaseRemidies) {
        this.diseaseRemidies = diseaseRemidies;
    }
    
    int diseaseId;
    int doctorId;
    String diseaseName;
    String diseaseDetail;
    String diseaseSymptoms;
    String diseaseRemidies; 
}
