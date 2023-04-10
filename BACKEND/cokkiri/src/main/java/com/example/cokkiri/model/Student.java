package com.example.cokkiri.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Student {

    @Id
    @GeneratedValue
    @Column
    private String id;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private String sex;

    @Column
    private String major;

    @Column
    private String number;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(nullable = false)
    private LocalDateTime restrction_date;

    @ElementCollection
    private List<String> course;

    @ColumnDefault("false")
    @Column
    private boolean admin;
}
