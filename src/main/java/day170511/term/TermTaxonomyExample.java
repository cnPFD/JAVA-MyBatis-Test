package day170511.term;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


public class TermTaxonomyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TermTaxonomyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTermTaxonomyIdIsNull() {
            addCriterion("term_taxonomy_id is null");
            return (Criteria) this;
        }

        public Criteria andTermTaxonomyIdIsNotNull() {
            addCriterion("term_taxonomy_id is not null");
            return (Criteria) this;
        }

        public Criteria andTermTaxonomyIdEqualTo(Long value) {
            addCriterion("term_taxonomy_id =", value, "termTaxonomyId");
            return (Criteria) this;
        }

        public Criteria andTermTaxonomyIdNotEqualTo(Long value) {
            addCriterion("term_taxonomy_id <>", value, "termTaxonomyId");
            return (Criteria) this;
        }

        public Criteria andTermTaxonomyIdGreaterThan(Long value) {
            addCriterion("term_taxonomy_id >", value, "termTaxonomyId");
            return (Criteria) this;
        }

        public Criteria andTermTaxonomyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("term_taxonomy_id >=", value, "termTaxonomyId");
            return (Criteria) this;
        }

        public Criteria andTermTaxonomyIdLessThan(Long value) {
            addCriterion("term_taxonomy_id <", value, "termTaxonomyId");
            return (Criteria) this;
        }

        public Criteria andTermTaxonomyIdLessThanOrEqualTo(Long value) {
            addCriterion("term_taxonomy_id <=", value, "termTaxonomyId");
            return (Criteria) this;
        }

        public Criteria andTermTaxonomyIdIn(List<Long> values) {
            addCriterion("term_taxonomy_id in", values, "termTaxonomyId");
            return (Criteria) this;
        }

        public Criteria andTermTaxonomyIdNotIn(List<Long> values) {
            addCriterion("term_taxonomy_id not in", values, "termTaxonomyId");
            return (Criteria) this;
        }

        public Criteria andTermTaxonomyIdBetween(Long value1, Long value2) {
            addCriterion("term_taxonomy_id between", value1, value2, "termTaxonomyId");
            return (Criteria) this;
        }

        public Criteria andTermTaxonomyIdNotBetween(Long value1, Long value2) {
            addCriterion("term_taxonomy_id not between", value1, value2, "termTaxonomyId");
            return (Criteria) this;
        }

        public Criteria andTermIdIsNull() {
            addCriterion("term_id is null");
            return (Criteria) this;
        }

        public Criteria andTermIdIsNotNull() {
            addCriterion("term_id is not null");
            return (Criteria) this;
        }

        public Criteria andTermIdEqualTo(Long value) {
            addCriterion("term_id =", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdNotEqualTo(Long value) {
            addCriterion("term_id <>", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdGreaterThan(Long value) {
            addCriterion("term_id >", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdGreaterThanOrEqualTo(Long value) {
            addCriterion("term_id >=", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdLessThan(Long value) {
            addCriterion("term_id <", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdLessThanOrEqualTo(Long value) {
            addCriterion("term_id <=", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdIn(List<Long> values) {
            addCriterion("term_id in", values, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdNotIn(List<Long> values) {
            addCriterion("term_id not in", values, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdBetween(Long value1, Long value2) {
            addCriterion("term_id between", value1, value2, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdNotBetween(Long value1, Long value2) {
            addCriterion("term_id not between", value1, value2, "termId");
            return (Criteria) this;
        }

        public Criteria andTaxonomyIsNull() {
            addCriterion("taxonomy is null");
            return (Criteria) this;
        }

        public Criteria andTaxonomyIsNotNull() {
            addCriterion("taxonomy is not null");
            return (Criteria) this;
        }

        public Criteria andTaxonomyEqualTo(String value) {
            addCriterion("taxonomy =", value, "taxonomy");
            return (Criteria) this;
        }

        public Criteria andTaxonomyNotEqualTo(String value) {
            addCriterion("taxonomy <>", value, "taxonomy");
            return (Criteria) this;
        }

        public Criteria andTaxonomyGreaterThan(String value) {
            addCriterion("taxonomy >", value, "taxonomy");
            return (Criteria) this;
        }

        public Criteria andTaxonomyGreaterThanOrEqualTo(String value) {
            addCriterion("taxonomy >=", value, "taxonomy");
            return (Criteria) this;
        }

        public Criteria andTaxonomyLessThan(String value) {
            addCriterion("taxonomy <", value, "taxonomy");
            return (Criteria) this;
        }

        public Criteria andTaxonomyLessThanOrEqualTo(String value) {
            addCriterion("taxonomy <=", value, "taxonomy");
            return (Criteria) this;
        }

        public Criteria andTaxonomyLike(String value) {
            addCriterion("taxonomy like", value, "taxonomy");
            return (Criteria) this;
        }

        public Criteria andTaxonomyNotLike(String value) {
            addCriterion("taxonomy not like", value, "taxonomy");
            return (Criteria) this;
        }

        public Criteria andTaxonomyIn(List<String> values) {
            addCriterion("taxonomy in", values, "taxonomy");
            return (Criteria) this;
        }

        public Criteria andTaxonomyNotIn(List<String> values) {
            addCriterion("taxonomy not in", values, "taxonomy");
            return (Criteria) this;
        }

        public Criteria andTaxonomyBetween(String value1, String value2) {
            addCriterion("taxonomy between", value1, value2, "taxonomy");
            return (Criteria) this;
        }

        public Criteria andTaxonomyNotBetween(String value1, String value2) {
            addCriterion("taxonomy not between", value1, value2, "taxonomy");
            return (Criteria) this;
        }

        public Criteria andParentIsNull() {
            addCriterion("parent is null");
            return (Criteria) this;
        }

        public Criteria andParentIsNotNull() {
            addCriterion("parent is not null");
            return (Criteria) this;
        }

        public Criteria andParentEqualTo(Long value) {
            addCriterion("parent =", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotEqualTo(Long value) {
            addCriterion("parent <>", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentGreaterThan(Long value) {
            addCriterion("parent >", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentGreaterThanOrEqualTo(Long value) {
            addCriterion("parent >=", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLessThan(Long value) {
            addCriterion("parent <", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLessThanOrEqualTo(Long value) {
            addCriterion("parent <=", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentIn(List<Long> values) {
            addCriterion("parent in", values, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotIn(List<Long> values) {
            addCriterion("parent not in", values, "parent");
            return (Criteria) this;
        }

        public Criteria andParentBetween(Long value1, Long value2) {
            addCriterion("parent between", value1, value2, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotBetween(Long value1, Long value2) {
            addCriterion("parent not between", value1, value2, "parent");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Long value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Long value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Long value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Long value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Long value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Long value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Long> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Long> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Long value1, Long value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Long value1, Long value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}