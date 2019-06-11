package webapp.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import webapp.core.model.Book;
import webapp.core.model.Client;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PurchaseDto extends BaseDto{

    private Book book;
    private Client client;
    private Integer quantity;

    @Override
    public String toString() {
        return "PurchaseModel{" +
                "Book='" + book + '\'' +
                ", Quantity='" + quantity + '\'' +
                ", Client='" + client + '\'' +
                "} " + super.toString();
    }
}
