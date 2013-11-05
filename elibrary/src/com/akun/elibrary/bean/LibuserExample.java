package com.akun.elibrary.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibuserExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table dbo.libuser
	 * @ibatorgenerated  Thu Apr 05 20:03:39 CST 2012
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table dbo.libuser
	 * @ibatorgenerated  Thu Apr 05 20:03:39 CST 2012
	 */
	protected List oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table dbo.libuser
	 * @ibatorgenerated  Thu Apr 05 20:03:39 CST 2012
	 */
	public LibuserExample() {
		oredCriteria = new ArrayList();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table dbo.libuser
	 * @ibatorgenerated  Thu Apr 05 20:03:39 CST 2012
	 */
	protected LibuserExample(LibuserExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table dbo.libuser
	 * @ibatorgenerated  Thu Apr 05 20:03:39 CST 2012
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table dbo.libuser
	 * @ibatorgenerated  Thu Apr 05 20:03:39 CST 2012
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table dbo.libuser
	 * @ibatorgenerated  Thu Apr 05 20:03:39 CST 2012
	 */
	public List getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table dbo.libuser
	 * @ibatorgenerated  Thu Apr 05 20:03:39 CST 2012
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table dbo.libuser
	 * @ibatorgenerated  Thu Apr 05 20:03:39 CST 2012
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table dbo.libuser
	 * @ibatorgenerated  Thu Apr 05 20:03:39 CST 2012
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table dbo.libuser
	 * @ibatorgenerated  Thu Apr 05 20:03:39 CST 2012
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table dbo.libuser
	 * @ibatorgenerated  Thu Apr 05 20:03:39 CST 2012
	 */
	public static class Criteria {
		protected List criteriaWithoutValue;
		protected List criteriaWithSingleValue;
		protected List criteriaWithListValue;
		protected List criteriaWithBetweenValue;

		protected Criteria() {
			super();
			criteriaWithoutValue = new ArrayList();
			criteriaWithSingleValue = new ArrayList();
			criteriaWithListValue = new ArrayList();
			criteriaWithBetweenValue = new ArrayList();
		}

		public boolean isValid() {
			return criteriaWithoutValue.size() > 0 || criteriaWithSingleValue.size() > 0
					|| criteriaWithListValue.size() > 0 || criteriaWithBetweenValue.size() > 0;
		}

		public List getCriteriaWithoutValue() {
			return criteriaWithoutValue;
		}

		public List getCriteriaWithSingleValue() {
			return criteriaWithSingleValue;
		}

		public List getCriteriaWithListValue() {
			return criteriaWithListValue;
		}

		public List getCriteriaWithBetweenValue() {
			return criteriaWithBetweenValue;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteriaWithoutValue.add(condition);
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("value", value);
			criteriaWithSingleValue.add(map);
		}

		protected void addCriterion(String condition, List values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("values", values);
			criteriaWithListValue.add(map);
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			List list = new ArrayList();
			list.add(value1);
			list.add(value2);
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("values", list);
			criteriaWithBetweenValue.add(map);
		}

		public Criteria andUseridIsNull() {
			addCriterion("userid is null");
			return this;
		}

		public Criteria andUseridIsNotNull() {
			addCriterion("userid is not null");
			return this;
		}

		public Criteria andUseridEqualTo(Integer value) {
			addCriterion("userid =", value, "userid");
			return this;
		}
		public Criteria andUseridEqualTo(String stringIds) {
			addCriterion("userid =", stringIds, "userid");
			return this;
		}

		public Criteria andUseridNotEqualTo(Integer value) {
			addCriterion("userid <>", value, "userid");
			return this;
		}

		public Criteria andUseridGreaterThan(Integer value) {
			addCriterion("userid >", value, "userid");
			return this;
		}

		public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
			addCriterion("userid >=", value, "userid");
			return this;
		}

		public Criteria andUseridLessThan(Integer value) {
			addCriterion("userid <", value, "userid");
			return this;
		}

		public Criteria andUseridLessThanOrEqualTo(Integer value) {
			addCriterion("userid <=", value, "userid");
			return this;
		}

		public Criteria andUseridIn(List values) {
			addCriterion("userid in", values, "userid");
			return this;
		}

		public Criteria andUseridNotIn(List values) {
			addCriterion("userid not in", values, "userid");
			return this;
		}

		public Criteria andUseridBetween(Integer value1, Integer value2) {
			addCriterion("userid between", value1, value2, "userid");
			return this;
		}

		public Criteria andUseridNotBetween(Integer value1, Integer value2) {
			addCriterion("userid not between", value1, value2, "userid");
			return this;
		}

		public Criteria andUsernameIsNull() {
			addCriterion("username is null");
			return this;
		}

		public Criteria andUsernameIsNotNull() {
			addCriterion("username is not null");
			return this;
		}

		public Criteria andUsernameEqualTo(String value) {
			addCriterion("username =", value, "username");
			return this;
		}

		public Criteria andUsernameNotEqualTo(String value) {
			addCriterion("username <>", value, "username");
			return this;
		}

		public Criteria andUsernameGreaterThan(String value) {
			addCriterion("username >", value, "username");
			return this;
		}

		public Criteria andUsernameGreaterThanOrEqualTo(String value) {
			addCriterion("username >=", value, "username");
			return this;
		}

		public Criteria andUsernameLessThan(String value) {
			addCriterion("username <", value, "username");
			return this;
		}

		public Criteria andUsernameLessThanOrEqualTo(String value) {
			addCriterion("username <=", value, "username");
			return this;
		}

		public Criteria andUsernameLike(String value) {
			addCriterion("username like", value, "username");
			return this;
		}

		public Criteria andUsernameNotLike(String value) {
			addCriterion("username not like", value, "username");
			return this;
		}

		public Criteria andUsernameIn(List values) {
			addCriterion("username in", values, "username");
			return this;
		}

		public Criteria andUsernameNotIn(List values) {
			addCriterion("username not in", values, "username");
			return this;
		}

		public Criteria andUsernameBetween(String value1, String value2) {
			addCriterion("username between", value1, value2, "username");
			return this;
		}

		public Criteria andUsernameNotBetween(String value1, String value2) {
			addCriterion("username not between", value1, value2, "username");
			return this;
		}

		public Criteria andUserpwdIsNull() {
			addCriterion("userpwd is null");
			return this;
		}

		public Criteria andUserpwdIsNotNull() {
			addCriterion("userpwd is not null");
			return this;
		}

		public Criteria andUserpwdEqualTo(String value) {
			addCriterion("userpwd =", value, "userpwd");
			return this;
		}

		public Criteria andUserpwdNotEqualTo(String value) {
			addCriterion("userpwd <>", value, "userpwd");
			return this;
		}

		public Criteria andUserpwdGreaterThan(String value) {
			addCriterion("userpwd >", value, "userpwd");
			return this;
		}

		public Criteria andUserpwdGreaterThanOrEqualTo(String value) {
			addCriterion("userpwd >=", value, "userpwd");
			return this;
		}

		public Criteria andUserpwdLessThan(String value) {
			addCriterion("userpwd <", value, "userpwd");
			return this;
		}

		public Criteria andUserpwdLessThanOrEqualTo(String value) {
			addCriterion("userpwd <=", value, "userpwd");
			return this;
		}

		public Criteria andUserpwdLike(String value) {
			addCriterion("userpwd like", value, "userpwd");
			return this;
		}

		public Criteria andUserpwdNotLike(String value) {
			addCriterion("userpwd not like", value, "userpwd");
			return this;
		}

		public Criteria andUserpwdIn(List values) {
			addCriterion("userpwd in", values, "userpwd");
			return this;
		}

		public Criteria andUserpwdNotIn(List values) {
			addCriterion("userpwd not in", values, "userpwd");
			return this;
		}

		public Criteria andUserpwdBetween(String value1, String value2) {
			addCriterion("userpwd between", value1, value2, "userpwd");
			return this;
		}

		public Criteria andUserpwdNotBetween(String value1, String value2) {
			addCriterion("userpwd not between", value1, value2, "userpwd");
			return this;
		}

		public Criteria andRealnameIsNull() {
			addCriterion("realname is null");
			return this;
		}

		public Criteria andRealnameIsNotNull() {
			addCriterion("realname is not null");
			return this;
		}

		public Criteria andRealnameEqualTo(String value) {
			addCriterion("realname =", value, "realname");
			return this;
		}

		public Criteria andRealnameNotEqualTo(String value) {
			addCriterion("realname <>", value, "realname");
			return this;
		}

		public Criteria andRealnameGreaterThan(String value) {
			addCriterion("realname >", value, "realname");
			return this;
		}

		public Criteria andRealnameGreaterThanOrEqualTo(String value) {
			addCriterion("realname >=", value, "realname");
			return this;
		}

		public Criteria andRealnameLessThan(String value) {
			addCriterion("realname <", value, "realname");
			return this;
		}

		public Criteria andRealnameLessThanOrEqualTo(String value) {
			addCriterion("realname <=", value, "realname");
			return this;
		}

		public Criteria andRealnameLike(String value) {
			addCriterion("realname like", value, "realname");
			return this;
		}

		public Criteria andRealnameNotLike(String value) {
			addCriterion("realname not like", value, "realname");
			return this;
		}

		public Criteria andRealnameIn(List values) {
			addCriterion("realname in", values, "realname");
			return this;
		}

		public Criteria andRealnameNotIn(List values) {
			addCriterion("realname not in", values, "realname");
			return this;
		}

		public Criteria andRealnameBetween(String value1, String value2) {
			addCriterion("realname between", value1, value2, "realname");
			return this;
		}

		public Criteria andRealnameNotBetween(String value1, String value2) {
			addCriterion("realname not between", value1, value2, "realname");
			return this;
		}

		public Criteria andTelIsNull() {
			addCriterion("tel is null");
			return this;
		}

		public Criteria andTelIsNotNull() {
			addCriterion("tel is not null");
			return this;
		}

		public Criteria andTelEqualTo(String value) {
			addCriterion("tel =", value, "tel");
			return this;
		}

		public Criteria andTelNotEqualTo(String value) {
			addCriterion("tel <>", value, "tel");
			return this;
		}

		public Criteria andTelGreaterThan(String value) {
			addCriterion("tel >", value, "tel");
			return this;
		}

		public Criteria andTelGreaterThanOrEqualTo(String value) {
			addCriterion("tel >=", value, "tel");
			return this;
		}

		public Criteria andTelLessThan(String value) {
			addCriterion("tel <", value, "tel");
			return this;
		}

		public Criteria andTelLessThanOrEqualTo(String value) {
			addCriterion("tel <=", value, "tel");
			return this;
		}

		public Criteria andTelLike(String value) {
			addCriterion("tel like", value, "tel");
			return this;
		}

		public Criteria andTelNotLike(String value) {
			addCriterion("tel not like", value, "tel");
			return this;
		}

		public Criteria andTelIn(List values) {
			addCriterion("tel in", values, "tel");
			return this;
		}

		public Criteria andTelNotIn(List values) {
			addCriterion("tel not in", values, "tel");
			return this;
		}

		public Criteria andTelBetween(String value1, String value2) {
			addCriterion("tel between", value1, value2, "tel");
			return this;
		}

		public Criteria andTelNotBetween(String value1, String value2) {
			addCriterion("tel not between", value1, value2, "tel");
			return this;
		}

		public Criteria andEmailIsNull() {
			addCriterion("email is null");
			return this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("email is not null");
			return this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "email");
			return this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return this;
		}

		public Criteria andEmailIn(List values) {
			addCriterion("email in", values, "email");
			return this;
		}

		public Criteria andEmailNotIn(List values) {
			addCriterion("email not in", values, "email");
			return this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("email between", value1, value2, "email");
			return this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("email not between", value1, value2, "email");
			return this;
		}
	}
}