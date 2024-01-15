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
    private int USER_NO;
    @Column(name = "USER_ID")
    private String userId;
    private String USER_PWD;
    private String NAME;
    private String PHONE;
    private String EMAIL;
    private String ADDRESS;
    private String POST_CODE;
}
