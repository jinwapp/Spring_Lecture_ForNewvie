package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor // 디폴트 생성자 추가
@ToString
@Getter


@Entity // DB가 해당 객체를 인식 가능 (해당 클래스로 Table을 만든다_)
public class Article {

    @Id// 대표값을 지정! like a 주민번호
    @GeneratedValue(strategy = GenerationType.IDENTITY) //DB가 id를 자동 생성 어노테이션
    private Long id;

    @Column
    private String title;

    @Column
    private String content;



}
