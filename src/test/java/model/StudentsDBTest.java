package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentsDBTest {

    @Test
    void getAllStudents_returnArrays() {
        Students s1 = new Students(1, "Chris", 23, "Inf");
        Students s2 = new Students(2, "Tom", 45, "WiWi");
        Students s3 = new Students(3, "Basti", 32, "Ing");

        StudentsDB testStudentsDB = new StudentsDB(new Students[]{s1, s2, s3});

        assertArrayEquals(new Students[]{s1, s2, s3,}, testStudentsDB.getAllStudents());
    }






}