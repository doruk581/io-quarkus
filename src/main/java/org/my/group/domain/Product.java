package org.my.group.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Product extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_PROD")
    @SequenceGenerator(name = "SEQ_PROD", sequenceName = "SEQ_PROD", allocationSize = 1)
    private Long id;

    public String name;
    public String sector;
    public String brand;
    public Double price;

    public Product(){}

    public Product(String name, String sector, String brand, Double price) {
        this.name = name;
        this.sector = sector;
        this.brand = brand;
        this.price = price;
    }
}
