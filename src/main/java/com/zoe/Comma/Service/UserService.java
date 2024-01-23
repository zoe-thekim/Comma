package com.zoe.Comma.Service;

import com.zoe.Comma.Entity.UserEntity;
import com.zoe.Comma.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public boolean LoginCheck(String userId, String userPwd)
    {
        UserEntity userEntity = userRepository.findByUSERID(userId);

        if(userEntity != null && userEntity.getUSERPWD().equals(userPwd)){
            return  true; // 인증 성공
        }
        else{
            return false;
        }
    }
    public UserEntity GetUserInfo(String userId, String userPwd)
    {
        UserEntity userEntity = userRepository.findByUSERID(userId);

        if(userEntity != null && userEntity.getUSERPWD().equals(userPwd)){
            return  userEntity; // 인증 성공
        }
        else{
            return null;
        }
    }
}
