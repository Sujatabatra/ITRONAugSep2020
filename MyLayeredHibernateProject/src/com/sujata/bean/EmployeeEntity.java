package com.sujata.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "employee", schema = "itronhiber", catalog = "")
public class EmployeeEntity {
    private int eid;
    private String deptt;
    private String desig;
    private String ename;
    private int salary;

    public EmployeeEntity() {
    }

    public EmployeeEntity(int eid, String deptt, String desig, String ename, int salary) {
        this.eid = eid;
        this.deptt = deptt;
        this.desig = desig;
        this.ename = ename;
        this.salary = salary;
    }

    @Id
    @Column(name = "eid")
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    @Basic
    @Column(name = "deptt")
    public String getDeptt() {
        return deptt;
    }

    public void setDeptt(String deptt) {
        this.deptt = deptt;
    }

    @Basic
    @Column(name = "desig")
    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    @Basic
    @Column(name = "ename")
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Basic
    @Column(name = "salary")
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeEntity that = (EmployeeEntity) o;
        return eid == that.eid &&
                salary == that.salary &&
                Objects.equals(deptt, that.deptt) &&
                Objects.equals(desig, that.desig) &&
                Objects.equals(ename, that.ename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eid, deptt, desig, ename, salary);
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "eid=" + eid +
                ", deptt='" + deptt + '\'' +
                ", desig='" + desig + '\'' +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                '}';
    }
}
