package com.example.core.demo.service;

import com.example.core.demo.discount.DiscountPolicy;
import com.example.core.demo.discount.FixDiscountPolicy;
import com.example.core.demo.domain.Member;
import com.example.core.demo.domain.Order;
import com.example.core.demo.repository.MemberRepository;
import com.example.core.demo.repository.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository;

    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }
//    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member,itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
