package com.abbas.translationapi.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "languages")
public class LanguageEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")

    private Integer id;
    @Column
    private String locale;
    @Column(name = "messagekey")
    private String key;
    @Column(name = "messagecontent")
    private String content;


    //Getter & Setter
}