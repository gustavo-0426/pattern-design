package com.co.softworld;

import com.co.softworld.category.ApprovedChain;
import com.co.softworld.category.Category;
import com.co.softworld.category.CategoryA;
import com.co.softworld.category.CategoryB;

public class ChainOfResponsibility {

    public static void main(String[] args) {
        Category category = new Category();
        category.categoryRequest(6000000);
    }

}
