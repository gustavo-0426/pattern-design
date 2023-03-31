package com.co.softworld.category;

public class Category implements ApprovedChain {

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
        CategoryA categoryA = new CategoryA();
        this.approvedChain = categoryA;

        CategoryB categoryB = new CategoryB();
        categoryA.setNext(categoryB);

        CategoryC categoryC = new CategoryC();
        categoryB.setNext(categoryC);

        approvedChain.categoryRequest(salary);
    }
}
