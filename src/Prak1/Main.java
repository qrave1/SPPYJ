package Prak1;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("John", 10);
        Student s2 = new Student("Jane", 20);
        Student s3 = new Student("Jack", 30);
        Student s4 = new Student("Jill", 40);
        Stud_Comparator stud_comparator = new Stud_Comparator();
        System.out.println(stud_comparator.compare(s1, s2));
        System.out.println(stud_comparator.compare(s2, s3));
        System.out.println(stud_comparator.compare(s3, s4));
    }
}
