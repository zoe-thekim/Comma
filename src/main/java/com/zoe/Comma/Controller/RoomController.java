package com.zoe.Comma.Controller;

import com.zoe.Comma.Entity.RoomEntity;
import com.zoe.Comma.Service.RoomService;
import com.zoe.Comma.Service.TypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class RoomController {
    private final RoomService roomService;
    private final TypeService typeService;


    public RoomController(RoomService roomService, TypeService typeService) {

        this.roomService = roomService;
        this.typeService = typeService;
    }

    @GetMapping("/hotel/room")
    public String hotel_room(@RequestParam int TYPENO, Model model){
        List<RoomEntity> roomEntity = roomService.findAllByTYPENO(TYPENO);
        model.addAttribute("roomEntity", roomEntity);
        model.addAttribute("main_content", "hotel/room");
        return "main";
    }
}
