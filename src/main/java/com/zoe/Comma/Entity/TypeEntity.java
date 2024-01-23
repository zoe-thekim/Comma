package com.zoe.Comma.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "ROOMTYPE")
public class TypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int TYPENO;
    public String TYPENAME;
    public LocalTime CREATETIME;
    public String CREATEID;
    public LocalTime MODIFYTIME;
    public String MODIFYID;
}
