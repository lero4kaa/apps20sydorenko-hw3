package ua.edu.ucu;


public class Student {

    private double GPA;
    private int year;
    private String name;
    private String surname;

    static final double DIFF = 0.001;

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
        return "Student{name=" + name + ", surname=" + surname + ", "
                + "GPA=" + GPA + ", year=" + year + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Student)) {
            return false;
        }
        Student other = (Student) o;
        if (this.name.equals(other.name)
                && this.surname.equals(other.surname)
                && ((this.GPA - other.GPA) < DIFF)
                && ((this.year - other.year) < DIFF)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        assert false: "hashCode not designed";
        return 42;
    }

}
