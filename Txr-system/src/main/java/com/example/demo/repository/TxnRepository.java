package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Txn;

@Repository
public interface TxnRepository extends JpaRepository<Txn, Integer> {

}
