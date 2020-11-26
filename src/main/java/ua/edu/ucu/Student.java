package ua.edu.ucu;


public class Student {

    private double GPA;
    private int year;
    private String name;
    private String surname;

    public Student(String name, String surname, double GPA, int year) {
        this.GPA = GPA;
        this.year = year;
        this.name = name;
        this.surname = surname;
    }

    public double getGPA() {
        return GPA;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student{name=" + name + ", surname=" + surname + ", " + "GPA=" + GPA + ", year=" + year + '}';
    }

    @Override
    public boolean equals(Object o) {
        Student other = (Student) o;
        if (this.name.equals(other.name) &&
            this.surname.equals(other.surname) &&
                ((this.GPA - other.GPA) < 0.001) &&
                ((this.year - other.year) < 0.001)) {
            return true;
        }
        else {
            return false;
        }
    }

}
