/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.DocApp.DAO;

import com.project.DocApp.Entities.Disease;
import java.util.List;
/**
 *
 * @author Asif
 */
public interface DiseaseDAO {
    int AddDisease(Disease disease);
    int deleteDisease(int diseaseId);
    List<Disease> getAllDisease();
    Disease getDiseaseByID(int diseaseId);
    int updateDisease(int diseaseId, Disease disease);
}
