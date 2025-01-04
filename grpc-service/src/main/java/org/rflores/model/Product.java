package org.rflores.model;

import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String name;
    private String color;
    private String gas;

    @Column(name = "`year`") // Escape the reserved keyword
    private Integer year;

    private String description;
    private Long price;

    @Column(name = "product_line_id") // Map camelCase to snake_case
    private String productLineId; // Use camelCase in Java
}



