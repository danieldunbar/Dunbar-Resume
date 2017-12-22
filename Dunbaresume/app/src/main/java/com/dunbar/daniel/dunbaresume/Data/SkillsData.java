package com.dunbar.daniel.dunbaresume.Data;

import java.util.ArrayList;

/**
 * Created by Daniel on 12/21/2017.
 */

public class SkillsData {
    public static final ArrayList<SkillItem> DATA = new ArrayList<SkillItem>();

    static {
        createData();
    }

    private static void createData(){
        DATA.add(new SkillItem("Android Development", "Expert"));
        DATA.add(new SkillItem("Java", "Intermediate"));
        DATA.add(new SkillItem("C#", "Intermediate"));
        DATA.add(new SkillItem("C", "Intermediate"));
        DATA.add(new SkillItem("Agile Development", "Intermediate"));
        DATA.add(new SkillItem("Github", "Intermediate"));
        DATA.add(new SkillItem("SQL", "Beginner"));
        DATA.add(new SkillItem("HTML5/CSS", "Beginner"));
        DATA.add(new SkillItem("Javascript", "Beginner"));
    }

    public static class SkillItem{
        private String skill;
        private String experience;

        public SkillItem(String sk, String exp){
            skill = sk;
            experience = exp;
        }

        public String getSkill(){
            return skill;
        }

        public String getExperience(){
            return experience;
        }
    }
}
