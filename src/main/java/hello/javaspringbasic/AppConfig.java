package hello.javaspringbasic;

import hello.javaspringbasic.discount.FixDiscountPolicy;
import hello.javaspringbasic.member.MemberService;
import hello.javaspringbasic.member.MemberServiceImpl;
import hello.javaspringbasic.member.MemoryMemberRepository;
import hello.javaspringbasic.order.OrderService;
import hello.javaspringbasic.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
