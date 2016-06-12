package chap03;

import java.util.Collection;

/**
 * Created by sungheelee on 2016. 6. 12..
 */
public class MemberListPrinter {
    private MemberDao memberDao;
    private MemberPrinter printer;

    public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
        this.memberDao = memberDao;
        this.printer = printer;
    }

    public void printAll() {
        Collection<Member> members = memberDao.selectAll();
        for (Member m : members) {
            printer.print(m);
        }
    }
}
