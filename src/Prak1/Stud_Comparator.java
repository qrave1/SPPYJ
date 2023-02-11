package Prak1;

import java.util.Comparator;

public class Stud_Comparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
//        return Integer.compare(s1.getScore(), s2.getScore());
        return Math.max(s1.getScore(), s2.getScore());
    }
}

