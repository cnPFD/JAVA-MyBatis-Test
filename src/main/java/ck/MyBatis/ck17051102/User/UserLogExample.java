package ck.MyBatis.ck17051102.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public class UserLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public UserLogExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserGuidIsNull() {
            addCriterion("user_guid is null");
            return (Criteria) this;
        }

        public Criteria andUserGuidIsNotNull() {
            addCriterion("user_guid is not null");
            return (Criteria) this;
        }

        public Criteria andUserGuidEqualTo(String value) {
            addCriterion("user_guid =", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidNotEqualTo(String value) {
            addCriterion("user_guid <>", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidGreaterThan(String value) {
            addCriterion("user_guid >", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidGreaterThanOrEqualTo(String value) {
            addCriterion("user_guid >=", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidLessThan(String value) {
            addCriterion("user_guid <", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidLessThanOrEqualTo(String value) {
            addCriterion("user_guid <=", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidLike(String value) {
            addCriterion("user_guid like", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidNotLike(String value) {
            addCriterion("user_guid not like", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidIn(List<String> values) {
            addCriterion("user_guid in", values, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidNotIn(List<String> values) {
            addCriterion("user_guid not in", values, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidBetween(String value1, String value2) {
            addCriterion("user_guid between", value1, value2, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidNotBetween(String value1, String value2) {
            addCriterion("user_guid not between", value1, value2, "userGuid");
            return (Criteria) this;
        }

        public Criteria andOpCodeIsNull() {
            addCriterion("op_code is null");
            return (Criteria) this;
        }

        public Criteria andOpCodeIsNotNull() {
            addCriterion("op_code is not null");
            return (Criteria) this;
        }

        public Criteria andOpCodeEqualTo(Integer value) {
            addCriterion("op_code =", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeNotEqualTo(Integer value) {
            addCriterion("op_code <>", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeGreaterThan(Integer value) {
            addCriterion("op_code >", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_code >=", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeLessThan(Integer value) {
            addCriterion("op_code <", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeLessThanOrEqualTo(Integer value) {
            addCriterion("op_code <=", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeIn(List<Integer> values) {
            addCriterion("op_code in", values, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeNotIn(List<Integer> values) {
            addCriterion("op_code not in", values, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeBetween(Integer value1, Integer value2) {
            addCriterion("op_code between", value1, value2, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("op_code not between", value1, value2, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpResultIsNull() {
            addCriterion("op_result is null");
            return (Criteria) this;
        }

        public Criteria andOpResultIsNotNull() {
            addCriterion("op_result is not null");
            return (Criteria) this;
        }

        public Criteria andOpResultEqualTo(Integer value) {
            addCriterion("op_result =", value, "opResult");
            return (Criteria) this;
        }

        public Criteria andOpResultNotEqualTo(Integer value) {
            addCriterion("op_result <>", value, "opResult");
            return (Criteria) this;
        }

        public Criteria andOpResultGreaterThan(Integer value) {
            addCriterion("op_result >", value, "opResult");
            return (Criteria) this;
        }

        public Criteria andOpResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_result >=", value, "opResult");
            return (Criteria) this;
        }

        public Criteria andOpResultLessThan(Integer value) {
            addCriterion("op_result <", value, "opResult");
            return (Criteria) this;
        }

        public Criteria andOpResultLessThanOrEqualTo(Integer value) {
            addCriterion("op_result <=", value, "opResult");
            return (Criteria) this;
        }

        public Criteria andOpResultIn(List<Integer> values) {
            addCriterion("op_result in", values, "opResult");
            return (Criteria) this;
        }

        public Criteria andOpResultNotIn(List<Integer> values) {
            addCriterion("op_result not in", values, "opResult");
            return (Criteria) this;
        }

        public Criteria andOpResultBetween(Integer value1, Integer value2) {
            addCriterion("op_result between", value1, value2, "opResult");
            return (Criteria) this;
        }

        public Criteria andOpResultNotBetween(Integer value1, Integer value2) {
            addCriterion("op_result not between", value1, value2, "opResult");
            return (Criteria) this;
        }

        public Criteria andOpDateIsNull() {
            addCriterion("op_date is null");
            return (Criteria) this;
        }

        public Criteria andOpDateIsNotNull() {
            addCriterion("op_date is not null");
            return (Criteria) this;
        }

        public Criteria andOpDateEqualTo(Date value) {
            addCriterion("op_date =", value, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateNotEqualTo(Date value) {
            addCriterion("op_date <>", value, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateGreaterThan(Date value) {
            addCriterion("op_date >", value, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateGreaterThanOrEqualTo(Date value) {
            addCriterion("op_date >=", value, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateLessThan(Date value) {
            addCriterion("op_date <", value, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateLessThanOrEqualTo(Date value) {
            addCriterion("op_date <=", value, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateIn(List<Date> values) {
            addCriterion("op_date in", values, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateNotIn(List<Date> values) {
            addCriterion("op_date not in", values, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateBetween(Date value1, Date value2) {
            addCriterion("op_date between", value1, value2, "opDate");
            return (Criteria) this;
        }

        public Criteria andOpDateNotBetween(Date value1, Date value2) {
            addCriterion("op_date not between", value1, value2, "opDate");
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