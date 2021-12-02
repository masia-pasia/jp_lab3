import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Accounts{
    private final List<User> UsersList = new ArrayList();


public void creatingAccounts(){
    User firstUser = new User("joanna","annaoj");
    User secondUser = new User("annuszka", "krzysztof");
    User thirdUser = new User("apollo", "atena");
    User fourthUser = new User("colombiana", "megusta");
    User fifthUser = new User("sanah", "kolonska123");

    UsersList.add(firstUser);
    UsersList.add(secondUser);
    UsersList.add(thirdUser);
    UsersList.add(fourthUser);
    UsersList.add(fifthUser);
}

public boolean checkingAccounts(User a){
    for(var user:UsersList){
        if(a.equals(user))  return true;
    }
    return false;
}

}
