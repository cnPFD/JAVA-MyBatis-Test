package day170511.term;

import java.io.Serializable;


/**
 * @author 
 */

public class Terms implements Serializable {
    private Long termId;

    private String name;

    private String slug;

    private Long termGroup;

    private static final long serialVersionUID = 1L;

    public Long getTermId() {
        return termId;
    }

    public void setTermId(Long termId) {
        this.termId = termId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Long getTermGroup() {
        return termGroup;
    }

    public void setTermGroup(Long termGroup) {
        this.termGroup = termGroup;
    }
}