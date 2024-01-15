package com.zoe.Comma.Service;

import com.zoe.Comma.DTO.UserDTO;
import com.zoe.Comma.Entity.UserEntity;

public interface SaveService {
    Long register(UserDTO userDTO);

//    UserEntity에 UserDTO를 넣어주는 과정
    // 진짜 저장은 UserService에서
    default UserEntity dtoToEntity(UserDTO userDTO){
        UserEntity userEntity = UserEntity.builder()
                .userId(userDTO.getUSER_ID())
                .USER_PWD(userDTO.getUSER_PWD())
                .NAME(userDTO.getNAME())
                .PHONE(userDTO.getPHONE())
                .EMAIL(userDTO.getEMAIL())
                .ADDRESS(userDTO.getADDRESS())
                .POST_CODE(userDTO.getPOST_CODE())
                .build();
        return userEntity;
    }
}
