package chap04;

import java.util.Date;

/**
 * Created by sunghee on 2016. 6. 9..
 */
public class Member {

    private Long id;
    private String email;
    private String password;
    private String name;
    private Date registerDate;

    public Member(String email, String name, String password, Date registerDate) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.registerDate = registerDate;
    }

    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void changePassword(String oldPassword, String newPassword) {
        if (!password.equals(oldPassword))
            throw new IdPasswordNotMatchingException();
        this.password = newPassword;
    }
}
