package Algorithims;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Important_OOPs {
    public static void main(String[] args) {
        Set<User> set = new HashSet<>();
        set.add(new User(1));
        set.add(new User(1));
        set.add(new User(1));
        set.add(new User(1));
        set.add(new User(1));

        for (User user : set) {
            System.out.println(user.val);
        }
    }

    static class User {
        int val;

        User(int val) {
            this.val = val;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof User user)) return false;
            return val == user.val;
        }

        @Override
        public int hashCode() {
            return Objects.hash(val);
        }
    }
}
