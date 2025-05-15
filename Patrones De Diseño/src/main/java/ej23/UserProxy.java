package ej23;

import java.util.List;

public class UserProxy extends User implements PersistableUser{

    public UserProxy(String username, String email) {
        super(username, email);
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public List<Post> getPosts() {
        if (super.getPosts() == null){
            super.setPosts(new PostRepository().findPostsByUsername(super.getUsername()));
        }
        return super.getPosts();
    }
}
