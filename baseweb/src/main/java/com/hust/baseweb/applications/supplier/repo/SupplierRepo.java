package com.hust.baseweb.applications.supplier.repo;

import com.hust.baseweb.applications.supplier.entity.Supplier;
import com.hust.baseweb.applications.supplier.model.ListSupplierOM;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SupplierRepo extends JpaRepository<Supplier, UUID> {
    List<Supplier> findBySupplierNameContaining(String search, Pageable pageable);

    @Query(value = "select supplier_id supplierId, supplier_name supplierName, phone_number phoneNumber,email, address " +
            "from supplier s where supplier_name like %?1 and email like %?1 and phone_number like %?1 and address like %?1",
    countQuery = "select count(*) from supplier s where supplier_name like %?1 and email like %?1 and phone_number like %?1 and address like %?1",
    nativeQuery = true)
    Page<ListSupplierOM> findAllBySupplierName(String search, Pageable pageable);
//    @Query(value = "select supplier_id supplierId, supplier_name supplierName, phone_number phoneNumber," +
//        "from supplier s where supplier_name like ?1 ",
//        countQuery = "select count(*) from supplier s where supplier_name like ?1",
//        nativeQuery = true)

}
//where supplier_name like %?1 and email like %?1 and phone_number like %?1 and address like %?1