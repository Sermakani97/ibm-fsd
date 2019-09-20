package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Seller;
@Repository
public interface SellerRepository extends CrudRepository<Seller,Long>{

}
