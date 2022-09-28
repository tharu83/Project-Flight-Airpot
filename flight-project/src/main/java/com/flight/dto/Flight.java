package com.flight.dto;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;





@Entity
public class Flight {
    
//    data members
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long flightId;
    @Column(name ="flightModel")
    private String flightModel;
    @Column(name ="carrierName")
    private String carrierName;
    @Column(name ="seatCapacity")
    private int seatCapacity;
    
//  default constructor
    public Flight() {
        super();
        
    }



//    parameterized constructor
    public Flight(long flightId, String flightModel, String carrierName, int seatCapacity) {
        super();
        this.flightId = flightId;
        this.flightModel = flightModel;
        this.carrierName = carrierName;
        this.seatCapacity = seatCapacity;
    }




//    getters and setters
    public long getFlightId() {
        return flightId;
    }
    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }
    public String getFlightModel() {
        return flightModel;
    }
    public void setFlightModel(String flightModel) {
        this.flightModel = flightModel;
    }
    public String getCarrierName() {
        return carrierName;
    }
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }
    public int getSeatCapacity() {
        return seatCapacity;
    }
    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }
    
    
    





}