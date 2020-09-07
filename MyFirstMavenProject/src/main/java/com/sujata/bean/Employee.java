package com.sujata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp")
public class Employee {
    @Id
    @Column(name="empId")
    private int eid;
    @Column(name = "empName")
    private String ename;
    @Column(name = "department")
    private String deptt;
    @Column(name="designation")
    private String desig;
    private int salary;

    public Employee() {
    }

    public Employee(int eid, String ename, String deptt, String desig, int salary) {
        this.eid = eid;
        this.ename = ename;
        this.deptt = deptt;
        this.desig = desig;
        this.salary = salary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDeptt() {
        return deptt;
    }

    public void setDeptt(String deptt) {
        this.deptt = deptt;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", deptt='" + deptt + '\'' +
                ", desig='" + desig + '\'' +
                ", salary=" + salary +
                '}';
    }
}
