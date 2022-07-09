package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;
//    MemberService memberService = new MemberServiceImpl();

    @BeforeEach
    public void beforeEach(){ // beforeEach가 있으면 테스트 전에 먼저 실행되고 테스트가 실행됨
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
    }

    @Test
    void join(){
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
