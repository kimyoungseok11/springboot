package com.example.core.demo.repository;

import com.example.core.demo.domain.Member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
