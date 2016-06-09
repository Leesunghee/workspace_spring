package chap03;

/**
 * Created by sunghee on 2016. 6. 9..
 */
public class Main {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();
        MemberRegisterService regSvc = new MemberRegisterService(memberDao);
        ChangePasswordService pwdSvc = new ChangePasswordService(memberDao);
    }
}
