package com.zoe.Comma.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "HOTEL")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Transactional
public class HotelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int HOTELNO;
    private String NAME;

    @Column(name = "LOCATION")
    private String LOCATION;
    private String DESCRIPTION;

    private LocalTime CREATETIME;
    private String CREATEID;
    private LocalTime MODIFYTIME;
    private String MODIFYID;

    @OneToMany(mappedBy = "HOTELNO", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HotelImgEntity> img = new ArrayList<>();
}
