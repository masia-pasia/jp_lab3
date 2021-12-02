import java.util.Objects;

public class User {
    private final String nickname;
    private final String password;

    public User(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nickname, user.nickname) && Objects.equals(password, user.password);
    }

}
