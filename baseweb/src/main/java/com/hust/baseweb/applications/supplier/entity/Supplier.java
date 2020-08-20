package com.hust.baseweb.applications.supplier.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID supplierId;

    private String supplierName;

    private String phoneNumber;

    private String email;

    private String address;

    @CreatedDate
    private Date createdStamp;

    @LastModifiedDate
    private Date lastUpdatedStamp;
}
