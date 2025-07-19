package org.Example;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long student_id;

    @Column
    String first_name;

    @Column
    String last_name;

    @Column
    String gender;

    @Column
    Date date_of_birth;

    @Column
    String email;

    @Column
    String phone;

    @Column
    String address;

    @Column
    String city;

    @Column
    String state;


    @Column
    long pincode;

    @Column
    Date enrollment_date;

    @Column
    String course;


    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    public Date getEnrollment_date() {
        return enrollment_date;
    }

    public void setEnrollment_date(Date enrollment_date) {
        this.enrollment_date = enrollment_date;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return student_id == students.student_id && pincode == students.pincode && Objects.equals(first_name, students.first_name) && Objects.equals(last_name, students.last_name) && Objects.equals(gender, students.gender) && Objects.equals(date_of_birth, students.date_of_birth) && Objects.equals(email, students.email) && Objects.equals(phone, students.phone) && Objects.equals(address, students.address) && Objects.equals(city, students.city) && Objects.equals(state, students.state) && Objects.equals(enrollment_date, students.enrollment_date) && Objects.equals(course, students.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student_id, first_name, last_name, gender, date_of_birth, email, phone, address, city, state, pincode, enrollment_date, course);
    }

    @Override
    public String toString() {
        return "Students{" +
                "student_id=" + student_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", gender='" + gender + '\'' +
                ", date_of_birth=" + date_of_birth +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
                ", enrollment_date=" + enrollment_date +
                ", course='" + course + '\'' +
                '}';
    }

}