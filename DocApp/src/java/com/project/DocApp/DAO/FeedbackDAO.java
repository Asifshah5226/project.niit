/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.DocApp.DAO;
import com.project.DocApp.Entities.Feedback;
import java.util.List;


public interface FeedbackDAO {
    int AddFeedback(Feedback feedback);
    int deleteFeedback(int feedbackId);
    List<Feedback> getAllFeedback();
    Feedback getFeedbackByID(int feedbackId);
    int updateFeedback(int feedbackId, Feedback feedback);
}
