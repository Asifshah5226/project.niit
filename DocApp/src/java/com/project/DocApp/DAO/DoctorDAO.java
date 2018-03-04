/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.DocApp.DAO;

import com.project.DocApp.Entities.Doctor;
import java.util.List;
/**
 *
 * @author Asif
 */
public interface DoctorDAO {
    int AddDoctor(Doctor doctor);
    int deleteDoctor(int doctorId);
    List<Doctor> getAllDoctor();
    Doctor getDoctorByID(int doctorId);
    int updateDoctor(int doctorId, Doctor doctor);
    
}
