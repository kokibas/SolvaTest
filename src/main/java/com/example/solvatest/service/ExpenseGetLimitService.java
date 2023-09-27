package com.example.solvatest.service;

import com.example.solvatest.entity.ExpenseLimit;
import com.example.solvatest.repository.ExpenseLimitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.YearMonth;

@Service
public class ExpenseLimitService {
    @Autowired
    private ExpenseLimitRepository expenseLimitRepository;

    public ExpenseLimit getExpenseLimit(YearMonth yearMonth){
        return expenseLimitRepository.findByYearMonth(yearMonth);
    }
}
