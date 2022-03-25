package hello.core.member;

public class MemberServiceImpl implements MemberService{

    //추상화에도 의존, 구체화에도 의존 (DIP 위반)
    //구현체가 변경될 때 마다 Client 코드를 변경해야하기 때문에 OCP도 위반
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
