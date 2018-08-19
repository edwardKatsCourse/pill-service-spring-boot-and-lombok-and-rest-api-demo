package com.telran.ps.model;


import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

@Entity
@Table(name = "USERS") //user, order, ....
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String firstName;

    private String lastName;

    private Integer age;

//    @Singular
//    private List<String> favouriteMusics;

}
