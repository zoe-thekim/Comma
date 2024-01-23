package com.zoe.Comma.Controller;

import com.zoe.Comma.Entity.HotelEntity;
import com.zoe.Comma.Entity.HotelImgEntity;
import com.zoe.Comma.Entity.RoomEntity;
import com.zoe.Comma.Repository.HotelRepository;
import com.zoe.Comma.Repository.RoomRepository;
import com.zoe.Comma.Repository.UserRepository;
import com.zoe.Comma.Service.HotelService;
import com.zoe.Comma.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HotelController {
    private final HotelService hotelService;
    private final RoomService roomService;

    @Autowired
    public HotelController(HotelService hotelService, RoomService roomService){
        this.hotelService = hotelService;
        this.roomService = roomService;
    }

    @GetMapping("/hotel/list")
    public String hotel_list(Model model){
        List<HotelEntity> hotelList = hotelService.GetAllHotel();
        model.addAttribute("hotelList", hotelList);
        model.addAttribute("main_content", "hotel/list");

        return "main";
    }

    @GetMapping("/hotel/detail")
    public String hotel_detail(@RequestParam int HOTELNO, Model model){
        List<RoomEntity> roomEntity = roomService.findAllByHOTELNO(HOTELNO);
        model.addAttribute("roomEntity", roomEntity);
        model.addAttribute("main_content", "hotel/detail");
        return "main";
    }
}
