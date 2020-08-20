package com.hust.baseweb.applications.order.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CreateProductIM {
    private String status;

    private long totalPayment;

    private int quantity;

    private String note;

}
