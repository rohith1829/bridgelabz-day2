package com.bridgelabz;

class Subject {
    String name;
    int marks;

    Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Student {
    String name;
    int roll;
    Subject[] subjects;

    Student(String name, int roll, Subject[] subjects) {
        this.name = name;
        this.roll = roll;
        this.subjects = subjects;
    }
}

class ReportCard {
    Student student;

    ReportCard(Student student) {
        this.student = student;
    }

    void printReport() {
        int total = 0;
        for (Subject sub : student.subjects) {
            System.out.println(sub.name + ": " + sub.marks);
            total += sub.marks;
        }
        float avg = total / (float) student.subjects.length;
        char grade = avg >= 90 ? 'A' : avg >= 75 ? 'B' : avg >= 60 ? 'C' : 'D';

        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}

public class StudentReportCardDemo {
    public static void main(String[] args) {
        Subject[] subs = {
            new Subject("Math", 90),
            new Subject("Science", 80),
            new Subject("English", 85)
        };

        Student s = new Student("Rohith", 101, subs);
        ReportCard card = new ReportCard(s);
        card.printReport();
    }
}

