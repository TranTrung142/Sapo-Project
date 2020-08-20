package com.hust.baseweb.applications.supplier.model;

import com.hust.baseweb.applications.supplier.entity.Supplier;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class GetListSupplierOM {
    private Integer page;
    private Integer totalPage;
    private List<Supplier> listSupplier = new ArrayList<Supplier>();
}
