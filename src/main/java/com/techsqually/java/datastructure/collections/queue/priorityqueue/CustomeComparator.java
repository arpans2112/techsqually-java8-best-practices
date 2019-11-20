package com.techsqually.java.datastructure.collections.queue.priorityqueue;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

class Student{

    private  String name;
    private  int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class CustomeComparator {

    public static void main(String[] args) {


        List<Student> givenList = new ArrayList<>(
                Arrays.asList(
                        new Student("Nandini", 1),
                        new Student("Nandini", 2),
                        new Student("Nandini", 3),
                        new Student("Anmol", 3),
                        new Student("Anmol", 4),
                        new Student("Palak", 5),
                        new Student("Palak", 1)
                )
        );



        PriorityQueue<Student> students = new PriorityQueue(

                /** First compare by Name and reverse the Student in reverse order*/
                Comparator.comparing(Student::getName).
                        thenComparing(Comparator.comparing(Student::getId).reversed()));


        students.addAll(givenList);

        List<Student> sortedList  = new LinkedList<>();
        Student first = students.poll();

        while (first != null){
            sortedList.add(first);
            first =  students.poll();
        }


        for (Student student : sortedList){

            System.out.println(student.getName() + " : " +  student.getId());
        }
    }



}
