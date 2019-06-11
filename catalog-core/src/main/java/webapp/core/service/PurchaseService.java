package webapp.core.service;

import webapp.core.model.Book;
import webapp.core.model.Client;
import webapp.core.model.Purchase;

import java.util.List;

public interface PurchaseService {
    List<Purchase> findAll();

    Purchase updatePurchase(Long purchaseId, Book book, Client client, int quantity);

    Purchase savePurchase(Purchase purchase);

    void deletePurchase(Long purchaseId);
}
