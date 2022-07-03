package jh.solutions.finance.entity;
import javax.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Expense")
@Data
public class Expense {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer expense_id;
    private Integer account_book_id;
    private Date expense_date;
    private Integer expense_level_id;
    private Long expense_amount;
    private String note;
    private String request_name;
    private String expense_method;
    private Date created_date;
    private String created_name;
    private Date updated_date;
    private String updated_name;
    private Date checked_date;
    private Boolean is_checked;

//    @PostPersist
//    public void onPostPersist(){
//
//    }
//
//    @PreRemove
//    public void onPreRemove(){
//
//    }

}