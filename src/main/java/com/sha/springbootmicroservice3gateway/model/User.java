package com.sha.springbootmicroservice3gateway.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
        //user adı veritabında reserved olduğu için users kullanmalıyız
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name="username", unique = true, nullable = false, length = 100)
    private String username;

    @Column(name="password", nullable = false, length = 100)
    private String password;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="create_time")
    private LocalDateTime createTime;





}
