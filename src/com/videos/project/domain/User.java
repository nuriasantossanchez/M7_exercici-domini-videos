package com.videos.project.domain;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Clase de la capa Domain
 *
 * Representa a un usuario identificado por su nombre, apellido y password
 *
 * Contiene un listado de objetos de tipo Video, con los videos creados por
 * dicho usuario
 *
 */
public class User {

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

    public void addVideo(Video video) {
        this.videos.add(video);
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getPassword() {
        return this.password;
    }

    public List<Video> getVideos() {
        return this.videos;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                '}';
    }
}
