package webapp.core.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class Book extends BaseEntity<Long> {
    @Column(name = "bookname", nullable = false)
    private String bookname;
    @Column(name = "author", nullable = false)
    private String author;
    @Column(name = "price", nullable = false)
    private double price;

    @Override
    public String toString() {
        return "Base{" +
                "bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                "} " + super.toString();
    }
}
