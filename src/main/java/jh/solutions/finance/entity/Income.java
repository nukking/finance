package jh.solutions.finance.entity;
import javax.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Income")
@Data
public class Income {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer income_id;
    private Integer account_book_id;
    private Date income_date;
    private Integer income_level_id;
    private String giver_name1;
    private String giver_name2;
    private Long income_amount;
    private String note;
    private String giver_class;
    private String income_method;
    private Date created_date;
    private String created_name;
    private Date updated_date;
    private String updated_name;
    private Date checked_date;
    private Boolean is_checked;

//    @PostPersist
//    public void onPostPersist(){
//    }
//
//    @PreRemove
//    public void onPreRemove(){
//    }
}
