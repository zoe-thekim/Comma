package com.zoe.Comma.DTO;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    @Id
    public int USERNO;
    public String USERID;
    public String USERPWD;
    public String USERLEVEL;
    public String NAME;
    public String PHONE;
    public String EMAIL;
    public String ADDRESS;
    public String POSTCODE;

}
