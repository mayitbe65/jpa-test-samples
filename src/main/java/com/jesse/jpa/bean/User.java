package com.jesse.jpa.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

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
//@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;
    private String name;

    private Date createTime;
}
