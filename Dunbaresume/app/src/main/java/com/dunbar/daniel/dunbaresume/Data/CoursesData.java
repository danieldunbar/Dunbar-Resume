package com.dunbar.daniel.dunbaresume.Data;

import java.util.ArrayList;

/**
 * Created by Daniel on 12/21/2017.
 */

public class CoursesData {
    public static final ArrayList<CourseItem> DATA = new ArrayList<CourseItem>();

    static {
        createData();
    }

    private static void createData(){
        ArrayList<String> tech = new ArrayList<String>();

        tech.add("N/A");
        DATA.add(new CourseItem("Algorithms", null, tech));

        tech.clear();
        tech.add("Android");
        tech.add("SQL");
        tech.add("AWS");
        DATA.add(new CourseItem("Software Engineering", null, tech));

        tech.clear();
        tech.add("Java");
        DATA.add(new CourseItem("Object-Oriented Programming", null, tech));

        tech.clear();
        tech.add("Java");
        DATA.add(new CourseItem("Analysis of Discrete Structures", null, tech));

        tech.clear();
        tech.add("Java");
        tech.add("C");
        DATA.add(new CourseItem("Parallel and Distributed Programming", null, tech));

        tech.clear();
        tech.add("SQL");
        DATA.add(new CourseItem("Databases", null, tech));

        tech.clear();
        tech.add("C--");
        DATA.add(new CourseItem("Compilers", null, tech));

        tech.clear();
        tech.add("N/A");
        DATA.add(new CourseItem("Automata, Grammars, and Languages", null, tech));
    }

    public static class CourseItem{
        private String courseName;
        private String description;
        private ArrayList<String> technology;

        public CourseItem(String s, String desc, ArrayList<String> tech){
            courseName = s;
            description = desc;
            technology = tech;
        }

        public String getCourseName(){
            return courseName;
        }

        public String getDescription(){
            return description;
        }

        public ArrayList<String> getTechnology(){
            return technology;
        }
    }
}
