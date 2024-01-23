package com.zoe.Comma.DTO;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

@Getter
@Setter
public class HotelDTO {
    @Id
    private int ROOMNO;
    private int HOTELNO;
    private int QTY;
    private String NAME;
    private String TYPE;
    private String DESCRIPTION;
    private String OPTIONS;

    private LocalTime CREATETIME;
    private String CREATEID;
    private LocalTime MODIFYTIME;
    private String MODIFYID;

}
