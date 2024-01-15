package com.zoe.pawse.Service;

//import com.zoe.pawse.Entity.UserEntity;
import com.zoe.pawse.Entity.UserEntity;
import com.zoe.pawse.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void join(UserEntity user){
        UserEntity userEntity = UserEntity.builder()
                .USER_NO(user.getUSER_NO())
                .USER_ID(user.getUSER_ID())
                .USER_PWD(user.getUSER_PWD())
                .NAME(user.getNAME())
                .PHONE(user.getPHONE())
                .EMAIL(user.getEMAIL())
                .ADDRESS(user.getADDRESS())
                .POST_CODE(user.getPOST_CODE())
                .build();
        userRepository.save(userEntity);
    }
}
