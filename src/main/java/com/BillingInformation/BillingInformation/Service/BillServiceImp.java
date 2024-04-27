package com.BillingInformation.BillingInformation.Service;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BillingInformation.BillingInformation.Model.Items;
import com.BillingInformation.BillingInformation.Repository.BillRepository;


@Service
public class BillServiceImp implements BillService {

	private static final Logger logger = LoggerFactory.getLogger(BillService.class);

    @Autowired
    private BillRepository billRepository;

    public List<Items> getAllItems() {
        List<Items> items = billRepository.findAll();
        logger.info("Retrieved {} items from the database", items.size());
        return items;
    }

	@Override
	public void saveItems(Items items) {
		// TODO Auto-generated method stub
		this.billRepository.save(items);
	}
	

}
