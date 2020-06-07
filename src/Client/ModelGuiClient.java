package Client;

import java.util.HashSet;
import java.util.Set;

public class ModelGuiClient {
    //в модели лиентского приложения хранится множетство подключившихся пользователей
    private Set<String> users = new HashSet<>();

    protected Set<String> getUsers() {
        return users;
    }

    protected void addUser(String nameUser) {
        users.add(nameUser);
    }

    protected void removeUser(String nameUser) {
        users.remove(nameUser);
    }

    protected void setUsers(Set<String> users) {
        this.users = users;
    }
}
