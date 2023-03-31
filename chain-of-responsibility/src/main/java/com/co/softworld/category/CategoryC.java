package com.co.softworld.category;

import lombok.extern.slf4j.Slf4j;

import static com.co.softworld.constants.Salary.MINIMUM_SALARY;

@Slf4j
public class CategoryC implements ApprovedChain {

    private ApprovedChain approvedChain;

    @Override
    public void setNext(ApprovedChain approvedChain) {
        this.approvedChain = approvedChain;
    }

    @Override
    public ApprovedChain getNext() {
        return approvedChain;
    }

    @Override
    public void categoryRequest(int salary) {
        if (salary > (5 * MINIMUM_SALARY))
            log.info("category C");
    }
}
