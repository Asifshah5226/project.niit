/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.DocApp.DAOIMPL;
import com.project.DocApp.DAO.DoctorDAO;
import com.project.DocApp.Entities.Doctor;

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
public class DoctorDAOImpl implements DoctorDAO {

    @Override
    public int AddDoctor(Doctor doctor) {
         int count=0;
        try{
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into doctordetails(doctorname,doctoraddress,doctorcontact,doctoremail,doctorqualification,doctorspecialist,doctorworktime,doctorpassword) values(?,?,?,?,?,?,?,?)" );
            preparedStatement.setString(1,doctor.getDoctorName());
            preparedStatement.setString(2,doctor.getDoctorAddress());
            preparedStatement.setString(3,doctor.getDoctorContact());
            preparedStatement.setString(4,doctor.getDoctorEmail());
            preparedStatement.setString(5,doctor.getDoctorQualification());
            preparedStatement.setString(6,doctor.getDoctorSpecialist());
            preparedStatement.setString(7,doctor.getDoctorWorktime());
            preparedStatement.setString(8,doctor.getDoctorPassword());
            count = preparedStatement.executeUpdate();
        }
        catch(SQLException ex) {
            Logger.getLogger(DoctorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
}

    

    @Override
    public int deleteDoctor(int doctorId) {
       int count=0;
        try {
            
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("delete from doctordetails where doctorid=?");
            preparedStatement.setInt(1,doctorId);
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DoctorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
}

    @Override
    public List<Doctor> getAllDoctor() {
        List<Doctor> doctorList = null;
        try {
            Connection connection = DatabaseConnection.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from doctordetails");
            ResultSet resultSet = preparedStatement.executeQuery();
            doctorList = new ArrayList<Doctor>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int doctorId = resultSet.getInt(1);
                    String doctorName = resultSet.getString(2);
                    String doctorAddress = resultSet.getString(3);
                    String doctorContact = resultSet.getString(4);
                    String doctorEmail = resultSet.getString(5);
                    String doctorQualification = resultSet.getString(6);
                    String doctorSpecialist = resultSet.getString(7);
                    String doctorWorktime = resultSet.getString(8);
                    String doctorPassword = resultSet.getString(9);
                    Doctor doctor = new Doctor(doctorId,doctorName,doctorAddress,doctorContact,doctorEmail,doctorQualification,doctorSpecialist,doctorWorktime,doctorPassword);
                    doctorList.add(doctor);
                }
            }
            
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(DoctorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     return doctorList;
}

    @Override
    public Doctor getDoctorByID(int doctorId) {
        List<Doctor> doctorList = null;
        try {
            Connection connection = DatabaseConnection.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from doctordetails where doctorid=?");
            preparedStatement.setInt(1, doctorId);
            ResultSet resultSet = preparedStatement.executeQuery();
            doctorList = new ArrayList<Doctor>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    String doctorName = resultSet.getString(2);
                    String doctorAddress = resultSet.getString(3);
                    String doctorContact = resultSet.getString(4);
                    String doctorEmail = resultSet.getString(5);
                    String doctorQualification = resultSet.getString(6);
                    String doctorSpecialist = resultSet.getString(7);
                    String doctorWorktime = resultSet.getString(8);
                    String doctorPassword = resultSet.getString(9);
                    Doctor doctor = new Doctor(doctorId,doctorName,doctorAddress,doctorContact,doctorEmail,doctorQualification,doctorSpecialist,doctorWorktime,doctorPassword);
                    doctorList.add(doctor);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DoctorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     if(doctorList.size()>0) return doctorList.get(0);
     else return null;
     
    }

    @Override
    public int updateDoctor(int doctorId, Doctor doctor) {
         int count=0;
        try {
            Connection connection  = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update doctordetails set doctorname=?, doctoraddress=?, doctorcontact=?, doctoremail=?, doctorqualification=?, doctorspecialist=?, doctorworktime=?, doctorpassword=? where doctorid=?");
            preparedStatement.setString(1,doctor.getDoctorName());
            preparedStatement.setString(2,doctor.getDoctorAddress());
            preparedStatement.setString(3,doctor.getDoctorContact());
            preparedStatement.setString(4,doctor.getDoctorEmail());
            preparedStatement.setString(5,doctor.getDoctorQualification());
            preparedStatement.setString(6,doctor.getDoctorSpecialist());
            preparedStatement.setString(7,doctor.getDoctorWorktime());
            preparedStatement.setString(8,doctor.getDoctorPassword());
            preparedStatement.setInt(9,doctorId);
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DoctorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
      
    }
    

