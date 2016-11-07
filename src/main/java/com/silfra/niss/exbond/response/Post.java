package com.silfra.niss.exbond.response;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Post {
    private Integer postId;
    private String title;
    private String details;
    private Integer userId;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
