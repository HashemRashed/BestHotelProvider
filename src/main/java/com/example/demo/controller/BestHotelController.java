package com.example.demo.controller;

import com.example.demo.dto.BestHotelDto;
import com.example.demo.response.BestHotelResponseForm;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Hashem Rashed
 */
@RestController
public class BestHotelController {

    /**
     *
      * @param
     * @return
     * call search API for Best Hotel
     */
    @GetMapping(value = "/search")
    @ApiOperation(value = "Search Best Hotels", notes = "Search Best Hotels")
    public ResponseEntity<List<BestHotelResponseForm>> searchBestHotel(
            @ApiParam(name =  "city", type = "String", value = "City Name", example = "AUD", required = true) String city,
            @ApiParam(name =  "fromDate", type = "Date", value = "From Date", example = "2021-08-04", required = true) @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate fromDate ,
            @ApiParam(name =  "toDate", type = "Date", value = "To Date", example = "2021-08-05", required = true) @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate  toDate,
            @ApiParam(name =  "numberOfAdults", type = "Integer", value = "Number Of Adults", example = "4", required = true) int numberOfAdults) {

        List<BestHotelDto> dummyDataList = fillDemoData();
        dummyDataList.removeIf(e -> !(e.getCity().equals(city)));

        List<BestHotelResponseForm> response = new ArrayList<>();

        BestHotelResponseForm objRes ;
        for (BestHotelDto dto : dummyDataList) {
            objRes = new BestHotelResponseForm();
            objRes.setHotelFare(dto.getHotelFare());
            objRes.setHotelName(dto.getHotelName());
            objRes.setRate(dto.getRate());
            objRes.setRoomAmenities(dto.getRoomAmenities());
            response.add(objRes);
        }


        return new ResponseEntity<>(response, HttpStatus.OK);
    }



    /**
     * @return
     * fill Dummy Data of Best Hotel Objects
     */
    private List<BestHotelDto> fillDemoData() {

        /*************************** add Dummy1 Data *************************/
        BestHotelDto dummy1 = new BestHotelDto();


        dummy1.setHotelName("Arena Hotel");
        dummy1.setRate(4);
        dummy1.setHotelFare(10.50);
        dummy1.setCity("AMM");
        dummy1.setFromDate(LocalDate.of(2020,01,01));
        dummy1.setToDate(LocalDate.of(2022,12,31));

        List<String> roomAmenities1 = new ArrayList<>();
        roomAmenities1.add("Free Parking");
        roomAmenities1.add("CHECK-IN & CHECK-OUT Times");
        roomAmenities1.add("Fitness Center");
        roomAmenities1.add("Bar Or Lounge");
        dummy1.setRoomAmenities(String.join(", ", roomAmenities1));


        /*************************** add Dummy2 Data *************************/
        BestHotelDto dummy2 = new BestHotelDto();

        dummy2.setHotelName("Movenpick Hotel");
        dummy2.setRate(5);
        dummy2.setHotelFare(15);
        dummy2.setCity("AMM");
        dummy2.setFromDate(LocalDate.of(2020,01,01));
        dummy2.setToDate(LocalDate.of(2022,12,31));


        List<String> roomAmenities2 = new ArrayList<>();
        roomAmenities2.add("Fitness Center");
        roomAmenities2.add("Breakfast");
        roomAmenities2.add("Free WiFi internet access");
        dummy2.setRoomAmenities(String.join(", ", roomAmenities2));


        /*************************** add Dummy3 Data *************************/
        BestHotelDto dummy3 = new BestHotelDto();

        dummy3.setHotelName("Days Inn Hotel");
        dummy3.setRate(2.86);
        dummy3.setHotelFare(25.646);
        dummy3.setCity("DOH");
        dummy3.setFromDate(LocalDate.of(2020,01,01));
        dummy3.setToDate(LocalDate.of(2022,12,31));

        List<String> roomAmenities3 = new ArrayList<>();
        roomAmenities3.add("Sports Gym");
        roomAmenities3.add("In-Room Cocktail Station");
        dummy3.setRoomAmenities(String.join(", ", roomAmenities3));


        /*************************** add Dummy2 Data *************************/
        BestHotelDto dummy4 = new BestHotelDto();

        dummy4.setHotelName("Movenpick Hotel");
        dummy4.setRate(5);
        dummy4.setHotelFare(15);
        dummy4.setCity("AUD");
        dummy4.setFromDate(LocalDate.of(2020,01,01));
        dummy4.setToDate(LocalDate.of(2022,12,31));


        List<String> roomAmenities4 = new ArrayList<>();
        roomAmenities4.add("Fitness Center");
        roomAmenities4.add("Breakfast");
        roomAmenities4.add("Free WiFi internet access");
        dummy4.setRoomAmenities(String.join(", ", roomAmenities4));


        List<BestHotelDto> demoList = new ArrayList<>();
        demoList.add(dummy1);
        demoList.add(dummy2);
        demoList.add(dummy3);
        demoList.add(dummy4);

        return demoList;

    }
}
