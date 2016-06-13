package chap04;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by sunghee on 2016. 6. 9..
 */
public class MemberRegisterService {
    private MemberDao memberDao;

    @Autowired
    public MemberRegisterService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public MemberRegisterService() {
    }

    public void regist(RegisterRequest req) {
        Member member = memberDao.selectByEmail(req.getEmail());
        if (member != null) {
            throw new AlreadyExistingMemberException("dup email " + req.getEmail());
        }
        Member newMember = new Member(req.getEmail(), req.getName(), req.getPassword(), new Date());

        memberDao.insert(newMember);
    }
}
