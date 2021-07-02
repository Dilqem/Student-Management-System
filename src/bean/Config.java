/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import util.FileUtility;

/**
 *
 * @author V&V
 */
@SuppressWarnings("serial")
public class Config implements Serializable {

    public static Config config = null;
    public static boolean logged;

    public static void initialize() {
        Object obj = FileUtility.readFileDeserialize("app.obj");
        if (obj == null) {
            return;
        }
        if (obj instanceof Config) {
            config = (Config) obj;
        }
    }

    public static void save() {
        FileUtility.writeObjectIntoFile(Config.instance(), "app.obj");
    }
    private Student[] students = new Student[0];
    private Teacher[] teachers = new Teacher[0];

    public Student[] getStudents() {
        return students;
    }

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }

    public static boolean isLogged() {
        return logged;
    }

    public static void setLogged(boolean logged) {
        Config.logged = logged;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public void appendStudent(Student s) {
        Student[] newStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        newStudents[newStudents.length - 1] = s;
        students = newStudents;
    }

    public void appendTeacher(Teacher s) {
        Teacher[] newTeachers = new Teacher[teachers.length + 1];
        for (int i = 0; i < teachers.length; i++) {
            newTeachers[i] = teachers[i];
        }
        newTeachers[newTeachers.length - 1] = s;
        teachers = newTeachers;
    }

    public static Config instance() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }
}
