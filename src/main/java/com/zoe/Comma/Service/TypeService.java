package com.zoe.Comma.Service;

import com.zoe.Comma.Entity.TypeEntity;
import com.zoe.Comma.Repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService {
    private TypeRepository typeRepository;

    @Autowired
    public TypeService(TypeRepository typeRepository){
        this.typeRepository = typeRepository;
    }
    public List<TypeEntity> findAllByHOTELNO(int HOTELNO){
        return typeRepository.findAllByHOTELNO(HOTELNO);
    }
}
