package com.testproject.testing.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table(name = "Student")
@Entity
public class Student {

    @Id
    @Column(name = "ID", length = 60)
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

}
