package com.example.process2.dto;

import com.example.process2.entity.Member;
import lombok.Setter;

@Setter
public class MemberRequestDTO {

    private String userId;
    private String password;
    private String name;
    private String age;
    private String address;
    private String phone;

    public Member toEntity(){
        return Member.builder()
                .id(userId)
                .password(password)
                .name(name)
                .age(Integer.valueOf(age))
                .address(address)
                .phone(phone)
                .build();
    }
}
