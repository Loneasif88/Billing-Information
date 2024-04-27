package com.BillingInformation.BillingInformation.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.BillingInformation.BillingInformation.Model.Items;
import com.BillingInformation.BillingInformation.Service.BillServiceImp;


@Controller
public class BillController {

	@Autowired
    BillServiceImp billService;

//	 PdfGenerationService pdfGenerationService;
    // GET request to show the add items page
    @GetMapping("/add-items")
    public String showItems(Model model) {
        Items items = new Items();
        model.addAttribute("items", items);
        return "itemList";
    }
    
    // POST request to save items
    @PostMapping("/save-items")
    public String saveItems(@ModelAttribute("items") Items items) {
        // Save items to database
        billService.saveItems(items);
        return "redirect:/show-bill"; // Redirect to the show-bill page after saving
    }

    // GET request to show the bill page
    @GetMapping("/show-bill")
    public String viewBill(Model model) {
        model.addAttribute("ItemsList", billService.getAllItems());
        return "index";
    }
    
    //post method for invoice generator
    

}
