package jh.solutions.finance.repository;

import jh.solutions.finance.entity.Expense;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ExpenseRepository extends PagingAndSortingRepository<Expense, Long> {

}

