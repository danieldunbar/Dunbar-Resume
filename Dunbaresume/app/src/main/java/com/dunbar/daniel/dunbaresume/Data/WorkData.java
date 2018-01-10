package com.dunbar.daniel.dunbaresume.Data;

import java.util.ArrayList;

/**
 * Created by Daniel on 12/21/2017.
 */

public class WorkData {
    public static final ArrayList<WorkItem> DATA = new ArrayList<WorkItem>();

    static {
        createData();
    }

    private static void createData(){
        ArrayList<String> description = new ArrayList<String>();

        description.add("Develop and upgrade applications primarily in C# and SQL.");
        description.add("Work as part of an Agile team.");
        description.add("Work with other people in different teams and different geographical locations around the world.");
        description.add("Manage meetings and conduct presentations both in person and virtually.");
        description.add("Aided other interns with their projects which varied from running tests to helping code.");
        WorkItem optum = new WorkItem("Optum", "Technology Development Intern",
                "May 28, 2016", "August 12, 2016", "Greenville, South Carolina", description);

        description = new ArrayList<String>();
        description.add("Provided technical support for an orphanage (250 children) during 2 week visit to the Dominican Republic.");
        description.add("Tech support included installation & configuration of Windows 10 (in Spanish) on staff and classroom computers. " +
                "Also installed educational and administrative software on student computers.");
        description.add("Performed various PC maintenance and upgrade tasks on new and existing computers.");
        description.add("Provided manual labor (grounds and yard upkeep, moving equipment).");
        description.add("Spent time with the children (playing sports, distributing food, talking).");
        WorkItem nph = new WorkItem("(NPH)", "Volunteer IT Support",
                "May 15, 2017", "May 30 2017", "San Pedro de Macorís, Dominican Republic" , description);

        description = new ArrayList<String>();
        description.add("Provide periodic technical support to non-profit organization consisting of 60+ users across 4 geographical sites.");
        description.add("Created/modified web forms for their Electronic Health Records (EHR) system (Credible).");
        description.add("Networking and phone support – running Ethernet cable, RJ45/RJ11 connectors, troubleshooting network problems, 66 block punch-down.");
        description.add("Managed software on computers throughout the network.");
        WorkItem wc = new WorkItem("Wellness Connections", "IT Technician (Contractor)",
                "March 2014", "August 2015", "Sierra Vista, Arizona", description);

        DATA.add(optum);
        DATA.add(nph);
        DATA.add(wc);
    }

    public static class WorkItem{
        private String company;
        private String position;
        private String startDate;
        private String endDate;
        private String location;
        private ArrayList<String> description;

        public WorkItem(String com, String pos, String sdate, String edate, String loc, ArrayList<String> desc){
            company = com;
            position = pos;
            startDate = sdate;
            endDate = edate;
            location = loc;
            description = desc;
        }

        public String getCompany(){
            return company;
        }

        public String getPosition(){
            return position;
        }

        public String getStartDate(){
            return startDate;
        }

        public String getEndDate(){
            return endDate;
        }

        public String getLocation(){
            return location;
        }

        public ArrayList<String> getDescription(){
            return description;
        }
    }
}
