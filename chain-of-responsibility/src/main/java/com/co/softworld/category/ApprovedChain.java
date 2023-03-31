package com.co.softworld.category;

public interface ApprovedChain {
    void setNext(ApprovedChain approvedChain);
    ApprovedChain getNext();
    void categoryRequest(int salary);
}
