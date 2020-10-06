package com.videos.project.domain;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User implements UserInterfaz {

    private String name;
    private String surname;
    private String password;
    private String registrationDate;
    private DateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private List<Video> videos=new ArrayList<Video>();

    public User(String name, String surname, String password) {
        this.name=name;
        this.surname=surname;
        this.password=password;
        this.registrationDate=formatDate.format(new Date());
    }

    @Override
    public void addVideoUser(Video video) {
        this.videos.add(video);
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Video> getVideos() {
        return videos;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                ", videos=" + videos +
                '}';
    }
}
