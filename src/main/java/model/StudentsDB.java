package model;

import java.lang.reflect.Array;
import java.util.Arrays;

/*Erstelle eine Klasse StudentDB mit folgenden Eigenschaften

        Der Konstruktor nimmt ein Array von Studenten entgegen
        Jeder Student hat einen Namen und eine Id
        Die Methode getAllStudents gibt alle Studenten als Array zurück
        Die Methode toString() gibt alle Studenten formatiert als String zurück
        Die Methode randomStudent() gibt einen zufälligen Studenten zurück (Nutze für den Zufall Math.random())
        Schreibe für alle Methoden Tests (bis auf randomStudent() )

        Bonus: Schreibe eine add und eine remove Methode, um Studenten hinzuzufügen und zu entfernen*/
public class StudentsDB {
    private Students[] aStudentDB;

   public StudentsDB(Students[] allStudents) {
       this.aStudentDB = allStudents;
   }

    @Override
    public String toString() {
        return "StudentsDB{" +
                "aStudentDB=" + Arrays.toString(aStudentDB) +
                '}';
    }

    public Students[] getAllStudents() {
       return this.aStudentDB;
    }

    public Students randomStudent() {
       int i = (int) (Math.random() * this.aStudentDB.length);
       return this.aStudentDB[i];
    }




}