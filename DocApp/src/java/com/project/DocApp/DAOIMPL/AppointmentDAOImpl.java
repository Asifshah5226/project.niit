/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.DocApp.DAOIMPL;
import com.project.DocApp.DAO.AppointmentDAO;
import com.project.DocApp.Entities.Appointment;
import com.project.DocApp.Entities.Doctor;
import com.project.DocApp.Entities.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Asif
 */
public class AppointmentDAOImpl implements AppointmentDAO {

    @Override
    public int AddAppointment(Appointment appointment) {
         int count=0;
        try{
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into appointmentdetails(patientid,doctorid,appointmenttype,appointmenttime) values(?,?,?,?)" );
            preparedStatement.setInt(1,appointment.getPatientId());
            preparedStatement.setInt(2,appointment.getDoctorId());
            preparedStatement.setString(3,appointment.getAppointmentType());
            preparedStatement.setString(4,appointment.getAppointmentTime());
            count = preparedStatement.executeUpdate();
        }
        catch(SQLException ex) {
            Logger.getLogger(AppointmentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
}

    

    @Override
    public int deleteAppointment(int appointmentId) {
       int count=0;
        try {
            
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("delete from appointmentdetails where appointmentid=?");
            preparedStatement.setInt(1,appointmentId);
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AppointmentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
}

    @Override
    public List<Appointment> getAllAppointment() {
        List<Appointment> appointmentList = null;
        try {
            Connection connection = DatabaseConnection.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from appointmentdetails");
            ResultSet resultSet = preparedStatement.executeQuery();
            appointmentList = new ArrayList<Appointment>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int appointmentId = resultSet.getInt(1);
                    int patientId = resultSet.getInt(2);
                    int doctorId = resultSet.getInt(3);
                    String appointmentType = resultSet.getString(4);
                    String appointmentTime = resultSet.getString(5);
                    Appointment appointment = new Appointment(appointmentId,patientId,doctorId,appointmentType,appointmentTime);
                    appointmentList.add(appointment);
                }
            }
            
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(AppointmentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     return appointmentList;
}

    @Override
    public Appointment getAppointmentByID(int appointmentId) {
        List<Appointment> appointmentList = null;
        try {
            Connection connection = DatabaseConnection.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from appointmentdetails where appointmentid=?");
            preparedStatement.setInt(1, appointmentId);
            ResultSet resultSet = preparedStatement.executeQuery();
            appointmentList = new ArrayList<Appointment>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int appointmentid = resultSet.getInt(1);
                    int patientId = resultSet.getInt(2);
                    int doctorId = resultSet.getInt(3);
                    String appointmentType = resultSet.getString(4);
                    String appointmentTime = resultSet.getString(5);
                    Appointment appointment = new Appointment(appointmentid,patientId,doctorId,appointmentType,appointmentTime);
                    appointmentList.add(appointment);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AppointmentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     if(appointmentList.size()>0) return appointmentList.get(0);
     else return null;
     
    }

    @Override
    public int updateAppointment(int appointmentId, Appointment appointment) {
         int count=0;
        try {
            Connection connection  = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update appointmentdetails set patientid=?, doctorid=?, appointmentype=?, appointmenttime=? where appointmentid=?");
            preparedStatement.setInt(1,appointment.getPatientId());
            preparedStatement.setInt(2,appointment.getDoctorId());
            preparedStatement.setString(3,appointment.getAppointmentType());
            preparedStatement.setString(4,appointment.getAppointmentTime());
            preparedStatement.setInt(5,appointmentId);
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AppointmentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
      
    }
   