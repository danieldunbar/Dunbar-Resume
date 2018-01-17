package com.dunbar.daniel.dunbaresume.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 12/20/2017.
 */

public class EducationData {
    public static final ArrayList<EducationItem> DATA = new ArrayList<EducationItem>();

    static {
        createData();
    }


    private static void createData(){
        EducationItem ua = new EducationItem("University of Arizona", "Computer Science",
                "Mathematics", "Bachelor of Science", null, "December 15, 2017", 3.48);
        EducationItem pima = new EducationItem("Pima Community College", "Physics",
                "N/A", "Associate of Science", null, "May 15, 2015", 3.2);

        DATA.add(ua);
        DATA.add(pima);
    }

    public static class EducationItem{
        private final String university;
        private final String major;
        private final String minor;
        private final String degree;
        private final String details;
        private final String graduationDate;
        private final double gpa;

        public EducationItem(String uni, String maj, String min, String deg, String det, String gd, double g){
            university = uni;
            major = maj;
            minor = min;
            degree = deg;
            details = det;
            graduationDate = gd;
            gpa = g;
        }

        public String getUniversity(){
            return university;
        }

        public String getMajor(){
            return major;
        }

        public String getMinor(){
            return minor;
        }

        public String getDegree(){
            return degree;
        }

        public String getDetails(){
            return details;
        }

        public String getGraduationDate(){
            return graduationDate;
        }

        public double getGpa(){
            return gpa;
        }
    }
}
