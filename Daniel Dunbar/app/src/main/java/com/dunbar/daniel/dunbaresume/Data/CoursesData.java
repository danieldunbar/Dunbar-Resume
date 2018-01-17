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
        DATA.add(new CourseItem("Algorithms",
                "The emphasis is on learning techniques for designing " +
                "algorithms and data structures for various computer applications. We will learn how " +
                "to create algorithms, to analyze them, and prove their correctness.\n" +
                "\n" +
                "In the process of learning and practicing methods of algorithm design, we will see " +
                "many examples of important algorithms. We will also discuss implementation issues.\n" +
                "\n" +
                "Topics to be discussed include: Paradigms of algorithm design, Sorting and Searching, " +
                "String matching, Graph algorithms, Geometric algorithms, Approximation algorithms",
                tech));

        tech = new ArrayList<String>();
        tech.add("Android");
        tech.add("SQL");
        tech.add("AWS");
        DATA.add(new CourseItem("Software Engineering",
                "This course introduces the fundamental software engineering techniques for " +
                        "developing correct, efficient, reliable, maintainable and evolvable " +
                        "software for a large project. In the highly dynamic and competitive software " +
                        "industry, the customers' needs may sometimes be difficult to understand in " +
                        "advance or may change while the software is being developed. Therefore, " +
                        "software products may need to evolve iteratively instead of being designed " +
                        "completely in advance. The class project in this course will attempt to give " +
                        "you an experience in developing a high quality, evolvable software product",
                tech));

        tech = new ArrayList<String>();
        tech.add("Java");
        DATA.add(new CourseItem("Object-Oriented Programming",
                "This course explores object-oriented features such as inheritance and object-oriented " +
                        "design issues. The course also presents event-driven programming and the Java " +
                        "Swing classes for constructing interactive Graphical User Interfaces (GUIs). " +
                        "It will also include some of the Unified Modeling Language (UML) and several " +
                        "design patterns.\n" +
                        "\n" +
                        "Students will complete a few programs using these Java features, and a fairly " +
                        "complex system by the end of the semester while working in teams.\n" +
                        "\n" +
                        "Objectives - To teach the basics of object-oriented analysis, design and " +
                        "programming. Experience software development on a larger scale. Gain experience " +
                        "working on teams. Become comfortable with event-driven programming and graphical " +
                        "user interfaces and related design issues. Learn and apply some of the current " +
                        "tools of modern and object-oriented technology: Inheritance, Polymorphism, " +
                        "interfaces, Event-driven programming, graphical user interfaces, Uses cases, " +
                        "Responsibility driven design, Unified Modeling Language (UML), Object-Oriented " +
                        "Design Patterns",
                tech));

        tech = new ArrayList<String>();
        tech.add("Java");
        DATA.add(new CourseItem("Analysis of Discrete Structures",
                "Topics include trees, graphs, program verification, algorithm analysis, recurrence " +
                        "relations, algorithm classes (greedy, divide and conquer), hashing, " +
                        "combinatorics and elementary probability",
                tech));

        tech = new ArrayList<String>();
        tech.add("Java");
        tech.add("C");
        DATA.add(new CourseItem("Parallel and Distributed Programming",
                "Concepts and applications of parallel and distributed programs. Process interaction " +
                        "using shared variables and message passing; parallel computing; development " +
                        "of correct programs; general problem solving techniques; scientific computing; " +
                        "distributed systems. Programming assignments on multiple processor machines.",
                tech));

        tech = new ArrayList<String>();
        tech.add("SQL");
        DATA.add(new CourseItem("Databases",
                "This is a broad coverage course which gives students a detailed examination of the " +
                        "use of database management systems. The topics covered include conceptual " +
                        "design, data models, query languages, logical database design, physical " +
                        "database design, and introduction to query optimization.",
                tech));

        tech = new ArrayList<String>();
        tech.add("C--");
        DATA.add(new CourseItem("Compilers",
                "Covers the design and implementation of translator-oriented systems programs, " +
                        "especially compilers. Topics covered include lexical analysis, top down " +
                        "and bottom up parsing, syntax-directed code generation, and debuggers.",
                tech));

        tech = new ArrayList<String>();
        tech.add("N/A");
        DATA.add(new CourseItem("Automata, Grammars, and Languages",
                "This course is an introduction to the fundamental models of computation used " +
                        "throughout computer science: finite automata, pushdown automata, and Turing " +
                        "machines. The hierarchical relationships among these models, their relative " +
                        "power and limitations, and their variants are studied. Student skills are " +
                        "developed in understanding and using rigorous definition and proof to attack " +
                        "precisely formulated questions about computability and computation. " +
                        "\n" +
                "Topics covered include: finite automata and regular expressions, Turing machines, " +
                        "properties of regular sets, Church's thesis, context-free grammars and " +
                        "pushdown automata, recursive and recursively , enumerable sets, properties " +
                        "of context-free languages, universal machines, parsing applications, " +
                        "undecidable problems and reducibility",
                tech));

        tech = new ArrayList<String>();
        tech.add("HTML5");
        tech.add("CSS");
        tech.add("Javascript");
        tech.add("PHP");
        DATA.add(new CourseItem("Web Programming",
                "Introduction to the techniques and technologies for developing dynamic web sites. " +
                        "Topics include a web server, PHP as the server-side scripting language, the " +
                        "MySQL database, JavaScript and AJAX for enriching web services, and page " +
                        "layout with HTML and CSS. Security concerns will be considered with details " +
                        "for prevention of such vulnerabilities in web applications. This course " +
                        "includes a team project to deploy a dynamic website. Weekly laboratory.",
                tech));
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
