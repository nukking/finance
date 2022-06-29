package jh.solutions.finance.entity;
import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name="Expense")
@Data
public class Expense {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long product_id;
    private Integer qty;
    private String product_name;

    @PostPersist
    public void onPostPersist(){

    }

    @PreRemove
    public void onPreRemove(){

    }

}
