package com.example.demo.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

/**
 * @author Hashem Rashed
 */
@Data
public class BestHotelDto {

    private String hotelName;
    private double rate;
    private double hotelFare;
    private String roomAmenities;
    private String city; // IATA code (AUH)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate fromDate;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate toDate;
    private int numberOfAdults;


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public int getNumberOfAdults() {
        return numberOfAdults;
    }

    public void setNumberOfAdults(int numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

        public void setRate(double rate) {
            if(rate <= 5){
                this.rate = rate;
            }
        }

    public void setHotelFare(double hotelFare) {
        this.hotelFare = hotelFare;
    }

    public void setRoomAmenities(String roomAmenities) {
        this.roomAmenities = roomAmenities;
    }

    public String getHotelName() {
        return hotelName;
    }

    public double getRate() {
        return rate;
    }

    /**
     * @return Total price rounded to 2 decimals
     */
    public double getHotelFare() {
        return hotelFare = (double) Math.round(hotelFare * 100) / 100;
    }

    public String getRoomAmenities() {
        return roomAmenities;
    }

}
