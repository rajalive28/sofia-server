package com.grabpay.sofia.repository;

import com.grabpay.sofia.entity.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Long, Transactions> {
}
