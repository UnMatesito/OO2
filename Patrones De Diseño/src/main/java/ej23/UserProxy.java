package ej23;

import java.util.List;

public class UserProxy implements PersistableUser{
    private User user;

    public UserProxy(User user) {
        this.user = user;
        this.user.setPosts(null);
    }

    @Override
    public String getUsername() {
        return this.user.getUsername();
    }

    @Override
    public String getEmail() {
        return this.user.getEmail();
    }

    @Override
    public List<Post> getPosts() {
        if (this.user.getPosts() == null){
            this.user.setPosts(new PostRepository().findPostsByUsername(this.user.getUsername()));
        }
        return this.user.getPosts();
    }
}
