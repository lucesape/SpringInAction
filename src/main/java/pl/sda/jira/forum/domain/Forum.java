package pl.sda.jira.forum.domain;

import com.sun.javafx.beans.IDProperty;
import pl.sda.jira.forum.dto.ForumDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Forum {
    @Id
    @GeneratedValue
    private String forumId;
    private String name;

    public String getForumId() {
        return forumId;
    }

    public String getName() {
        return name;
    }

    public Forum() {
    }

    public Forum(String name, String forumId) {
        this.forumId = forumId;
        this.name = name;
    }

    public Forum(String name) {
        this.name = name;
    }

    public ForumDto asDto() {
        ForumDto forumDto = new ForumDto(forumId);
        forumDto.setName(name);
        return forumDto;
    }

    @Override
    public String toString() {
        return name + " " + forumId;
    }

    public void changeName(String name) {
        this.name = name;
    }
}
