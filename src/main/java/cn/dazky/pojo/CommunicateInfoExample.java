package cn.dazky.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommunicateInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommunicateInfoExample() {
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

        public Criteria andCommunicateIdIsNull() {
            addCriterion("communicate_id is null");
            return (Criteria) this;
        }

        public Criteria andCommunicateIdIsNotNull() {
            addCriterion("communicate_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicateIdEqualTo(Integer value) {
            addCriterion("communicate_id =", value, "communicateId");
            return (Criteria) this;
        }

        public Criteria andCommunicateIdNotEqualTo(Integer value) {
            addCriterion("communicate_id <>", value, "communicateId");
            return (Criteria) this;
        }

        public Criteria andCommunicateIdGreaterThan(Integer value) {
            addCriterion("communicate_id >", value, "communicateId");
            return (Criteria) this;
        }

        public Criteria andCommunicateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("communicate_id >=", value, "communicateId");
            return (Criteria) this;
        }

        public Criteria andCommunicateIdLessThan(Integer value) {
            addCriterion("communicate_id <", value, "communicateId");
            return (Criteria) this;
        }

        public Criteria andCommunicateIdLessThanOrEqualTo(Integer value) {
            addCriterion("communicate_id <=", value, "communicateId");
            return (Criteria) this;
        }

        public Criteria andCommunicateIdIn(List<Integer> values) {
            addCriterion("communicate_id in", values, "communicateId");
            return (Criteria) this;
        }

        public Criteria andCommunicateIdNotIn(List<Integer> values) {
            addCriterion("communicate_id not in", values, "communicateId");
            return (Criteria) this;
        }

        public Criteria andCommunicateIdBetween(Integer value1, Integer value2) {
            addCriterion("communicate_id between", value1, value2, "communicateId");
            return (Criteria) this;
        }

        public Criteria andCommunicateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("communicate_id not between", value1, value2, "communicateId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Integer value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Integer value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Integer value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Integer value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Integer> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Integer> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andCommunicateTimeIsNull() {
            addCriterion("communicate_time is null");
            return (Criteria) this;
        }

        public Criteria andCommunicateTimeIsNotNull() {
            addCriterion("communicate_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicateTimeEqualTo(Date value) {
            addCriterion("communicate_time =", value, "communicateTime");
            return (Criteria) this;
        }

        public Criteria andCommunicateTimeNotEqualTo(Date value) {
            addCriterion("communicate_time <>", value, "communicateTime");
            return (Criteria) this;
        }

        public Criteria andCommunicateTimeGreaterThan(Date value) {
            addCriterion("communicate_time >", value, "communicateTime");
            return (Criteria) this;
        }

        public Criteria andCommunicateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("communicate_time >=", value, "communicateTime");
            return (Criteria) this;
        }

        public Criteria andCommunicateTimeLessThan(Date value) {
            addCriterion("communicate_time <", value, "communicateTime");
            return (Criteria) this;
        }

        public Criteria andCommunicateTimeLessThanOrEqualTo(Date value) {
            addCriterion("communicate_time <=", value, "communicateTime");
            return (Criteria) this;
        }

        public Criteria andCommunicateTimeIn(List<Date> values) {
            addCriterion("communicate_time in", values, "communicateTime");
            return (Criteria) this;
        }

        public Criteria andCommunicateTimeNotIn(List<Date> values) {
            addCriterion("communicate_time not in", values, "communicateTime");
            return (Criteria) this;
        }

        public Criteria andCommunicateTimeBetween(Date value1, Date value2) {
            addCriterion("communicate_time between", value1, value2, "communicateTime");
            return (Criteria) this;
        }

        public Criteria andCommunicateTimeNotBetween(Date value1, Date value2) {
            addCriterion("communicate_time not between", value1, value2, "communicateTime");
            return (Criteria) this;
        }

        public Criteria andCommunicateContentIsNull() {
            addCriterion("communicate_content is null");
            return (Criteria) this;
        }

        public Criteria andCommunicateContentIsNotNull() {
            addCriterion("communicate_content is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicateContentEqualTo(String value) {
            addCriterion("communicate_content =", value, "communicateContent");
            return (Criteria) this;
        }

        public Criteria andCommunicateContentNotEqualTo(String value) {
            addCriterion("communicate_content <>", value, "communicateContent");
            return (Criteria) this;
        }

        public Criteria andCommunicateContentGreaterThan(String value) {
            addCriterion("communicate_content >", value, "communicateContent");
            return (Criteria) this;
        }

        public Criteria andCommunicateContentGreaterThanOrEqualTo(String value) {
            addCriterion("communicate_content >=", value, "communicateContent");
            return (Criteria) this;
        }

        public Criteria andCommunicateContentLessThan(String value) {
            addCriterion("communicate_content <", value, "communicateContent");
            return (Criteria) this;
        }

        public Criteria andCommunicateContentLessThanOrEqualTo(String value) {
            addCriterion("communicate_content <=", value, "communicateContent");
            return (Criteria) this;
        }

        public Criteria andCommunicateContentLike(String value) {
            addCriterion("communicate_content like", value, "communicateContent");
            return (Criteria) this;
        }

        public Criteria andCommunicateContentNotLike(String value) {
            addCriterion("communicate_content not like", value, "communicateContent");
            return (Criteria) this;
        }

        public Criteria andCommunicateContentIn(List<String> values) {
            addCriterion("communicate_content in", values, "communicateContent");
            return (Criteria) this;
        }

        public Criteria andCommunicateContentNotIn(List<String> values) {
            addCriterion("communicate_content not in", values, "communicateContent");
            return (Criteria) this;
        }

        public Criteria andCommunicateContentBetween(String value1, String value2) {
            addCriterion("communicate_content between", value1, value2, "communicateContent");
            return (Criteria) this;
        }

        public Criteria andCommunicateContentNotBetween(String value1, String value2) {
            addCriterion("communicate_content not between", value1, value2, "communicateContent");
            return (Criteria) this;
        }

        public Criteria andCommunicateXuenianIsNull() {
            addCriterion("communicate_xuenian is null");
            return (Criteria) this;
        }

        public Criteria andCommunicateXuenianIsNotNull() {
            addCriterion("communicate_xuenian is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicateXuenianEqualTo(String value) {
            addCriterion("communicate_xuenian =", value, "communicateXuenian");
            return (Criteria) this;
        }

        public Criteria andCommunicateXuenianNotEqualTo(String value) {
            addCriterion("communicate_xuenian <>", value, "communicateXuenian");
            return (Criteria) this;
        }

        public Criteria andCommunicateXuenianGreaterThan(String value) {
            addCriterion("communicate_xuenian >", value, "communicateXuenian");
            return (Criteria) this;
        }

        public Criteria andCommunicateXuenianGreaterThanOrEqualTo(String value) {
            addCriterion("communicate_xuenian >=", value, "communicateXuenian");
            return (Criteria) this;
        }

        public Criteria andCommunicateXuenianLessThan(String value) {
            addCriterion("communicate_xuenian <", value, "communicateXuenian");
            return (Criteria) this;
        }

        public Criteria andCommunicateXuenianLessThanOrEqualTo(String value) {
            addCriterion("communicate_xuenian <=", value, "communicateXuenian");
            return (Criteria) this;
        }

        public Criteria andCommunicateXuenianLike(String value) {
            addCriterion("communicate_xuenian like", value, "communicateXuenian");
            return (Criteria) this;
        }

        public Criteria andCommunicateXuenianNotLike(String value) {
            addCriterion("communicate_xuenian not like", value, "communicateXuenian");
            return (Criteria) this;
        }

        public Criteria andCommunicateXuenianIn(List<String> values) {
            addCriterion("communicate_xuenian in", values, "communicateXuenian");
            return (Criteria) this;
        }

        public Criteria andCommunicateXuenianNotIn(List<String> values) {
            addCriterion("communicate_xuenian not in", values, "communicateXuenian");
            return (Criteria) this;
        }

        public Criteria andCommunicateXuenianBetween(String value1, String value2) {
            addCriterion("communicate_xuenian between", value1, value2, "communicateXuenian");
            return (Criteria) this;
        }

        public Criteria andCommunicateXuenianNotBetween(String value1, String value2) {
            addCriterion("communicate_xuenian not between", value1, value2, "communicateXuenian");
            return (Criteria) this;
        }

        public Criteria andCommunicateXueqiIsNull() {
            addCriterion("communicate_xueqi is null");
            return (Criteria) this;
        }

        public Criteria andCommunicateXueqiIsNotNull() {
            addCriterion("communicate_xueqi is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicateXueqiEqualTo(String value) {
            addCriterion("communicate_xueqi =", value, "communicateXueqi");
            return (Criteria) this;
        }

        public Criteria andCommunicateXueqiNotEqualTo(String value) {
            addCriterion("communicate_xueqi <>", value, "communicateXueqi");
            return (Criteria) this;
        }

        public Criteria andCommunicateXueqiGreaterThan(String value) {
            addCriterion("communicate_xueqi >", value, "communicateXueqi");
            return (Criteria) this;
        }

        public Criteria andCommunicateXueqiGreaterThanOrEqualTo(String value) {
            addCriterion("communicate_xueqi >=", value, "communicateXueqi");
            return (Criteria) this;
        }

        public Criteria andCommunicateXueqiLessThan(String value) {
            addCriterion("communicate_xueqi <", value, "communicateXueqi");
            return (Criteria) this;
        }

        public Criteria andCommunicateXueqiLessThanOrEqualTo(String value) {
            addCriterion("communicate_xueqi <=", value, "communicateXueqi");
            return (Criteria) this;
        }

        public Criteria andCommunicateXueqiLike(String value) {
            addCriterion("communicate_xueqi like", value, "communicateXueqi");
            return (Criteria) this;
        }

        public Criteria andCommunicateXueqiNotLike(String value) {
            addCriterion("communicate_xueqi not like", value, "communicateXueqi");
            return (Criteria) this;
        }

        public Criteria andCommunicateXueqiIn(List<String> values) {
            addCriterion("communicate_xueqi in", values, "communicateXueqi");
            return (Criteria) this;
        }

        public Criteria andCommunicateXueqiNotIn(List<String> values) {
            addCriterion("communicate_xueqi not in", values, "communicateXueqi");
            return (Criteria) this;
        }

        public Criteria andCommunicateXueqiBetween(String value1, String value2) {
            addCriterion("communicate_xueqi between", value1, value2, "communicateXueqi");
            return (Criteria) this;
        }

        public Criteria andCommunicateXueqiNotBetween(String value1, String value2) {
            addCriterion("communicate_xueqi not between", value1, value2, "communicateXueqi");
            return (Criteria) this;
        }

        public Criteria andLeaveCountIsNull() {
            addCriterion("leave_count is null");
            return (Criteria) this;
        }

        public Criteria andLeaveCountIsNotNull() {
            addCriterion("leave_count is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveCountEqualTo(Integer value) {
            addCriterion("leave_count =", value, "leaveCount");
            return (Criteria) this;
        }

        public Criteria andLeaveCountNotEqualTo(Integer value) {
            addCriterion("leave_count <>", value, "leaveCount");
            return (Criteria) this;
        }

        public Criteria andLeaveCountGreaterThan(Integer value) {
            addCriterion("leave_count >", value, "leaveCount");
            return (Criteria) this;
        }

        public Criteria andLeaveCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("leave_count >=", value, "leaveCount");
            return (Criteria) this;
        }

        public Criteria andLeaveCountLessThan(Integer value) {
            addCriterion("leave_count <", value, "leaveCount");
            return (Criteria) this;
        }

        public Criteria andLeaveCountLessThanOrEqualTo(Integer value) {
            addCriterion("leave_count <=", value, "leaveCount");
            return (Criteria) this;
        }

        public Criteria andLeaveCountIn(List<Integer> values) {
            addCriterion("leave_count in", values, "leaveCount");
            return (Criteria) this;
        }

        public Criteria andLeaveCountNotIn(List<Integer> values) {
            addCriterion("leave_count not in", values, "leaveCount");
            return (Criteria) this;
        }

        public Criteria andLeaveCountBetween(Integer value1, Integer value2) {
            addCriterion("leave_count between", value1, value2, "leaveCount");
            return (Criteria) this;
        }

        public Criteria andLeaveCountNotBetween(Integer value1, Integer value2) {
            addCriterion("leave_count not between", value1, value2, "leaveCount");
            return (Criteria) this;
        }

        public Criteria andTruancyCountIsNull() {
            addCriterion("truancy_count is null");
            return (Criteria) this;
        }

        public Criteria andTruancyCountIsNotNull() {
            addCriterion("truancy_count is not null");
            return (Criteria) this;
        }

        public Criteria andTruancyCountEqualTo(Integer value) {
            addCriterion("truancy_count =", value, "truancyCount");
            return (Criteria) this;
        }

        public Criteria andTruancyCountNotEqualTo(Integer value) {
            addCriterion("truancy_count <>", value, "truancyCount");
            return (Criteria) this;
        }

        public Criteria andTruancyCountGreaterThan(Integer value) {
            addCriterion("truancy_count >", value, "truancyCount");
            return (Criteria) this;
        }

        public Criteria andTruancyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("truancy_count >=", value, "truancyCount");
            return (Criteria) this;
        }

        public Criteria andTruancyCountLessThan(Integer value) {
            addCriterion("truancy_count <", value, "truancyCount");
            return (Criteria) this;
        }

        public Criteria andTruancyCountLessThanOrEqualTo(Integer value) {
            addCriterion("truancy_count <=", value, "truancyCount");
            return (Criteria) this;
        }

        public Criteria andTruancyCountIn(List<Integer> values) {
            addCriterion("truancy_count in", values, "truancyCount");
            return (Criteria) this;
        }

        public Criteria andTruancyCountNotIn(List<Integer> values) {
            addCriterion("truancy_count not in", values, "truancyCount");
            return (Criteria) this;
        }

        public Criteria andTruancyCountBetween(Integer value1, Integer value2) {
            addCriterion("truancy_count between", value1, value2, "truancyCount");
            return (Criteria) this;
        }

        public Criteria andTruancyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("truancy_count not between", value1, value2, "truancyCount");
            return (Criteria) this;
        }

        public Criteria andRewardPunishIsNull() {
            addCriterion("reward_punish is null");
            return (Criteria) this;
        }

        public Criteria andRewardPunishIsNotNull() {
            addCriterion("reward_punish is not null");
            return (Criteria) this;
        }

        public Criteria andRewardPunishEqualTo(String value) {
            addCriterion("reward_punish =", value, "rewardPunish");
            return (Criteria) this;
        }

        public Criteria andRewardPunishNotEqualTo(String value) {
            addCriterion("reward_punish <>", value, "rewardPunish");
            return (Criteria) this;
        }

        public Criteria andRewardPunishGreaterThan(String value) {
            addCriterion("reward_punish >", value, "rewardPunish");
            return (Criteria) this;
        }

        public Criteria andRewardPunishGreaterThanOrEqualTo(String value) {
            addCriterion("reward_punish >=", value, "rewardPunish");
            return (Criteria) this;
        }

        public Criteria andRewardPunishLessThan(String value) {
            addCriterion("reward_punish <", value, "rewardPunish");
            return (Criteria) this;
        }

        public Criteria andRewardPunishLessThanOrEqualTo(String value) {
            addCriterion("reward_punish <=", value, "rewardPunish");
            return (Criteria) this;
        }

        public Criteria andRewardPunishLike(String value) {
            addCriterion("reward_punish like", value, "rewardPunish");
            return (Criteria) this;
        }

        public Criteria andRewardPunishNotLike(String value) {
            addCriterion("reward_punish not like", value, "rewardPunish");
            return (Criteria) this;
        }

        public Criteria andRewardPunishIn(List<String> values) {
            addCriterion("reward_punish in", values, "rewardPunish");
            return (Criteria) this;
        }

        public Criteria andRewardPunishNotIn(List<String> values) {
            addCriterion("reward_punish not in", values, "rewardPunish");
            return (Criteria) this;
        }

        public Criteria andRewardPunishBetween(String value1, String value2) {
            addCriterion("reward_punish between", value1, value2, "rewardPunish");
            return (Criteria) this;
        }

        public Criteria andRewardPunishNotBetween(String value1, String value2) {
            addCriterion("reward_punish not between", value1, value2, "rewardPunish");
            return (Criteria) this;
        }
    }

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