package chap04;

/**
 * Created by sungheelee on 2016. 6. 12..
 */
public class MemberPrinter {

    public void print(Member member) {
        System.out.printf("회원 정보: 아이디%d, 이메일=%s, 이름=%s, 등록일%tF\n",
        member.getId(), member.getEmail(), member.getName(), member.getRegisterDate());
    }
}
