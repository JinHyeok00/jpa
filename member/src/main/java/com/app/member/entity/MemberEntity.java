package com.app.member.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "member_table")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column(unique = true) //unique 제약조건 추가
    private String memberEmail;

    @Column
    private String memberPassword;

    @Column
    private String memberName;
}