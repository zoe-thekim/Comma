package com.zoe.Comma.DTO;

import jakarta.servlet.annotation.WebFilter;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
@Getter
@Setter
public class TypeDTO {
    public int TYPENO;
    public String TYPENAME;
    public LocalTime CREATETIME;
    public String CREATEID;
    public LocalTime MODIFYTIME;
    public String MODIFYID;
}
