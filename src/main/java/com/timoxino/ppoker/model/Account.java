package com.timoxino.ppoker.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Class represents JPA entity to be stored in DB.
 *
 * @author timoxino.
 */
@Entity
public class Account
{
    @Id
    @GeneratedValue
    private Long id;

    @JsonIgnore
    public String password;
    public String email;

    public Account(String email, String password)
    {
        this.email = email;
        this.password = password;
    }

    Account()
    {
    }

    public Long getId()
    {
        return id;
    }

    public String getPassword()
    {
        return password;
    }

    public String getEmail()
    {
        return email;
    }
}
