package lcw.Demo.Domain;

import java.util.Date;

public class Link {
    private String linkUuid;

    private Long linkId;

    private String linkUrl;

    private String linkName;

    private String linkImage;

    private String linkTarget;

    private String linkDescription;

    private String linkVisible;

    private Long linkOwner;

    private Integer linkRating;

    private Date linkUpdated;

    private String linkRel;

    private String linkRss;

    private String linkNotes;



    public String getLinkUuid() {
        return linkUuid;
    }

    public void setLinkUuid(String linkUuid) {
        this.linkUuid = linkUuid == null ? null : linkUuid.trim();
    }

    public Long getLinkId() {
        return linkId;
    }

    public void setLinkId(Long linkId) {
        this.linkId = linkId;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName == null ? null : linkName.trim();
    }

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage == null ? null : linkImage.trim();
    }

    public String getLinkTarget() {
        return linkTarget;
    }

    public void setLinkTarget(String linkTarget) {
        this.linkTarget = linkTarget == null ? null : linkTarget.trim();
    }

    public String getLinkDescription() {
        return linkDescription;
    }

    public void setLinkDescription(String linkDescription) {
        this.linkDescription = linkDescription == null ? null : linkDescription.trim();
    }

    public String getLinkVisible() {
        return linkVisible;
    }

    public void setLinkVisible(String linkVisible) {
        this.linkVisible = linkVisible == null ? null : linkVisible.trim();
    }

    public Long getLinkOwner() {
        return linkOwner;
    }

    public void setLinkOwner(Long linkOwner) {
        this.linkOwner = linkOwner;
    }

    public Integer getLinkRating() {
        return linkRating;
    }

    public void setLinkRating(Integer linkRating) {
        this.linkRating = linkRating;
    }

    public Date getLinkUpdated() {
        return linkUpdated;
    }

    public void setLinkUpdated(Date linkUpdated) {
        this.linkUpdated = linkUpdated;
    }

    public String getLinkRel() {
        return linkRel;
    }

    public void setLinkRel(String linkRel) {
        this.linkRel = linkRel == null ? null : linkRel.trim();
    }

    public String getLinkRss() {
        return linkRss;
    }

    public void setLinkRss(String linkRss) {
        this.linkRss = linkRss == null ? null : linkRss.trim();
    }

    public String getLinkNotes() {
        return linkNotes;
    }

    public void setLinkNotes(String linkNotes) {
        this.linkNotes = linkNotes == null ? null : linkNotes.trim();
    }
}