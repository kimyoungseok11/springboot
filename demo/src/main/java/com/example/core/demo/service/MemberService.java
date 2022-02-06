package com.example.core.demo.service;

import com.example.core.demo.domain.Member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
