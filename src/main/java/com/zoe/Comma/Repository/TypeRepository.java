package com.zoe.Comma.Repository;

import com.zoe.Comma.Entity.TypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeRepository extends JpaRepository<TypeEntity, Integer> {

    List<TypeEntity> findAllByHOTELNO(int HOTELNO);
}
