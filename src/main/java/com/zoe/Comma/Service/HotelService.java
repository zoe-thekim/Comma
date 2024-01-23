package com.zoe.Comma.Service;

import com.zoe.Comma.DTO.HotelDTO;
import com.zoe.Comma.Entity.HotelEntity;
import com.zoe.Comma.Repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HotelService {
    private HotelRepository hotelRepository;

    @Autowired
    public HotelService(HotelRepository hotelRepository){
        this.hotelRepository = hotelRepository;
    }

    public List<HotelEntity> GetAllHotel(){
        return hotelRepository.findAll();
    }
}
