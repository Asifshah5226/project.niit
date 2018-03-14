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
public class Doctor {

    public Doctor(int doctorId, String doctorName, String doctorAddress, String doctorContact, String doctorEmail, String doctorQualification, String doctorSpecialist, String doctorWorktime, String doctorPassword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public Doctor(String doctorName, String doctorAddress, String doctorContact, String doctorEmail, String doctorQualification, String doctorSpecialist, String doctorWorktime, String doctorPassword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorAddress() {
        return doctorAddress;
    }

    public void setDoctorAddress(String doctorAddress) {
        this.doctorAddress = doctorAddress;
    }

    public String getDoctorContact() {
        return doctorContact;
    }

    public void setDoctorContact(String doctorContact) {
        this.doctorContact = doctorContact;
    }

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public void setDoctorEmail(String doctorEmail) {
        this.doctorEmail = doctorEmail;
    }

    public String getDoctorQualification() {
        return doctorQualification;
    }

    public void setDoctorQualification(String doctorQualification) {
        this.doctorQualification = doctorQualification;
    }

    public String getDoctorSpecialist() {
        return doctorSpecialist;
    }

    public void setDoctorSpecialist(String doctorSpecialist) {
        this.doctorSpecialist = doctorSpecialist;
    }

    public String getDoctorWorktime() {
        return doctorWorktime;
    }

    public void setDoctorWorktime(String doctorWorktime) {
        this.doctorWorktime = doctorWorktime;
    }
 public String getDoctorPassword() {
        return doctorPassword;
    }

    public void setDoctorPassword(String doctorPassword) {
        this.doctorPassword = doctorPassword;
    }
    int doctorId;
    String doctorName;
    String doctorAddress;
    String doctorContact;
    String doctorEmail;
    String doctorQualification;
    String doctorSpecialist;
    String doctorWorktime;
    String doctorPassword;
    
    
    
    
    
}
