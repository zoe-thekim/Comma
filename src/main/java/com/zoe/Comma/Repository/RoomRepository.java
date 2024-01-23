package com.zoe.Comma.Repository;

import com.zoe.Comma.Entity.RoomEntity;
import com.zoe.Comma.Entity.TypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<RoomEntity, Integer>{
    List<RoomEntity> findAllByHOTELNO(int HOTELNO);
    List<RoomEntity> findAllByTYPENO(int TYPENO);
}