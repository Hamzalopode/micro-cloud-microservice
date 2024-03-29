package me.ahmouny.billingservice.web;

import lombok.AllArgsConstructor;
import me.ahmouny.billingservice.entities.Bill;
import me.ahmouny.billingservice.entities.ProductItem;
import me.ahmouny.billingservice.feign.CustomerRestClient;
import me.ahmouny.billingservice.feign.ProductItemRestClient;
import me.ahmouny.billingservice.models.Customer;
import me.ahmouny.billingservice.models.Product;
import me.ahmouny.billingservice.repositories.BillRepository;
import me.ahmouny.billingservice.repositories.ProductItemRepository;

import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@RestController @AllArgsConstructor
public class BillingRestController {

    private BillRepository br;
    private ProductItemRepository pir;
    private CustomerRestClient crc;
    private ProductItemRestClient prc;
    @GetMapping("/bills/{id}")
    public Bill getBill(@PathVariable Long id)
    {
        Bill bill = br.findById(id).orElseThrow(() -> new RuntimeException(String.format("bill - %s - not found", id)));
        Customer customer = crc.getCustomer(bill.getCustomerId());
        bill.getProductItems().forEach(p -> {
            Product product = prc.getProductById(p.getProductId());
            p.setProduct(product);
        });
        bill.setCustomer(customer);
        return bill;
    }

    @GetMapping("/bills")
    public Collection<Bill> getBills()
    {
        Collection<Bill> bills = br.findAll();
        bills.forEach( b -> {
            Customer customer = crc.getCustomer(b.getCustomerId());
            b.setCustomer(customer);
            b.getProductItems().forEach(p -> {
                Product product = prc.getProductById(p.getProductId());
                p.setProduct(product);
            });
        });

        return bills;
    }
}
