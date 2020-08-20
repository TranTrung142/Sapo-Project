package com.hust.baseweb.applications.order.entity;

import com.hust.baseweb.entity.Status;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "status_id")
    private Status status;

    private long totalPayment;

    private int quantity;

    private Date expDeliveryDate;

    private String note;

    @LastModifiedDate
    private Date lastUpdatedStamp;

    @CreatedDate
    private Date createdStamp;
}
