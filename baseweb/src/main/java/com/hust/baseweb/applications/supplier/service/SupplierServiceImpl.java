package com.hust.baseweb.applications.supplier.service;

import com.hust.baseweb.applications.supplier.entity.Supplier;
import com.hust.baseweb.applications.supplier.model.GetListSupplierOM;
import com.hust.baseweb.applications.supplier.model.ListSupplierOM;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.UUID;

public interface SupplierServiceImpl {
    Supplier saveSupplier(Supplier supplier);
    Supplier getSupplier(UUID id);
    GetListSupplierOM getListSupplier(Integer page, Integer limit);
    List<Supplier> getListSupplier(Integer page, Integer limit, String search);
    Page<ListSupplierOM> getListSupplierBySearch(String search, Integer page, Integer limit);
}
