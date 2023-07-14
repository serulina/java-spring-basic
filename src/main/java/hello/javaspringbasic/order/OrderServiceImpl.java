package hello.javaspringbasic.order;

import hello.javaspringbasic.discount.DiscountPolicy;
import hello.javaspringbasic.discount.FixDiscountPolicy;
import hello.javaspringbasic.member.Member;
import hello.javaspringbasic.member.MemberRepository;
import hello.javaspringbasic.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
