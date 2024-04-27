package com.BillingInformation.BillingInformation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BillingInformation.BillingInformation.Model.Items;

@Repository
public interface BillRepository extends JpaRepository<Items, Integer> {

}
