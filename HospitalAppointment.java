package com.oop2020;
import java.time.LocalDateTime;

public class HospitalAppointment {
    private Doctor d;
    private Patient p;
    private LocalDateTime dt;
    public HospitalAppointment(Doctor d, Patient p, LocalDateTime dt){
        this.d = d;
        this.p = p;
        this.dt = dt;
    }
    public Doctor getDoctor(){ return d; }
    public Patient getPatient(){ return p; }
    public LocalDateTime getLocalDateTime(){ return dt; }
    public String toString(){
        return "HospitalAppointment: " + dt + "\n" +  d.toString() + "\n" + p.toString();
    }
}
