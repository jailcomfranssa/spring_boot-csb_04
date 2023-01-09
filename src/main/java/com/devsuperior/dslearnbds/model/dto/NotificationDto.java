package com.devsuperior.dslearnbds.model.dto;

import com.devsuperior.dslearnbds.model.entity.Notification;
import com.devsuperior.dslearnbds.model.entity.User;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.Instant;

public class NotificationDto implements Serializable {
    private static final long serialVersionUID= 1L;

    private Long id;
    private String texto;
    private Instant moment;
    private Boolean read = false;
    private String route;
    private Long userId;

    public NotificationDto() {
    }

    public NotificationDto(Long id, String texto, Instant moment, Boolean read, String route, Long userId) {
        this.id = id;
        this.texto = texto;
        this.moment = moment;
        this.read = read;
        this.route = route;
        this.userId = userId;
    }public NotificationDto(Notification entity) {
        id = entity.getId();
        texto = entity.getTexto();
        moment = entity.getMoment();
        read = entity.isRead();
        route = entity.getRoute();
        userId = entity.getUser().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}








































