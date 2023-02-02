package com.example.process2.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tn_member")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Member {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;


}
