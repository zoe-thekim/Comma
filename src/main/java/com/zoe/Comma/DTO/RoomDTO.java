package com.zoe.Comma.DTO;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
public class RoomDTO {
    @Id
    public int HOTELNO;
    public String NAME;
    public String LOCATION;
    public String DESCRIPTION;
    private int TYPENO;
    private String OPTIONS;

    public LocalTime CREATETIME;
    public String CREATEID;
    public LocalTime MODIFYTIME;
    public String MODIFYID;

}
