/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.DocApp.DAO;

import com.project.DocApp.Entities.Patient;
import java.util.List;
/**
 *
 * @author Asif
 */
public interface PatientDAO {
    int AddPatient(Patient patient);
    int deletePatient(int patientId);
    List<Patient> getAllPatient();
    Patient getPatientByID(int patientId);
    int updatePatient(int patientId, Patient patient);
    
}
