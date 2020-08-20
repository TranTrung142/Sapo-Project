package com.hust.baseweb.applications.supplier.service;

import com.hust.baseweb.applications.supplier.entity.Supplier;
import com.hust.baseweb.applications.supplier.model.GetListSupplierOM;
import com.hust.baseweb.applications.supplier.model.ListSupplierOM;
import com.hust.baseweb.applications.supplier.repo.SupplierRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SupplierService implements SupplierServiceImpl{
    private SupplierRepo supplierRepo;

    @Override
    public Supplier saveSupplier(Supplier supplier) {
        supplierRepo.save(supplier);
        return supplier;
    }

    @Override
    public Supplier getSupplier(UUID id) {
        Supplier supplier = supplierRepo.getOne(id);
        return supplier;
    }

    @Override
    public GetListSupplierOM getListSupplier(Integer page, Integer limit) {
        GetListSupplierOM listSupplierOM = new GetListSupplierOM();

        listSupplierOM.setPage(page);

        Pageable pageable = PageRequest.of(page - 1, limit);
        List<Supplier> suppliers = supplierRepo.findAll(pageable).getContent();
        listSupplierOM.setListSupplier(suppliers);

        listSupplierOM.setTotalPage((int) Math.ceil((double) (supplierRepo.count()) / limit));

        return listSupplierOM;
    }

    @Override
    public List<Supplier> getListSupplier(Integer page, Integer limit, String search) {
        GetListSupplierOM listSupplierOM = new GetListSupplierOM();

        Pageable pageable = PageRequest.of(page - 1, limit);
        List<Supplier> suppliers = supplierRepo.findBySupplierNameContaining(search, pageable);
        listSupplierOM.setListSupplier(suppliers);
        return suppliers;
    }

    @Override
    public Page<ListSupplierOM> getListSupplierBySearch(String search, Integer page, Integer limit) {
        Pageable pageable = PageRequest.of(page - 1, limit);
        return supplierRepo.findAllBySupplierName(search, pageable);
    }

}
