/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.DocApp.DAO;

import com.project.DocApp.Entities.Appointment;
import java.util.List;
/**
 *
 * @author Asif
 */
public interface AppointmentDAO {
    int AddAppointment(Appointment appointment);
    int deleteAppointment(int appointmentId);
    List<Appointment> getAllAppointment();
    Appointment getAppointmentByID(int appointmentId);
    int updateAppointment(int appointmentId, Appointment appointment);
}
    
    
    
    

