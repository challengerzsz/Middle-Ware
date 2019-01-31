package com.xiyou3g.oauth2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author zengshuaizhi@baidu.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "middle_ware_user")
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;
}
