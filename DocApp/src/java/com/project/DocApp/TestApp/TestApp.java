/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.DocApp.TestApp;

import com.project.DocApp.DAO.DoctorDAO;
import com.project.DocApp.Entities.Doctor;
import com.project.DocApp.DAOIMPL.DoctorDAOImpl;
import java.util.List;

/**
 *
 * @author MRuser
 */
public class TestApp {
    public static void main(String[] args){
        DoctorDAO doctorDAO = new DoctorDAOImpl();
        int count = doctorDAO.AddDoctor(new Doctor("Rahul","Bhayander","7715088893","rahul@niit.com","MBBS","HeartSpecialist","10am","Rahul123"));
        if(count>0)System.out.println("Record Added Successfully");
        else System.out.println("Record Failed to get added");
//        count=doctorDAO.deleteDoctor(1);
//        if(count>0)System.out.println("Record Deleted Successfully");
//        else System.out.println("Record Failed to get deleted");
//        Doctor doctor = new Doctor(2,"sonam","sonam@gmail.com");
//        count=doctorDAO.updateDoctor(2, doctor);
//        if(count>0)System.out.println("Record Updated Successfully");
//        else System.out.println("Record Failed to get updated");
        List<Doctor> doctorList = doctorDAO.getAllDoctor();
        for(Doctor doctor : doctorList){
            System.out.println(doctor.getDoctorId() + "|" + doctor.getDoctorName() + "|" + doctor.getDoctorAddress() +"|" + doctor.getDoctorContact() +"|" + doctor.getDoctorEmail() +"|" + doctor.getDoctorQualification() + "|" + doctor.getDoctorSpecialist() + "|" + doctor.getDoctorWorktime() + "|" + doctor.getDoctorPassword() );
        }
        Doctor doctor = doctorDAO.getDoctorByID(3001);
            System.out.println(doctor.getDoctorId() + "|" + doctor.getDoctorName() + "|" + doctor.getDoctorEmail());
    }
}
