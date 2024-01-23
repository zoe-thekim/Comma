package com.zoe.Comma.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Entity(name = "USER")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int USERNO;
    @Column(name = "USERID")
    private String USERID;
    private String USERPWD;
    private String USERLEVEL;
    private String NAME;
    private String PHONE;
    private String EMAIL;
    private String ADDRESS;
    private String POSTCODE;
}
