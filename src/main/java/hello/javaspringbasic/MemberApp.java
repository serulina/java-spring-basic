package hello.javaspringbasic;

import hello.javaspringbasic.member.Grade;
import hello.javaspringbasic.member.Member;
import hello.javaspringbasic.member.MemberService;
import hello.javaspringbasic.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}
