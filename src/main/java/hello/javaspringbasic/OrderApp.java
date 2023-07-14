package hello.javaspringbasic;

import hello.javaspringbasic.member.Grade;
import hello.javaspringbasic.member.Member;
import hello.javaspringbasic.member.MemberService;
import hello.javaspringbasic.member.MemberServiceImpl;
import hello.javaspringbasic.order.Order;
import hello.javaspringbasic.order.OrderService;
import hello.javaspringbasic.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("Order = " + order);
    }
}
