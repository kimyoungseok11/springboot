package com.example.core.demo.config;

import com.example.core.demo.discount.DiscountPolicy;
import com.example.core.demo.discount.FixDiscountPolicy;
import com.example.core.demo.discount.RateDiscountPolicy;
import com.example.core.demo.repository.MemberRepository;
import com.example.core.demo.repository.MemoryMemberRepository;
import com.example.core.demo.service.MemberService;
import com.example.core.demo.service.MemberServiceImpl;
import com.example.core.demo.service.OrderService;
import com.example.core.demo.service.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(),discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
//        return new RateDiscountPolicy();
    }
}
