package com.hust.baseweb.applications.supplier.model;

import java.util.Date;
import java.util.UUID;

public interface ListSupplierOM {
     UUID getSupplierId();

     String getSupplierName();

     String getPhoneNumber();

     String getEmail();

     String getAddress();
}
