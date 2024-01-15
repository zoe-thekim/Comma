package com.zoe.Comma.DTO;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    @Id
    public int USER_NO;
    public String USER_ID;
    public String USER_PWD;
    public String NAME;
    public String PHONE;
    public String EMAIL;
    public String ADDRESS;
    public String POST_CODE;

}
