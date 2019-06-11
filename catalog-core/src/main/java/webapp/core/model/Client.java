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
public class Client extends BaseEntity<Long> {
    @Column(name = "name", nullable = false)
    private String name;

    @Override
    public String toString() {
        return "Base{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
