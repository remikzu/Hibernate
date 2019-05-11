package pl.sda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Remigiusz Zudzin
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer productionYear;

    public Movies(String name, Integer productionYear) {
        this.name = name;
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
