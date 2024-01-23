package com.zoe.Comma.Service;

import com.zoe.Comma.Entity.RoomEntity;
import com.zoe.Comma.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    private RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }

    public List<RoomEntity> findAllByHOTELNO(int HOTELNO){
        return roomRepository.findAllByHOTELNO(HOTELNO);
    }

    public List<RoomEntity> findAllByTYPENO(int TYPENO){
        return roomRepository.findAllByTYPENO(TYPENO);
    }
}
