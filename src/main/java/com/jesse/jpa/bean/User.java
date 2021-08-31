package com.jesse.jpa.bean;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * @author yu.zhang
 * created on 2021-08-27
 */
@Data
@Entity
@Table(name = "user")
@DynamicInsert
@DynamicUpdate
//@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String name;

    @Column(name= "create_time", nullable = false, updatable = false)
    private Date createTime;
}
