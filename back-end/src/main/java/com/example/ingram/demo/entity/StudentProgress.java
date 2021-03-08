package com.example.ingram.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "student_progress")
public class StudentProgress {

    //Define fields and annotate them with db column names
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "section_1")
    private String sectionOne;

    @Column(name = "section_2")
    private String sectionTwo;

    @Column(name = "section_3")
    private String sectionThree;

    @Column(name = "section_4")
    private String sectionFour;

    @Column(name = "section_5")
    private String sectionFive;

    //Default Constructor
    public StudentProgress() {
    }

    //Parameterized Constructor
    public StudentProgress(String sectionOne, String sectionTwo, String sectionThree, String sectionFour, String sectionFive) {
        this.sectionOne = sectionOne;
        this.sectionTwo = sectionTwo;
        this.sectionThree = sectionThree;
        this.sectionFour = sectionFour;
        this.sectionFive = sectionFive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSectionOne() {
        return sectionOne;
    }

    public void setSectionOne(String sectionOne) {
        this.sectionOne = sectionOne;
    }

    public String getSectionTwo() {
        return sectionTwo;
    }

    public void setSectionTwo(String sectionTwo) {
        this.sectionTwo = sectionTwo;
    }

    public String getSectionThree() {
        return sectionThree;
    }

    public void setSectionThree(String sectionThree) {
        this.sectionThree = sectionThree;
    }

    public String getSectionFour() {
        return sectionFour;
    }

    public void setSectionFour(String sectionFour) {
        this.sectionFour = sectionFour;
    }

    public String getSectionFive() {
        return sectionFive;
    }

    public void setSectionFive(String sectionFive) {
        this.sectionFive = sectionFive;
    }

    @Override
    public String toString() {
        return "StudentProgress{" +
                "id=" + id +
                ", sectionOne='" + sectionOne + '\'' +
                ", sectionTwo='" + sectionTwo + '\'' +
                ", sectionThree='" + sectionThree + '\'' +
                ", sectionFour='" + sectionFour + '\'' +
                ", sectionFive='" + sectionFive + '\'' +
                '}';
    }
}
