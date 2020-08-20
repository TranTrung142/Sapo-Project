package com.hust.baseweb.applications.supplier.controller;

import com.hust.baseweb.applications.supplier.entity.Supplier;
import com.hust.baseweb.applications.supplier.model.GetListSupplierOM;
import com.hust.baseweb.applications.supplier.service.SupplierServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/supplier")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SupplierController {
    private SupplierServiceImpl supplierService;

    @PostMapping
    public ResponseEntity<?> postSupplier(@RequestBody Supplier supplier){
        try{
            return ResponseEntity.ok().body(supplierService.saveSupplier(supplier));
        }catch (Exception ex){
            return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getSupplier(@PathVariable("id") UUID id){
        try {
            return ResponseEntity.ok().body(supplierService.getSupplier(id));
        }catch (Exception ex){
            return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<?> getListSupplier(
                                            @RequestParam(value = "page", required = false) Integer page,
                                            @RequestParam(value = "limit", required = false) Integer limit,
                                            @RequestParam(value = "search", required = false) String search
                                        ){
        try {
            GetListSupplierOM listSupplierOM = new GetListSupplierOM();

            if(page != null && limit != null){
//                return ResponseEntity.ok().body(supplierService.getListSupplier(search, page, limit));
                if(search != null){
                    //listSupplierOM = supplierService.getListSupplier(page, limit, search);
//                    return ResponseEntity.ok().body(supplierService.getListSupplier(page, limit, search));
                    return ResponseEntity.ok().body(supplierService.getListSupplierBySearch(search, page, limit));
                }else {
                    listSupplierOM = supplierService.getListSupplier(page, limit );
                }
            }else {
                listSupplierOM = null;
            }
            return ResponseEntity.ok().body(listSupplierOM);
        }catch (Exception ex){
            return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
