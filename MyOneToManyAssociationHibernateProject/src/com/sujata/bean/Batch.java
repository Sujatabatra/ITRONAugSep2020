package com.sujata.bean;

import javax.persistence.*;
import java.util.List;
@Entity
public class Batch {
    @Id
    private String batchId;
    private String batchName;
    @OneToMany
    @JoinTable(name = "BatchWiseStudents",
            joinColumns ={@JoinColumn(name="BatchSerialNo",referencedColumnName = "batchId")},
            inverseJoinColumns ={@JoinColumn(name="StudentId", referencedColumnName = "rollNo")} )
    List<StudentEntity> students;

    public Batch() {
    }

    public Batch(String batchId, String batchName) {
        this.batchId = batchId;
        this.batchName = batchName;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public List<StudentEntity> getStudents() {
        return students;
    }

    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }
}
