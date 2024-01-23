package com.zoe.Comma.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Time;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "HOTELIMG")
public class HotelImgEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int NO;
    @Column(name = "IMG1")
    private String IMG1;
    private String IMG2;
    private String IMG3;
    private String IMG4;
    private String IMG5;
    private String CREATOR;
    private Time CREATETIME;
    private String MODIFIER;
    private Time MODIFYTIME;

    @ManyToOne
    @JoinColumn(name = "HOTELNO")
    private HotelEntity HOTELNO;
}

