/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author V&V
 */
public class Teacher extends Person {
    private String techerSchoolName;
    private int teacherSalary;
    private Student[] students;
    
   
    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    
//    public String getSchoolName() {
//        return schoolName;
//    }
//
//    public void setSchoolName(String schoolName) {
//        this.schoolName = schoolName;
//    }
//    @SuppressWarnings("")
//    public int getSalary() {
//        return salary;
//    }
//    
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
    
}
