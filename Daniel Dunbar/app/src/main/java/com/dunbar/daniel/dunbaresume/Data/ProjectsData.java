package com.dunbar.daniel.dunbaresume.Data;

import java.util.ArrayList;

/**
 * Created by Daniel on 12/21/2017.
 */

public class ProjectsData {
    public static final ArrayList<ProjectItem> DATA = new ArrayList<ProjectItem>();

    static {
        createData();
    }

    private static void createData(){
        ArrayList<String> tech = new ArrayList<String>();

        tech.add("C#");
        tech.add("ASP.NET");
        tech.add("SQL");
        DATA.add(new ProjectItem("Deletion Bug",
                "Work",
                "Fixed a bug in an application which was deleting data that shouldn’t be deleted by " +
                        "creating a backup system as well as requiring administrative privileges to " +
                        "confirm data deletions. ",
                tech));

        tech = new ArrayList<String>();
        tech.add("C#");
        tech.add("SQL");
        DATA.add(new ProjectItem("Automated Data Removal",
                "Work",
                "Built a program to run through multiple servers with 10,000+ tables each and " +
                        "identify specific tables with outdated/unnecessary information.",
                tech));

        tech = new ArrayList<String>();
        tech.add("C#");
        tech.add("SQL");
        DATA.add(new ProjectItem("Automated Data Transfer",
                "Work",
                "Designed a program to automatically run every week which identifies and transfers " +
                        "historical data from the week between two servers with 10,000+ tables each. ",
                tech));

        tech = new ArrayList<String>();
        tech.add("Android");
        tech.add("Java");
        tech.add("AWS");
        tech.add("SQL");
        DATA.add(new ProjectItem("StudyTogether App",
                "Selfmade",
                "Developed an app which allows users to create groups and then finds optimal " +
                        "meeting times based on individual user schedules.",
                tech));

        tech = new ArrayList<String>();
        tech.add("Android");
        tech.add("Java");
        DATA.add(new ProjectItem("Weather App",
                "Selfmade",
                "Created a weather app which accesses an open source database of weather data to " +
                        "display to the user their weather for any given day",
                tech));

        tech = new ArrayList<String>();
        tech.add("Android");
        tech.add("Java");
        tech.add("AWS");
        tech.add("SQL");
        DATA.add(new ProjectItem("CBT App",
                "Selfmade",
                "Currently developing an android app which implements Cognitive Behavioral " +
                        "Therapy practices to help people lead emotionally healthier lives.",
                tech));

        tech = new ArrayList<String>();
        tech.add("Android");
        tech.add("Java");
        tech.add("AWS");
        tech.add("SQL");
        DATA.add(new ProjectItem("Emotion Analysis App",
                "Selfmade",
                "Developing an android app to aid people in their desire to map/analyze and better " +
                        "manage their emotions.",
                tech));

        tech = new ArrayList<String>();
        tech.add("Java");
        DATA.add(new ProjectItem("Risk",
                "School",
                "Designed virtual version of Risk with a GUI which supports multiple players and " +
                        "the option to play with AIs of varying levels of difficulty.",
                tech));

        tech = new ArrayList<String>();
        tech.add("Java");
        DATA.add(new ProjectItem("Jukebox",
                "School",
                "Implemented a virtual Jukebox with a GUI, user accounts, and data persistence.",
                tech));
    }

    public static class ProjectItem{
        private String title;
        private String type;
        private String description;
        private ArrayList<String> technology;

        public ProjectItem(String name, String typ, String desc, ArrayList<String> tech){
            title = name;
            type = typ;
            description = desc;
            technology = tech;
        }

        public String getTitle(){
            return title;
        }

        public String getType(){
            return type;
        }

        public String getDescription(){
            return description;
        }

        public ArrayList<String> getTechnology(){
            return technology;
        }
    }
}
