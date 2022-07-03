package jh.solutions.finance.entity;
import javax.persistence.*;

import lombok.Data;

import java.util.Date;

@Entity
@Table(name="Account_Book")
@Data
public class AccountBook {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer account_book_id;
    private String account_book_name;
    private Date start_date;
    private Date end_date;
    private Long initial_amount;
    private Integer reference_account_book_id;
    private Boolean is_closed;
    private Integer income_use_level;
    private String income_level1_name;
    private String income_level2_name;
    private String income_level3_name;
    private Integer expense_use_level;
    private String expense_level1_name;
    private String expense_level2_name;
    private String expense_level3_name;

    @PostPersist
    public void onPostPersist(){

    }

    @PreRemove
    public void onPreRemove(){

    }

}
