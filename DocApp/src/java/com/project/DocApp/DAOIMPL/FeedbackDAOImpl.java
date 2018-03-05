/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.DocApp.DAOIMPL;
import com.project.DocApp.DAO.FeedbackDAO;
import com.project.DocApp.Entities.Feedback;
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
public class FeedbackDAOImpl implements FeedbackDAO {

    @Override
    public int AddFeedback(Feedback feedback) {
         int count=0;
        try{
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into feedbackdetails(patientid,feedbacktext) values(?,?)" );
            preparedStatement.setInt(1,feedback.getPatientId());
            preparedStatement.setString(2,feedback.getFeedbackText());
            count = preparedStatement.executeUpdate();
        }
        catch(SQLException ex) {
            Logger.getLogger(FeedbackDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
}

    

    @Override
    public int deleteFeedback(int feedbackId) {
       int count=0;
        try {
            
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("delete from feedbackdetails where feedbackid=?");
            preparedStatement.setInt(1,feedbackId);
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FeedbackDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
}

    @Override
    public List<Feedback> getAllFeedback() {
        List<Feedback> feedbackList = null;
        try {
            Connection connection = DatabaseConnection.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from feedbackdetails");
            ResultSet resultSet = preparedStatement.executeQuery();
            feedbackList = new ArrayList<Feedback>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int feedbackId = resultSet.getInt(1);
                    int patientId = resultSet.getInt(2);
                    String feedbackText = resultSet.getString(3);
                    Feedback feedback = new Feedback(feedbackId,patientId,feedbackText);
                    feedbackList.add(feedback);
                }
            }
            
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(FeedbackDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     return feedbackList;
}

    @Override
    public Feedback getFeedbackByID(int feedbackId) {
        List<Feedback> feedbackList = null;
        try {
            Connection connection = DatabaseConnection.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from feedbackdetails where feedbackid=?");
            preparedStatement.setInt(1, feedbackId);
            ResultSet resultSet = preparedStatement.executeQuery();
            feedbackList = new ArrayList<Feedback>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int feedbackid = resultSet.getInt(1);
                    int patientId = resultSet.getInt(2);
                    String feedbackText = resultSet.getString(3);
                    Feedback feedback = new Feedback(feedbackid,patientId,feedbackText);
                    feedbackList.add(feedback);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FeedbackDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     if(feedbackList.size()>0) return feedbackList.get(0);
     else return null;
     
    }

    @Override
    public int updateFeedback(int feedbackId, Feedback feedback) {
         int count=0;
        try {
            Connection connection  = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update feedbackdetails set patientid=?, feedbacktext=? where feedbackid=?");
            preparedStatement.setInt(1,feedback.getPatientId());
            preparedStatement.setString(3,feedback.getFeedbackText());
            preparedStatement.setInt(5,feedbackId);
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FeedbackDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
      
    }
    

