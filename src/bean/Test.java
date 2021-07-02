/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 *
 * @author V&V
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Teacher t = new Teacher();
        Student[] ss = {new Student()};
        t.setStudents(ss);
        checkObjNotNull(t);
    }
    public static void checkObjNotNull(Object obj) throws Exception {
        Method[] methods = obj.getClass().getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            Method m = methods[i];
            Annotation[] anns = m.getAnnotations();
            System.out.println(m.getName());

            for (int j = 0; j < anns.length; j++) {
                Annotation ann = anns[j];
//                if (ann.annotationType() == BoshOlmasin.class) 
                {
                    Object result = m.invoke(obj);
                    if (result == null) {
                        throw new IllegalArgumentException("Dedim axi bosh olmasin");
                    }
                    if (result instanceof Object[]) {
                        Object[] arr = (Object[]) result;
                        if (arr.length == 0) {
                            throw new IllegalArgumentException("Dedim axi bosh olmasin arr");
                        }
                    }
                }
                System.out.println(ann.annotationType());
            }
            System.out.println("-----------------");
        }
    }
}
