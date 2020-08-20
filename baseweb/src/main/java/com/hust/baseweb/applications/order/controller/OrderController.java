package com.hust.baseweb.applications.order.controller;

import com.hust.baseweb.applications.order.entity.Orders;
import com.hust.baseweb.applications.order.model.CreateProductIM;
import com.hust.baseweb.applications.order.repo.OrderRepo;
import com.hust.baseweb.entity.Status;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/order")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class OrderController {
    private OrderRepo orderRepo;

    @PostMapping
    public ResponseEntity<?> createOrder(@RequestBody CreateProductIM createProductIM) {
        Orders order = new Orders();
        Status status = new Status();

        status.setId(createProductIM.getStatus());
        order.setStatus(status);
        order.setTotalPayment(createProductIM.getTotalPayment());
        order.setQuantity(createProductIM.getQuantity());
        order.setNote(createProductIM.getNote());
        order.setExpDeliveryDate(new Date());

        return ResponseEntity.ok().body(orderRepo.save(order));
    }
}
