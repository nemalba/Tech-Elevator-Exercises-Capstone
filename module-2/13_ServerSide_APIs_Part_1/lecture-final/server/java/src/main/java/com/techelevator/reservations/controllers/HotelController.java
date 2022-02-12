package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Hotel;
import com.techelevator.reservations.model.Reservation;
import org.springframework.web.bind.annotation.*;

import javax.naming.spi.ResolveResult;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HotelController {

    private HotelDao hotelDao;
    private ReservationDao reservationDao;

    public HotelController() {
        this.hotelDao = new MemoryHotelDao();
        this.reservationDao = new MemoryReservationDao(hotelDao);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list() {
        return hotelDao.list();
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
        return hotelDao.get(id);
    }

    /**
     * Return all the reservation information
     *
     * @return all reservations
     */
    @RequestMapping(path = "/reservations", method= RequestMethod.GET )
    public List<Reservation> listAllReservations(){
        return reservationDao.findAll();
    }
    /**
     * Return a reservation by its id
     *
     * @param id the id of the reservation
     * @return a single reservation
     */
    @RequestMapping(path = "/reservations/{id}", method = RequestMethod.GET)
    public Reservation getReservationById(@PathVariable int id){
        return reservationDao.get(id);
    }

    /**
     * Return all reservations for a specific hotel
     *
     * /hotels/{id}/reservations
     * @param hotelID
     * @return all reservations for that given hotel
     */
    @RequestMapping(path = "/hotels/{id}/reservations", method = RequestMethod.GET)
    public List<Reservation> getReservationsByHotelID(@PathVariable("id") int hotelID){
        return reservationDao.findByHotel(hotelID);
    }

    /**
     * Create a new reservation for a given hotel
     *
     * @param reservation object
     * @return reservation object
     */
    @RequestMapping(path = "/reservations", method= RequestMethod.POST)
    public Reservation createReservation(@RequestBody Reservation reservation){
        return reservationDao.create(reservation, reservation.getHotelID());
    }
    /**
     * Return all hotels that match a specific filter
     *
     * path hotels/filter?state=xxx&city=yyy
     * @param state the state to filter by
     * @param city the city to filter by (not required)
     * @return reservations that match the filter
     */
    @RequestMapping(path = "hotels/filter", method = RequestMethod.GET)
    public List<Hotel> filterByCityAndState(@RequestParam String state,
                                                  @RequestParam (required = false) String city){
        List<Hotel>  hotelList = list();  // get all hotels
        List<Hotel>  filteredList = new ArrayList<>();  // created an empty list to hold the filtered

        for (Hotel hotel: hotelList){  // looped through all hotels
            if (hotel.getAddress().getState().equalsIgnoreCase(state)){  // looking for state
                if (city != null){  // checking to see if city filter was sent
                    if (hotel.getAddress().getCity().equalsIgnoreCase(city)){
                        filteredList.add(hotel);
                    }
                } else {
                    filteredList.add(hotel);
                }
            }
        }
        return filteredList;
    }
}
