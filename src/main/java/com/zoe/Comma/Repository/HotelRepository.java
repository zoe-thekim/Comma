package com.zoe.Comma.Repository;

import com.zoe.Comma.Entity.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<HotelEntity, Integer> {
    List<HotelEntity> findAll();
}
