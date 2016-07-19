package models.entity;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Card extends Model{

    @Id
    private String id;
    @Constraints.Required
    @Constraints.MaxLength(20)
    private String name;
    @Constraints.MaxLength(100)
    private String summary;
    @Constraints.MaxLength(100)
    private String thumbnail;
    private int type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public static Finder<Long, Card> find = new Finder<Long,Card>(Card.class);
}
