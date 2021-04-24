package com.example.wheelmanager.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "vehicles")

public class Vehicle extends AuditModel{

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String vehicleName;

    @NotNull
    private String imageUrl;

    @NotNull
    private Integer calification;

    @NotNull
    private String description;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "brand_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Brand brand;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "status_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "vehicle_type_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private VehicleType vehicleType;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private User user;

    public Long getId() {
        return id;
    }

    public Vehicle setId(Long id) {
        this.id = id;
        return this;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public Vehicle setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Vehicle setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Integer getCalification() {
        return calification;
    }

    public Vehicle setCalification(Integer calification) {
        this.calification = calification;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Vehicle setDescription(String description) {
        this.description = description;
        return this;
    }

}
