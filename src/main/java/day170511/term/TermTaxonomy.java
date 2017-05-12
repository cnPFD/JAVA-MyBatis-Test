package day170511.term;

import java.io.Serializable;



/**
 * @author 
 */

public class TermTaxonomy implements Serializable {

    private Long termTaxonomyId;
    private Long termId;
    private String taxonomy;
    private Long parent;
    private Long count;
    private String description;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "TermTaxonomy{" +
                "termTaxonomyId=" + termTaxonomyId +
                ", termId=" + termId +
                ", taxonomy='" + taxonomy + '\'' +
                ", parent=" + parent +
                ", count=" + count +
                ", description='" + description + '\'' +
                '}';
    }

    public TermTaxonomy(){}

    public TermTaxonomy(Long termTaxonomyId, Long termId, String taxonomy, Long parent, Long count, String description) {
        this.termTaxonomyId = termTaxonomyId;
        this.termId = termId;
        this.taxonomy = taxonomy;
        this.parent = parent;
        this.count = count;
        this.description = description;
    }

    public Long getTermTaxonomyId() {
        return termTaxonomyId;
    }

    public void setTermTaxonomyId(Long termTaxonomyId) {
        this.termTaxonomyId = termTaxonomyId;
    }

    public Long getTermId() {
        return termId;
    }

    public void setTermId(Long termId) {
        this.termId = termId;
    }

    public String getTaxonomy() {
        return taxonomy;
    }

    public void setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}