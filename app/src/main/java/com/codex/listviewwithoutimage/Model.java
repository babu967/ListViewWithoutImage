package com.codex.listviewwithoutimage;

public class Model {

    private String doctorName;
    private String doctorDetails;
    private String doctorDate;
    private String doctorPhoneNo;
    private String doctorEmail;


    public Model(String doctorName, String doctorDetails, String doctorDate, String doctorPhoneNo, String doctorEmail) {
        this.doctorName = doctorName;
        this.doctorDetails = doctorDetails;
        this.doctorDate = doctorDate;
        this.doctorPhoneNo = doctorPhoneNo;
        this.doctorEmail = doctorEmail;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorDetails() {
        return doctorDetails;
    }

    public void setDoctorDetails(String doctorDetails) {
        this.doctorDetails = doctorDetails;
    }

    public String getDoctorDate() {
        return doctorDate;
    }

    public void setDoctorDate(String doctorDate) {
        this.doctorDate = doctorDate;
    }

    public String getDoctorPhoneNo() {
        return doctorPhoneNo;
    }

    public void setDoctorPhoneNo(String doctorPhoneNo) {
        this.doctorPhoneNo = doctorPhoneNo;
    }

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public void setDoctorEmail(String doctorEmail) {
        this.doctorEmail = doctorEmail;
    }
}
