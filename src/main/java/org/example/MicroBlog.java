package org.example;

import java.util.Arrays;
import java.util.List;

public class Blog {
    public static void main(String[] args) {
        Post firstPost = new Post();
        firstPost.setTitle("This is First Post");
        firstPost.setContent("This is the content of the First Post. I only wrote short content for this blog.");

        Post secondPost = new Post();
        secondPost.setTitle("This is Second Post");
        secondPost.setContent("This is the content of the Second Post. This is another content for this blog.");

        Post thirdPost = new Post();
        thirdPost.setTitle("This is Third Post");
        thirdPost.setContent("This is the content of the Third Post. I just want to say Hi!");

        List<Post> posts = Arrays.asList(
                thirdPost,
                secondPost,
                firstPost
        );

        for (Post post : posts) {
            post.show();
        }
    }

}

class Post {
    private String title = "";
    private String content = "";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void show() {
        System.out.println("===========================================");
        System.out.println(this.title);
        System.out.println(this.content);
    }
}
