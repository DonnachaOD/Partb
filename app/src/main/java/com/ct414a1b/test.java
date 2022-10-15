package com.ct414a1b;

import java.util.ArrayList;

import org.joda.time.DateTime;

import com.ct414a1a.ug.Course;
import com.ct414a1a.ug.Lecturer;
import com.ct414a1a.ug.Module;
import com.ct414a1a.ug.Student;


public class test {
    public static void main(String args[]){
        Course engineeringCourseY1 = new Course("Engineering Year 1");
        engineeringCourseY1.addModule(generateModules(generateStudents()));
        System.out.println(engineeringCourseY1);
    }

    private static ArrayList<Module> generateModules(ArrayList<Student> students) {

        ArrayList<Module> modules = new ArrayList<Module>();

        Module appliedMathsI = new Module("Applied Maths I", "M123", new Lecturer("Guiseppe Zurlo", new DateTime(1987, 7, 10, 0, 0), 12345));
        Module calculusI = new Module("Calculus I", "M147", new Lecturer("Michael Schukat", new DateTime(1977, 8, 11, 0, 0), 12222));
        Module engineeringDesign = new Module("Engineering Design", "E007", new Lecturer("Liam Kilmartin", new DateTime(1980, 10, 12, 0, 0), 12230));
        Module computingI = new Module("Computing I", "E010", new Lecturer("Enda Howley", new DateTime(1990, 1, 18, 0, 0), 12440));
        
        appliedMathsI.setStudents(students);
        calculusI.setStudents(students);
        engineeringDesign.setStudents(students);
        computingI.setStudents(students);

        modules.add(appliedMathsI);
        modules.add(calculusI);
        modules.add(engineeringDesign);
        modules.add(computingI);

        return modules;
    }

    private static ArrayList<Student> generateStudents() {

        ArrayList<Student> students = new ArrayList<Student>();
        
        students.add(new Student("Donnacha", new DateTime(2000, 06, 30,0,0),    19379026));
        students.add(new Student("Luisa", new DateTime(2000, 10, 21,0,0),       19909090));
        students.add(new Student("Sara", new DateTime(2000, 12, 23,0,0),        19379123));
        students.add(new Student("Martha", new DateTime(2000, 01, 21,0,0),      19837321));
        students.add(new Student("Ciaran", new DateTime(2000, 07, 07,0,0),      19434133));
        students.add(new Student("Tadhg", new DateTime(2001, 01, 06,0,0),       19090080));
        students.add(new Student("Mark", new DateTime(2001, 9, 11,0,0),         19783747));

        return students;
    }
}
