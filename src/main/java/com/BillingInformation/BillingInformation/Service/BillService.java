package com.BillingInformation.BillingInformation.Service;

import java.util.List;

import com.BillingInformation.BillingInformation.Model.Items;

public interface BillService {
	List<Items> getAllItems();
	public void saveItems(Items items);

}
