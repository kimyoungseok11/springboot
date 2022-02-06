package com.example.core.demo.discount;

import com.example.core.demo.domain.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
