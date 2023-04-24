package model;

import java.util.Objects;

public class Students {
    private int iID;
    private String sName;
    private int iAge;
    private String sSubject;

    public int getiID() {
        return iID;
    }

    public void setiID(int iID) {
        this.iID = iID;
    }

    public Students(int iID, String sName, int iAge, String sSubject) {
        this.iID = iID;
        this.sName = sName;
        this.iAge = iAge;
        this.sSubject = sSubject;
    }

    @Override
    public String toString() {
        return "Students{" +
                "iID=" + iID +
                ", sName='" + sName + '\'' +
                ", iAge=" + iAge +
                ", sSubject='" + sSubject + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return getiID() == students.getiID() && iAge == students.iAge && Objects.equals(sName, students.sName) && Objects.equals(sSubject, students.sSubject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iID, sName, iAge, sSubject);
    }
}
