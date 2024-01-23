package com.zoe.Comma.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Transactional
@Table(name = "ROOM")
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ROOMNO;
    private int HOTELNO;
    private int QTY;
    private String NAME;
    private int TYPENO;
    private String DESCRIPTION;
    private String OPTIONS;

    private LocalTime CREATETIME;
    private String CREATEID;
    private LocalTime MODIFYTIME;
    private String MODIFYID;

}
