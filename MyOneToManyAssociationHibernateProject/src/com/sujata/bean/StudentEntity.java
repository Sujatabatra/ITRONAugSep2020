package com.sujata.bean;

import javax.persistence.*;

@Entity
@Table(name="Student")
public class StudentEntity {
    @Id
    private int rollNo;
    private String name;
    @ManyToOne
    @JoinColumn(name="batchId")
    private Batch batch;

    public StudentEntity() {
    }

    public StudentEntity(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }
}
