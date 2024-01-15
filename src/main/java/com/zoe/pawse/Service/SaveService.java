package com.zoe.pawse.Service;

import com.zoe.pawse.DTO.UserDTO;
import com.zoe.pawse.Entity.UserEntity;
import jdk.swing.interop.SwingInterOpUtils;

public interface SaveService {
    Long register(UserDTO userDTO);

//    UserEntity에 UserDTO를 넣어주는 과정
    default UserEntity dtoToEntity(UserDTO userDTO){
        UserEntity userEntity = UserEntity.builder()
                .USER_NO(userDTO.getUSER_NO())
                .USER_ID(userDTO.getUSER_ID())
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
