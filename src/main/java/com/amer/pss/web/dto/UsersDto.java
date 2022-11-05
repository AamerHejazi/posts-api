package com.amer.pss.web.dto;

public class UsersDto {
    private final Long id;
    private final String name;
    private final String email;
    private final String gender;
    private final String status;

    public UsersDto(Long id, String name, String email, String gender, String status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getStatus() {
        return status;
    }
}
