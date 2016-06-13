package chap04;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sungheelee on 2016. 6. 12..
 */
public class MemberInfoPrinter {

    @Autowired
    private MemberDao memDao;
    private MemberPrinter printer;

    public void setMemberDao(MemberDao memberDao) {
        this.memDao = memberDao;
    }

    @Autowired
    public void setPrinter(MemberPrinter printer) {
        this.printer = printer;
    }

    public void printMemberInfo(String email) {
        Member member = memDao.selectByEmail(email);
        if (member == null) {
            System.out.println("데이터없은 \n");
            return;
        }
        printer.print(member);
        System.out.println();
    }
}
