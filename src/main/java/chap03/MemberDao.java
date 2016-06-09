package chap03;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunghee on 2016. 6. 9..
 */
public class MemberDao {

    private static long nextId = 0;

    private Map<String, Member> map = new HashMap<>();

    public Member selectByEmail(String email) {
        return map.get(email);
    }

    public void insert(Member member) {
        member.setId(++nextId);
        map.put(member.getEmail(), member);
    }

    public void update(Member member) {
        map.put(member.getEmail(), member);
    }




}