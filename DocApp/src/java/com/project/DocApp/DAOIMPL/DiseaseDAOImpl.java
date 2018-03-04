/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.DocApp.DAOIMPL;
import com.project.DocApp.DAO.DiseaseDAO;
import com.project.DocApp.Entities.Disease;
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
public class DiseaseDAOImpl implements DiseaseDAO {

    @Override
    public int AddDisease(Disease disease) {
         int count=0;
        try{
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into diseasedetails(doctorid,diseasename,diseasedetail,diseasesymptoms,diseaseremidies) values(?,?,?,?,?)" );
            preparedStatement.setInt(1,disease.getDoctorId());
            preparedStatement.setString(2,disease.getDiseaseName());
            preparedStatement.setString(3,disease.getDiseaseDetail());
            preparedStatement.setString(4,disease.getDiseaseSymptoms());
            preparedStatement.setString(5,disease.getDiseaseRemidies());
            count = preparedStatement.executeUpdate();
        }
        catch(SQLException ex) {
            Logger.getLogger(DiseaseDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
}

    

    @Override
    public int deleteDisease(int diseaseId) {
       int count=0;
        try {
            
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("delete from diseasedetails where diseaseid=?");
            preparedStatement.setInt(1,diseaseId);
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DiseaseDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
}

    @Override
    public List<Disease> getAllDisease() {
        List<Disease> diseaseList = null;
        try {
            Connection connection = DatabaseConnection.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from diseasedetails");
            ResultSet resultSet = preparedStatement.executeQuery();
            diseaseList = new ArrayList<Disease>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int diseaseId = resultSet.getInt(1);
                    int doctorId = resultSet.getInt(2);
                    String diseaseName = resultSet.getString(3);
                    String diseaseDetail = resultSet.getString(4);
                    String diseaseSymptoms = resultSet.getString(5);
                    String diseaseRemidies = resultSet.getString(6);
                    Disease disease = new Disease(diseaseId,doctorId,diseaseName,diseaseDetail,diseaseSymptoms,diseaseRemidies);
                    diseaseList.add(disease);
                }
            }
            
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(DiseaseDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     return diseaseList;
}

    @Override
    public Disease getDiseaseByID(int diseaseId) {
        List<Disease> diseaseList = null;
        try {
            Connection connection = DatabaseConnection.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from diseasedetails where diseaseid=?");
            preparedStatement.setInt(1, diseaseId);
            ResultSet resultSet = preparedStatement.executeQuery();
            diseaseList = new ArrayList<Disease>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int doctorId = resultSet.getInt(2);
                    String diseaseName = resultSet.getString(3);
                    String diseaseDetail = resultSet.getString(4);
                    String diseaseSymptoms = resultSet.getString(5);
                    String diseaseRemidies = resultSet.getString(6);
                    Disease disease = new Disease(diseaseId,doctorId,diseaseName,diseaseDetail,diseaseSymptoms,diseaseRemidies);
                    diseaseList.add(disease);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DiseaseDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     if(diseaseList.size()>0) return diseaseList.get(0);
     else return null;
     
    }

    @Override
    public int updateDisease(int diseaseId, Disease disease) {
         int count=0;
        try {
            Connection connection  = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update diseasedetails set doctorid=?, diseasename=?, diseasedetail=?, diseasesymptoms=?, diseaseremidies=? where diseaseid=?");
            preparedStatement.setInt(1,disease.getDoctorId());
            preparedStatement.setString(2,disease.getDiseaseName());
            preparedStatement.setString(3,disease.getDiseaseDetail());
            preparedStatement.setString(4,disease.getDiseaseSymptoms());
            preparedStatement.setString(5,disease.getDiseaseRemidies());
            preparedStatement.setInt(6,diseaseId);
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DiseaseDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
      
    }
    

