package ck.MyBatis;

import java.util.Date;

/**
 * Created by soft01 on 2017/5/10.
 */
public class User {
    private String link_id;
    private String link_url;
    private String link_name;
    private String link_image;
    private String link_description;
    private String link_visible;
    private String link_owner;
    private int link_rating;
    private Date link_updated;
    private String link_rel;
    private String link_notes;
    private String link_rss;

    public User() {
    }

    public User(String link_id, String link_url, String link_name, String link_image, String link_description, String link_visible, String link_owner, int link_rating, Date link_updated, String link_rel, String link_notes, String link_rss) {
        this.link_id = link_id;
        this.link_url = link_url;
        this.link_name = link_name;
        this.link_image = link_image;
        this.link_description = link_description;
        this.link_visible = link_visible;
        this.link_owner = link_owner;
        this.link_rating = link_rating;
        this.link_updated = link_updated;
        this.link_rel = link_rel;
        this.link_notes = link_notes;
        this.link_rss = link_rss;
    }

    public String getLink_id() {
        return link_id;
    }

    public void setLink_id(String link_id) {
        this.link_id = link_id;
    }

    public String getLink_url() {
        return link_url;
    }

    public void setLink_url(String link_url) {
        this.link_url = link_url;
    }

    public String getLink_name() {
        return link_name;
    }

    public void setLink_name(String link_name) {
        this.link_name = link_name;
    }

    public String getLink_image() {
        return link_image;
    }

    public void setLink_image(String link_image) {
        this.link_image = link_image;
    }

    public String getLink_description() {
        return link_description;
    }

    public void setLink_description(String link_description) {
        this.link_description = link_description;
    }

    public String getLink_visible() {
        return link_visible;
    }

    public void setLink_visible(String link_visible) {
        this.link_visible = link_visible;
    }

    public String getLink_owner() {
        return link_owner;
    }

    public void setLink_owner(String link_owner) {
        this.link_owner = link_owner;
    }

    public int getLink_rating() {
        return link_rating;
    }

    public void setLink_rating(int link_rating) {
        this.link_rating = link_rating;
    }

    public Date getLink_updated() {
        return link_updated;
    }

    public void setLink_updated(Date link_updated) {
        this.link_updated = link_updated;
    }

    public String getLink_rel() {
        return link_rel;
    }

    public void setLink_rel(String link_rel) {
        this.link_rel = link_rel;
    }

    public String getLink_notes() {
        return link_notes;
    }

    public void setLink_notes(String link_notes) {
        this.link_notes = link_notes;
    }

    public String getLink_rss() {
        return link_rss;
    }

    public void setLink_rss(String link_rss) {
        this.link_rss = link_rss;
    }
}