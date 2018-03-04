/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.DocApp.DAOIMPL;
import com.project.DocApp.DAO.PatientDAO;
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
public class PatientDAOImpl implements PatientDAO {

    @Override
    public int AddPatient(Patient patient) {
         int count=0;
        try{
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into patientdetails(patientname,patientsex,patientaddress,patientcontact,patientemail,patientbloodtype,patientdob,patientpassword) values(?,?,?,?,?,?,?,?)" );
            preparedStatement.setString(1,patient.getPatientName());
            preparedStatement.setString(2,patient.getPatientSex());
            preparedStatement.setString(3,patient.getPatientAddress());
            preparedStatement.setString(4,patient.getPatientContact());
            preparedStatement.setString(5,patient.getPatientEmail());
            preparedStatement.setString(6,patient.getPatientBloodType());
            preparedStatement.setString(7,patient.getPatientDOB());
            preparedStatement.setString(8,patient.getPatientPassword());
            count = preparedStatement.executeUpdate();
        }
        catch(SQLException ex) {
            Logger.getLogger(PatientDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
}

    

    @Override
    public int deletePatient(int patientId) {
       int count=0;
        try {
            
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("delete from patientdetails where patientid=?");
            preparedStatement.setInt(1,patientId);
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
}

    @Override
    public List<Patient> getAllPatient() {
        List<Patient> patientList = null;
        try {
            Connection connection = DatabaseConnection.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from patientdetails");
            ResultSet resultSet = preparedStatement.executeQuery();
            patientList = new ArrayList<Patient>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int patientId = resultSet.getInt(1);
                    String patientName = resultSet.getString(2);
                    String patientSex = resultSet.getString(3);
                    String patientAddress = resultSet.getString(4);
                    String patientContact = resultSet.getString(5);
                    String patientEmail = resultSet.getString(6);
                    String patientBloodType = resultSet.getString(7);
                    String patientDOB = resultSet.getString(8);
                    String patientPassword = resultSet.getString(9);
                    Patient patient = new Patient(patientId,patientName,patientSex,patientAddress,patientContact,patientEmail,patientBloodType,patientDOB,patientPassword);
                    patientList.add(patient);
                }
            }
            
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(PatientDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     return patientList;
}

    @Override
    public Patient getPatientByID(int patientId) {
        List<Patient> patientList = null;
        try {
            Connection connection = DatabaseConnection.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from patientdetails where patientid=?");
            preparedStatement.setInt(1, patientId);
            ResultSet resultSet = preparedStatement.executeQuery();
            patientList = new ArrayList<Patient>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    String patientName = resultSet.getString(2);
                    String patientSex = resultSet.getString(3);
                    String patientAddress = resultSet.getString(4);
                    String patientContact = resultSet.getString(5);
                    String patientEmail = resultSet.getString(6);
                    String patientBloodType = resultSet.getString(7);
                    String patientDOB = resultSet.getString(8);
                    String patientPassword = resultSet.getString(9);
                    Patient patient = new Patient(patientId,patientName,patientSex,patientAddress,patientContact,patientEmail,patientBloodType,patientDOB,patientPassword);
                    patientList.add(patient);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     if(patientList.size()>0) return patientList.get(0);
     else return null;
     
    }

    @Override
    public int updatePatient(int patientId, Patient patient) {
         int count=0;
        try {
            Connection connection  = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update patientdetails set patientname=?, patientsex=?, patientaddress=?, patientcontact=?, patientemail=?, patientbloodtype=?, patientdob=?, patientpassword=? where patientid=?");
            preparedStatement.setString(1,patient.getPatientName());
            preparedStatement.setString(2,patient.getPatientSex());
            preparedStatement.setString(3,patient.getPatientAddress());
            preparedStatement.setString(4,patient.getPatientContact());
            preparedStatement.setString(5,patient.getPatientEmail());
            preparedStatement.setString(6,patient.getPatientBloodType());
            preparedStatement.setString(7,patient.getPatientDOB());
            preparedStatement.setString(8,patient.getPatientPassword());
            preparedStatement.setInt(9,patientId);
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
      
    }
    

