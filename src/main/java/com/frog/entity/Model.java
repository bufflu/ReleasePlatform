package com.frog.entity;

import com.frog.verifybean.VerifiableBean;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author bufflu
 * @since 2019-09-23
 */
@VerifiableBean(exclude = {"id", "date"})
public class Model implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String port;

    private String description;

    private String owner;

    private LocalDateTime date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Model{" +
            "id=" + id +
            ", name=" + name +
            ", port=" + port +
            ", description=" + description +
            ", owner=" + owner +
            ", date=" + date +
        "}";
    }
}
