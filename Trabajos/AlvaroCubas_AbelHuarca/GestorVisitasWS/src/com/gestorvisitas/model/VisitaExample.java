package com.gestorvisitas.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VisitaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VisitaExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andVisCodigoIsNull() {
            addCriterion("vis_codigo is null");
            return (Criteria) this;
        }

        public Criteria andVisCodigoIsNotNull() {
            addCriterion("vis_codigo is not null");
            return (Criteria) this;
        }

        public Criteria andVisCodigoEqualTo(Integer value) {
            addCriterion("vis_codigo =", value, "visCodigo");
            return (Criteria) this;
        }

        public Criteria andVisCodigoNotEqualTo(Integer value) {
            addCriterion("vis_codigo <>", value, "visCodigo");
            return (Criteria) this;
        }

        public Criteria andVisCodigoGreaterThan(Integer value) {
            addCriterion("vis_codigo >", value, "visCodigo");
            return (Criteria) this;
        }

        public Criteria andVisCodigoGreaterThanOrEqualTo(Integer value) {
            addCriterion("vis_codigo >=", value, "visCodigo");
            return (Criteria) this;
        }

        public Criteria andVisCodigoLessThan(Integer value) {
            addCriterion("vis_codigo <", value, "visCodigo");
            return (Criteria) this;
        }

        public Criteria andVisCodigoLessThanOrEqualTo(Integer value) {
            addCriterion("vis_codigo <=", value, "visCodigo");
            return (Criteria) this;
        }

        public Criteria andVisCodigoIn(List<Integer> values) {
            addCriterion("vis_codigo in", values, "visCodigo");
            return (Criteria) this;
        }

        public Criteria andVisCodigoNotIn(List<Integer> values) {
            addCriterion("vis_codigo not in", values, "visCodigo");
            return (Criteria) this;
        }

        public Criteria andVisCodigoBetween(Integer value1, Integer value2) {
            addCriterion("vis_codigo between", value1, value2, "visCodigo");
            return (Criteria) this;
        }

        public Criteria andVisCodigoNotBetween(Integer value1, Integer value2) {
            addCriterion("vis_codigo not between", value1, value2, "visCodigo");
            return (Criteria) this;
        }

        public Criteria andCliRucIsNull() {
            addCriterion("cli_ruc is null");
            return (Criteria) this;
        }

        public Criteria andCliRucIsNotNull() {
            addCriterion("cli_ruc is not null");
            return (Criteria) this;
        }

        public Criteria andCliRucEqualTo(String value) {
            addCriterion("cli_ruc =", value, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucNotEqualTo(String value) {
            addCriterion("cli_ruc <>", value, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucGreaterThan(String value) {
            addCriterion("cli_ruc >", value, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucGreaterThanOrEqualTo(String value) {
            addCriterion("cli_ruc >=", value, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucLessThan(String value) {
            addCriterion("cli_ruc <", value, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucLessThanOrEqualTo(String value) {
            addCriterion("cli_ruc <=", value, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucLike(String value) {
            addCriterion("cli_ruc like", value, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucNotLike(String value) {
            addCriterion("cli_ruc not like", value, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucIn(List<String> values) {
            addCriterion("cli_ruc in", values, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucNotIn(List<String> values) {
            addCriterion("cli_ruc not in", values, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucBetween(String value1, String value2) {
            addCriterion("cli_ruc between", value1, value2, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucNotBetween(String value1, String value2) {
            addCriterion("cli_ruc not between", value1, value2, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andVisEstadoIsNull() {
            addCriterion("vis_estado is null");
            return (Criteria) this;
        }

        public Criteria andVisEstadoIsNotNull() {
            addCriterion("vis_estado is not null");
            return (Criteria) this;
        }

        public Criteria andVisEstadoEqualTo(Integer value) {
            addCriterion("vis_estado =", value, "visEstado");
            return (Criteria) this;
        }

        public Criteria andVisEstadoNotEqualTo(Integer value) {
            addCriterion("vis_estado <>", value, "visEstado");
            return (Criteria) this;
        }

        public Criteria andVisEstadoGreaterThan(Integer value) {
            addCriterion("vis_estado >", value, "visEstado");
            return (Criteria) this;
        }

        public Criteria andVisEstadoGreaterThanOrEqualTo(Integer value) {
            addCriterion("vis_estado >=", value, "visEstado");
            return (Criteria) this;
        }

        public Criteria andVisEstadoLessThan(Integer value) {
            addCriterion("vis_estado <", value, "visEstado");
            return (Criteria) this;
        }

        public Criteria andVisEstadoLessThanOrEqualTo(Integer value) {
            addCriterion("vis_estado <=", value, "visEstado");
            return (Criteria) this;
        }

        public Criteria andVisEstadoIn(List<Integer> values) {
            addCriterion("vis_estado in", values, "visEstado");
            return (Criteria) this;
        }

        public Criteria andVisEstadoNotIn(List<Integer> values) {
            addCriterion("vis_estado not in", values, "visEstado");
            return (Criteria) this;
        }

        public Criteria andVisEstadoBetween(Integer value1, Integer value2) {
            addCriterion("vis_estado between", value1, value2, "visEstado");
            return (Criteria) this;
        }

        public Criteria andVisEstadoNotBetween(Integer value1, Integer value2) {
            addCriterion("vis_estado not between", value1, value2, "visEstado");
            return (Criteria) this;
        }

        public Criteria andProCodigoIsNull() {
            addCriterion("pro_codigo is null");
            return (Criteria) this;
        }

        public Criteria andProCodigoIsNotNull() {
            addCriterion("pro_codigo is not null");
            return (Criteria) this;
        }

        public Criteria andProCodigoEqualTo(Integer value) {
            addCriterion("pro_codigo =", value, "proCodigo");
            return (Criteria) this;
        }

        public Criteria andProCodigoNotEqualTo(Integer value) {
            addCriterion("pro_codigo <>", value, "proCodigo");
            return (Criteria) this;
        }

        public Criteria andProCodigoGreaterThan(Integer value) {
            addCriterion("pro_codigo >", value, "proCodigo");
            return (Criteria) this;
        }

        public Criteria andProCodigoGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_codigo >=", value, "proCodigo");
            return (Criteria) this;
        }

        public Criteria andProCodigoLessThan(Integer value) {
            addCriterion("pro_codigo <", value, "proCodigo");
            return (Criteria) this;
        }

        public Criteria andProCodigoLessThanOrEqualTo(Integer value) {
            addCriterion("pro_codigo <=", value, "proCodigo");
            return (Criteria) this;
        }

        public Criteria andProCodigoIn(List<Integer> values) {
            addCriterion("pro_codigo in", values, "proCodigo");
            return (Criteria) this;
        }

        public Criteria andProCodigoNotIn(List<Integer> values) {
            addCriterion("pro_codigo not in", values, "proCodigo");
            return (Criteria) this;
        }

        public Criteria andProCodigoBetween(Integer value1, Integer value2) {
            addCriterion("pro_codigo between", value1, value2, "proCodigo");
            return (Criteria) this;
        }

        public Criteria andProCodigoNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_codigo not between", value1, value2, "proCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoIsNull() {
            addCriterion("usu_codigo is null");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoIsNotNull() {
            addCriterion("usu_codigo is not null");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoEqualTo(Integer value) {
            addCriterion("usu_codigo =", value, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoNotEqualTo(Integer value) {
            addCriterion("usu_codigo <>", value, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoGreaterThan(Integer value) {
            addCriterion("usu_codigo >", value, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoGreaterThanOrEqualTo(Integer value) {
            addCriterion("usu_codigo >=", value, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoLessThan(Integer value) {
            addCriterion("usu_codigo <", value, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoLessThanOrEqualTo(Integer value) {
            addCriterion("usu_codigo <=", value, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoIn(List<Integer> values) {
            addCriterion("usu_codigo in", values, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoNotIn(List<Integer> values) {
            addCriterion("usu_codigo not in", values, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoBetween(Integer value1, Integer value2) {
            addCriterion("usu_codigo between", value1, value2, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoNotBetween(Integer value1, Integer value2) {
            addCriterion("usu_codigo not between", value1, value2, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andAreCodigoIsNull() {
            addCriterion("are_codigo is null");
            return (Criteria) this;
        }

        public Criteria andAreCodigoIsNotNull() {
            addCriterion("are_codigo is not null");
            return (Criteria) this;
        }

        public Criteria andAreCodigoEqualTo(Integer value) {
            addCriterion("are_codigo =", value, "areCodigo");
            return (Criteria) this;
        }

        public Criteria andAreCodigoNotEqualTo(Integer value) {
            addCriterion("are_codigo <>", value, "areCodigo");
            return (Criteria) this;
        }

        public Criteria andAreCodigoGreaterThan(Integer value) {
            addCriterion("are_codigo >", value, "areCodigo");
            return (Criteria) this;
        }

        public Criteria andAreCodigoGreaterThanOrEqualTo(Integer value) {
            addCriterion("are_codigo >=", value, "areCodigo");
            return (Criteria) this;
        }

        public Criteria andAreCodigoLessThan(Integer value) {
            addCriterion("are_codigo <", value, "areCodigo");
            return (Criteria) this;
        }

        public Criteria andAreCodigoLessThanOrEqualTo(Integer value) {
            addCriterion("are_codigo <=", value, "areCodigo");
            return (Criteria) this;
        }

        public Criteria andAreCodigoIn(List<Integer> values) {
            addCriterion("are_codigo in", values, "areCodigo");
            return (Criteria) this;
        }

        public Criteria andAreCodigoNotIn(List<Integer> values) {
            addCriterion("are_codigo not in", values, "areCodigo");
            return (Criteria) this;
        }

        public Criteria andAreCodigoBetween(Integer value1, Integer value2) {
            addCriterion("are_codigo between", value1, value2, "areCodigo");
            return (Criteria) this;
        }

        public Criteria andAreCodigoNotBetween(Integer value1, Integer value2) {
            addCriterion("are_codigo not between", value1, value2, "areCodigo");
            return (Criteria) this;
        }

        public Criteria andMotCodigoIsNull() {
            addCriterion("mot_codigo is null");
            return (Criteria) this;
        }

        public Criteria andMotCodigoIsNotNull() {
            addCriterion("mot_codigo is not null");
            return (Criteria) this;
        }

        public Criteria andMotCodigoEqualTo(Integer value) {
            addCriterion("mot_codigo =", value, "motCodigo");
            return (Criteria) this;
        }

        public Criteria andMotCodigoNotEqualTo(Integer value) {
            addCriterion("mot_codigo <>", value, "motCodigo");
            return (Criteria) this;
        }

        public Criteria andMotCodigoGreaterThan(Integer value) {
            addCriterion("mot_codigo >", value, "motCodigo");
            return (Criteria) this;
        }

        public Criteria andMotCodigoGreaterThanOrEqualTo(Integer value) {
            addCriterion("mot_codigo >=", value, "motCodigo");
            return (Criteria) this;
        }

        public Criteria andMotCodigoLessThan(Integer value) {
            addCriterion("mot_codigo <", value, "motCodigo");
            return (Criteria) this;
        }

        public Criteria andMotCodigoLessThanOrEqualTo(Integer value) {
            addCriterion("mot_codigo <=", value, "motCodigo");
            return (Criteria) this;
        }

        public Criteria andMotCodigoIn(List<Integer> values) {
            addCriterion("mot_codigo in", values, "motCodigo");
            return (Criteria) this;
        }

        public Criteria andMotCodigoNotIn(List<Integer> values) {
            addCriterion("mot_codigo not in", values, "motCodigo");
            return (Criteria) this;
        }

        public Criteria andMotCodigoBetween(Integer value1, Integer value2) {
            addCriterion("mot_codigo between", value1, value2, "motCodigo");
            return (Criteria) this;
        }

        public Criteria andMotCodigoNotBetween(Integer value1, Integer value2) {
            addCriterion("mot_codigo not between", value1, value2, "motCodigo");
            return (Criteria) this;
        }

        public Criteria andTipCodigoIsNull() {
            addCriterion("tip_codigo is null");
            return (Criteria) this;
        }

        public Criteria andTipCodigoIsNotNull() {
            addCriterion("tip_codigo is not null");
            return (Criteria) this;
        }

        public Criteria andTipCodigoEqualTo(Integer value) {
            addCriterion("tip_codigo =", value, "tipCodigo");
            return (Criteria) this;
        }

        public Criteria andTipCodigoNotEqualTo(Integer value) {
            addCriterion("tip_codigo <>", value, "tipCodigo");
            return (Criteria) this;
        }

        public Criteria andTipCodigoGreaterThan(Integer value) {
            addCriterion("tip_codigo >", value, "tipCodigo");
            return (Criteria) this;
        }

        public Criteria andTipCodigoGreaterThanOrEqualTo(Integer value) {
            addCriterion("tip_codigo >=", value, "tipCodigo");
            return (Criteria) this;
        }

        public Criteria andTipCodigoLessThan(Integer value) {
            addCriterion("tip_codigo <", value, "tipCodigo");
            return (Criteria) this;
        }

        public Criteria andTipCodigoLessThanOrEqualTo(Integer value) {
            addCriterion("tip_codigo <=", value, "tipCodigo");
            return (Criteria) this;
        }

        public Criteria andTipCodigoIn(List<Integer> values) {
            addCriterion("tip_codigo in", values, "tipCodigo");
            return (Criteria) this;
        }

        public Criteria andTipCodigoNotIn(List<Integer> values) {
            addCriterion("tip_codigo not in", values, "tipCodigo");
            return (Criteria) this;
        }

        public Criteria andTipCodigoBetween(Integer value1, Integer value2) {
            addCriterion("tip_codigo between", value1, value2, "tipCodigo");
            return (Criteria) this;
        }

        public Criteria andTipCodigoNotBetween(Integer value1, Integer value2) {
            addCriterion("tip_codigo not between", value1, value2, "tipCodigo");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaIsNull() {
            addCriterion("vis_no_visita is null");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaIsNotNull() {
            addCriterion("vis_no_visita is not null");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaEqualTo(Integer value) {
            addCriterion("vis_no_visita =", value, "visNoVisita");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaNotEqualTo(Integer value) {
            addCriterion("vis_no_visita <>", value, "visNoVisita");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaGreaterThan(Integer value) {
            addCriterion("vis_no_visita >", value, "visNoVisita");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaGreaterThanOrEqualTo(Integer value) {
            addCriterion("vis_no_visita >=", value, "visNoVisita");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaLessThan(Integer value) {
            addCriterion("vis_no_visita <", value, "visNoVisita");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaLessThanOrEqualTo(Integer value) {
            addCriterion("vis_no_visita <=", value, "visNoVisita");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaIn(List<Integer> values) {
            addCriterion("vis_no_visita in", values, "visNoVisita");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaNotIn(List<Integer> values) {
            addCriterion("vis_no_visita not in", values, "visNoVisita");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaBetween(Integer value1, Integer value2) {
            addCriterion("vis_no_visita between", value1, value2, "visNoVisita");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaNotBetween(Integer value1, Integer value2) {
            addCriterion("vis_no_visita not between", value1, value2, "visNoVisita");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasIsNull() {
            addCriterion("vis_numero_lineas is null");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasIsNotNull() {
            addCriterion("vis_numero_lineas is not null");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasEqualTo(Integer value) {
            addCriterion("vis_numero_lineas =", value, "visNumeroLineas");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasNotEqualTo(Integer value) {
            addCriterion("vis_numero_lineas <>", value, "visNumeroLineas");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasGreaterThan(Integer value) {
            addCriterion("vis_numero_lineas >", value, "visNumeroLineas");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasGreaterThanOrEqualTo(Integer value) {
            addCriterion("vis_numero_lineas >=", value, "visNumeroLineas");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasLessThan(Integer value) {
            addCriterion("vis_numero_lineas <", value, "visNumeroLineas");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasLessThanOrEqualTo(Integer value) {
            addCriterion("vis_numero_lineas <=", value, "visNumeroLineas");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasIn(List<Integer> values) {
            addCriterion("vis_numero_lineas in", values, "visNumeroLineas");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasNotIn(List<Integer> values) {
            addCriterion("vis_numero_lineas not in", values, "visNumeroLineas");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasBetween(Integer value1, Integer value2) {
            addCriterion("vis_numero_lineas between", value1, value2, "visNumeroLineas");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasNotBetween(Integer value1, Integer value2) {
            addCriterion("vis_numero_lineas not between", value1, value2, "visNumeroLineas");
            return (Criteria) this;
        }

        public Criteria andVisMontoAproximadoIsNull() {
            addCriterion("vis_monto_aproximado is null");
            return (Criteria) this;
        }

        public Criteria andVisMontoAproximadoIsNotNull() {
            addCriterion("vis_monto_aproximado is not null");
            return (Criteria) this;
        }

        public Criteria andVisMontoAproximadoEqualTo(Double value) {
            addCriterion("vis_monto_aproximado =", value, "visMontoAproximado");
            return (Criteria) this;
        }

        public Criteria andVisMontoAproximadoNotEqualTo(Double value) {
            addCriterion("vis_monto_aproximado <>", value, "visMontoAproximado");
            return (Criteria) this;
        }

        public Criteria andVisMontoAproximadoGreaterThan(Double value) {
            addCriterion("vis_monto_aproximado >", value, "visMontoAproximado");
            return (Criteria) this;
        }

        public Criteria andVisMontoAproximadoGreaterThanOrEqualTo(Double value) {
            addCriterion("vis_monto_aproximado >=", value, "visMontoAproximado");
            return (Criteria) this;
        }

        public Criteria andVisMontoAproximadoLessThan(Double value) {
            addCriterion("vis_monto_aproximado <", value, "visMontoAproximado");
            return (Criteria) this;
        }

        public Criteria andVisMontoAproximadoLessThanOrEqualTo(Double value) {
            addCriterion("vis_monto_aproximado <=", value, "visMontoAproximado");
            return (Criteria) this;
        }

        public Criteria andVisMontoAproximadoIn(List<Double> values) {
            addCriterion("vis_monto_aproximado in", values, "visMontoAproximado");
            return (Criteria) this;
        }

        public Criteria andVisMontoAproximadoNotIn(List<Double> values) {
            addCriterion("vis_monto_aproximado not in", values, "visMontoAproximado");
            return (Criteria) this;
        }

        public Criteria andVisMontoAproximadoBetween(Double value1, Double value2) {
            addCriterion("vis_monto_aproximado between", value1, value2, "visMontoAproximado");
            return (Criteria) this;
        }

        public Criteria andVisMontoAproximadoNotBetween(Double value1, Double value2) {
            addCriterion("vis_monto_aproximado not between", value1, value2, "visMontoAproximado");
            return (Criteria) this;
        }

        public Criteria andVisLatitudIsNull() {
            addCriterion("vis_latitud is null");
            return (Criteria) this;
        }

        public Criteria andVisLatitudIsNotNull() {
            addCriterion("vis_latitud is not null");
            return (Criteria) this;
        }

        public Criteria andVisLatitudEqualTo(String value) {
            addCriterion("vis_latitud =", value, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLatitudNotEqualTo(String value) {
            addCriterion("vis_latitud <>", value, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLatitudGreaterThan(String value) {
            addCriterion("vis_latitud >", value, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLatitudGreaterThanOrEqualTo(String value) {
            addCriterion("vis_latitud >=", value, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLatitudLessThan(String value) {
            addCriterion("vis_latitud <", value, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLatitudLessThanOrEqualTo(String value) {
            addCriterion("vis_latitud <=", value, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLatitudLike(String value) {
            addCriterion("vis_latitud like", value, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLatitudNotLike(String value) {
            addCriterion("vis_latitud not like", value, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLatitudIn(List<String> values) {
            addCriterion("vis_latitud in", values, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLatitudNotIn(List<String> values) {
            addCriterion("vis_latitud not in", values, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLatitudBetween(String value1, String value2) {
            addCriterion("vis_latitud between", value1, value2, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLatitudNotBetween(String value1, String value2) {
            addCriterion("vis_latitud not between", value1, value2, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudIsNull() {
            addCriterion("vis_longitud is null");
            return (Criteria) this;
        }

        public Criteria andVisLongitudIsNotNull() {
            addCriterion("vis_longitud is not null");
            return (Criteria) this;
        }

        public Criteria andVisLongitudEqualTo(String value) {
            addCriterion("vis_longitud =", value, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudNotEqualTo(String value) {
            addCriterion("vis_longitud <>", value, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudGreaterThan(String value) {
            addCriterion("vis_longitud >", value, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudGreaterThanOrEqualTo(String value) {
            addCriterion("vis_longitud >=", value, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudLessThan(String value) {
            addCriterion("vis_longitud <", value, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudLessThanOrEqualTo(String value) {
            addCriterion("vis_longitud <=", value, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudLike(String value) {
            addCriterion("vis_longitud like", value, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudNotLike(String value) {
            addCriterion("vis_longitud not like", value, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudIn(List<String> values) {
            addCriterion("vis_longitud in", values, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudNotIn(List<String> values) {
            addCriterion("vis_longitud not in", values, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudBetween(String value1, String value2) {
            addCriterion("vis_longitud between", value1, value2, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudNotBetween(String value1, String value2) {
            addCriterion("vis_longitud not between", value1, value2, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisComResponsableIsNull() {
            addCriterion("vis_com_responsable is null");
            return (Criteria) this;
        }

        public Criteria andVisComResponsableIsNotNull() {
            addCriterion("vis_com_responsable is not null");
            return (Criteria) this;
        }

        public Criteria andVisComResponsableEqualTo(String value) {
            addCriterion("vis_com_responsable =", value, "visComResponsable");
            return (Criteria) this;
        }

        public Criteria andVisComResponsableNotEqualTo(String value) {
            addCriterion("vis_com_responsable <>", value, "visComResponsable");
            return (Criteria) this;
        }

        public Criteria andVisComResponsableGreaterThan(String value) {
            addCriterion("vis_com_responsable >", value, "visComResponsable");
            return (Criteria) this;
        }

        public Criteria andVisComResponsableGreaterThanOrEqualTo(String value) {
            addCriterion("vis_com_responsable >=", value, "visComResponsable");
            return (Criteria) this;
        }

        public Criteria andVisComResponsableLessThan(String value) {
            addCriterion("vis_com_responsable <", value, "visComResponsable");
            return (Criteria) this;
        }

        public Criteria andVisComResponsableLessThanOrEqualTo(String value) {
            addCriterion("vis_com_responsable <=", value, "visComResponsable");
            return (Criteria) this;
        }

        public Criteria andVisComResponsableLike(String value) {
            addCriterion("vis_com_responsable like", value, "visComResponsable");
            return (Criteria) this;
        }

        public Criteria andVisComResponsableNotLike(String value) {
            addCriterion("vis_com_responsable not like", value, "visComResponsable");
            return (Criteria) this;
        }

        public Criteria andVisComResponsableIn(List<String> values) {
            addCriterion("vis_com_responsable in", values, "visComResponsable");
            return (Criteria) this;
        }

        public Criteria andVisComResponsableNotIn(List<String> values) {
            addCriterion("vis_com_responsable not in", values, "visComResponsable");
            return (Criteria) this;
        }

        public Criteria andVisComResponsableBetween(String value1, String value2) {
            addCriterion("vis_com_responsable between", value1, value2, "visComResponsable");
            return (Criteria) this;
        }

        public Criteria andVisComResponsableNotBetween(String value1, String value2) {
            addCriterion("vis_com_responsable not between", value1, value2, "visComResponsable");
            return (Criteria) this;
        }

        public Criteria andVisComDescripcionIsNull() {
            addCriterion("vis_com_descripcion is null");
            return (Criteria) this;
        }

        public Criteria andVisComDescripcionIsNotNull() {
            addCriterion("vis_com_descripcion is not null");
            return (Criteria) this;
        }

        public Criteria andVisComDescripcionEqualTo(String value) {
            addCriterion("vis_com_descripcion =", value, "visComDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisComDescripcionNotEqualTo(String value) {
            addCriterion("vis_com_descripcion <>", value, "visComDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisComDescripcionGreaterThan(String value) {
            addCriterion("vis_com_descripcion >", value, "visComDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisComDescripcionGreaterThanOrEqualTo(String value) {
            addCriterion("vis_com_descripcion >=", value, "visComDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisComDescripcionLessThan(String value) {
            addCriterion("vis_com_descripcion <", value, "visComDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisComDescripcionLessThanOrEqualTo(String value) {
            addCriterion("vis_com_descripcion <=", value, "visComDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisComDescripcionLike(String value) {
            addCriterion("vis_com_descripcion like", value, "visComDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisComDescripcionNotLike(String value) {
            addCriterion("vis_com_descripcion not like", value, "visComDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisComDescripcionIn(List<String> values) {
            addCriterion("vis_com_descripcion in", values, "visComDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisComDescripcionNotIn(List<String> values) {
            addCriterion("vis_com_descripcion not in", values, "visComDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisComDescripcionBetween(String value1, String value2) {
            addCriterion("vis_com_descripcion between", value1, value2, "visComDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisComDescripcionNotBetween(String value1, String value2) {
            addCriterion("vis_com_descripcion not between", value1, value2, "visComDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisContactoIsNull() {
            addCriterion("vis_contacto is null");
            return (Criteria) this;
        }

        public Criteria andVisContactoIsNotNull() {
            addCriterion("vis_contacto is not null");
            return (Criteria) this;
        }

        public Criteria andVisContactoEqualTo(String value) {
            addCriterion("vis_contacto =", value, "visContacto");
            return (Criteria) this;
        }

        public Criteria andVisContactoNotEqualTo(String value) {
            addCriterion("vis_contacto <>", value, "visContacto");
            return (Criteria) this;
        }

        public Criteria andVisContactoGreaterThan(String value) {
            addCriterion("vis_contacto >", value, "visContacto");
            return (Criteria) this;
        }

        public Criteria andVisContactoGreaterThanOrEqualTo(String value) {
            addCriterion("vis_contacto >=", value, "visContacto");
            return (Criteria) this;
        }

        public Criteria andVisContactoLessThan(String value) {
            addCriterion("vis_contacto <", value, "visContacto");
            return (Criteria) this;
        }

        public Criteria andVisContactoLessThanOrEqualTo(String value) {
            addCriterion("vis_contacto <=", value, "visContacto");
            return (Criteria) this;
        }

        public Criteria andVisContactoLike(String value) {
            addCriterion("vis_contacto like", value, "visContacto");
            return (Criteria) this;
        }

        public Criteria andVisContactoNotLike(String value) {
            addCriterion("vis_contacto not like", value, "visContacto");
            return (Criteria) this;
        }

        public Criteria andVisContactoIn(List<String> values) {
            addCriterion("vis_contacto in", values, "visContacto");
            return (Criteria) this;
        }

        public Criteria andVisContactoNotIn(List<String> values) {
            addCriterion("vis_contacto not in", values, "visContacto");
            return (Criteria) this;
        }

        public Criteria andVisContactoBetween(String value1, String value2) {
            addCriterion("vis_contacto between", value1, value2, "visContacto");
            return (Criteria) this;
        }

        public Criteria andVisContactoNotBetween(String value1, String value2) {
            addCriterion("vis_contacto not between", value1, value2, "visContacto");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioIsNull() {
            addCriterion("vis_fec_inicio is null");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioIsNotNull() {
            addCriterion("vis_fec_inicio is not null");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_inicio =", value, "visFecInicio");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioNotEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_inicio <>", value, "visFecInicio");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioGreaterThan(Date value) {
            addCriterionForJDBCDate("vis_fec_inicio >", value, "visFecInicio");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_inicio >=", value, "visFecInicio");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioLessThan(Date value) {
            addCriterionForJDBCDate("vis_fec_inicio <", value, "visFecInicio");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_inicio <=", value, "visFecInicio");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioIn(List<Date> values) {
            addCriterionForJDBCDate("vis_fec_inicio in", values, "visFecInicio");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioNotIn(List<Date> values) {
            addCriterionForJDBCDate("vis_fec_inicio not in", values, "visFecInicio");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_fec_inicio between", value1, value2, "visFecInicio");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_fec_inicio not between", value1, value2, "visFecInicio");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionIsNull() {
            addCriterion("vis_fec_finalizacion is null");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionIsNotNull() {
            addCriterion("vis_fec_finalizacion is not null");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_finalizacion =", value, "visFecFinalizacion");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionNotEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_finalizacion <>", value, "visFecFinalizacion");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionGreaterThan(Date value) {
            addCriterionForJDBCDate("vis_fec_finalizacion >", value, "visFecFinalizacion");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_finalizacion >=", value, "visFecFinalizacion");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionLessThan(Date value) {
            addCriterionForJDBCDate("vis_fec_finalizacion <", value, "visFecFinalizacion");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_finalizacion <=", value, "visFecFinalizacion");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionIn(List<Date> values) {
            addCriterionForJDBCDate("vis_fec_finalizacion in", values, "visFecFinalizacion");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionNotIn(List<Date> values) {
            addCriterionForJDBCDate("vis_fec_finalizacion not in", values, "visFecFinalizacion");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_fec_finalizacion between", value1, value2, "visFecFinalizacion");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_fec_finalizacion not between", value1, value2, "visFecFinalizacion");
            return (Criteria) this;
        }

        public Criteria andVisComFecComprometidaIsNull() {
            addCriterion("vis_com_fec_comprometida is null");
            return (Criteria) this;
        }

        public Criteria andVisComFecComprometidaIsNotNull() {
            addCriterion("vis_com_fec_comprometida is not null");
            return (Criteria) this;
        }

        public Criteria andVisComFecComprometidaEqualTo(Date value) {
            addCriterionForJDBCDate("vis_com_fec_comprometida =", value, "visComFecComprometida");
            return (Criteria) this;
        }

        public Criteria andVisComFecComprometidaNotEqualTo(Date value) {
            addCriterionForJDBCDate("vis_com_fec_comprometida <>", value, "visComFecComprometida");
            return (Criteria) this;
        }

        public Criteria andVisComFecComprometidaGreaterThan(Date value) {
            addCriterionForJDBCDate("vis_com_fec_comprometida >", value, "visComFecComprometida");
            return (Criteria) this;
        }

        public Criteria andVisComFecComprometidaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_com_fec_comprometida >=", value, "visComFecComprometida");
            return (Criteria) this;
        }

        public Criteria andVisComFecComprometidaLessThan(Date value) {
            addCriterionForJDBCDate("vis_com_fec_comprometida <", value, "visComFecComprometida");
            return (Criteria) this;
        }

        public Criteria andVisComFecComprometidaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_com_fec_comprometida <=", value, "visComFecComprometida");
            return (Criteria) this;
        }

        public Criteria andVisComFecComprometidaIn(List<Date> values) {
            addCriterionForJDBCDate("vis_com_fec_comprometida in", values, "visComFecComprometida");
            return (Criteria) this;
        }

        public Criteria andVisComFecComprometidaNotIn(List<Date> values) {
            addCriterionForJDBCDate("vis_com_fec_comprometida not in", values, "visComFecComprometida");
            return (Criteria) this;
        }

        public Criteria andVisComFecComprometidaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_com_fec_comprometida between", value1, value2, "visComFecComprometida");
            return (Criteria) this;
        }

        public Criteria andVisComFecComprometidaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_com_fec_comprometida not between", value1, value2, "visComFecComprometida");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaIsNull() {
            addCriterion("vis_fec_alta is null");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaIsNotNull() {
            addCriterion("vis_fec_alta is not null");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_alta =", value, "visFecAlta");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaNotEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_alta <>", value, "visFecAlta");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaGreaterThan(Date value) {
            addCriterionForJDBCDate("vis_fec_alta >", value, "visFecAlta");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_alta >=", value, "visFecAlta");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaLessThan(Date value) {
            addCriterionForJDBCDate("vis_fec_alta <", value, "visFecAlta");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_alta <=", value, "visFecAlta");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaIn(List<Date> values) {
            addCriterionForJDBCDate("vis_fec_alta in", values, "visFecAlta");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaNotIn(List<Date> values) {
            addCriterionForJDBCDate("vis_fec_alta not in", values, "visFecAlta");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_fec_alta between", value1, value2, "visFecAlta");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_fec_alta not between", value1, value2, "visFecAlta");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaIsNull() {
            addCriterion("vis_fec_baja is null");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaIsNotNull() {
            addCriterion("vis_fec_baja is not null");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_baja =", value, "visFecBaja");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaNotEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_baja <>", value, "visFecBaja");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaGreaterThan(Date value) {
            addCriterionForJDBCDate("vis_fec_baja >", value, "visFecBaja");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_baja >=", value, "visFecBaja");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaLessThan(Date value) {
            addCriterionForJDBCDate("vis_fec_baja <", value, "visFecBaja");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_baja <=", value, "visFecBaja");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaIn(List<Date> values) {
            addCriterionForJDBCDate("vis_fec_baja in", values, "visFecBaja");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaNotIn(List<Date> values) {
            addCriterionForJDBCDate("vis_fec_baja not in", values, "visFecBaja");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_fec_baja between", value1, value2, "visFecBaja");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_fec_baja not between", value1, value2, "visFecBaja");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionIsNull() {
            addCriterion("vis_fec_modificacion is null");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionIsNotNull() {
            addCriterion("vis_fec_modificacion is not null");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_modificacion =", value, "visFecModificacion");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionNotEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_modificacion <>", value, "visFecModificacion");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionGreaterThan(Date value) {
            addCriterionForJDBCDate("vis_fec_modificacion >", value, "visFecModificacion");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_modificacion >=", value, "visFecModificacion");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionLessThan(Date value) {
            addCriterionForJDBCDate("vis_fec_modificacion <", value, "visFecModificacion");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_modificacion <=", value, "visFecModificacion");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionIn(List<Date> values) {
            addCriterionForJDBCDate("vis_fec_modificacion in", values, "visFecModificacion");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionNotIn(List<Date> values) {
            addCriterionForJDBCDate("vis_fec_modificacion not in", values, "visFecModificacion");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_fec_modificacion between", value1, value2, "visFecModificacion");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_fec_modificacion not between", value1, value2, "visFecModificacion");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaIsNull() {
            addCriterion("vis_usu_alta is null");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaIsNotNull() {
            addCriterion("vis_usu_alta is not null");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaEqualTo(Integer value) {
            addCriterion("vis_usu_alta =", value, "visUsuAlta");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaNotEqualTo(Integer value) {
            addCriterion("vis_usu_alta <>", value, "visUsuAlta");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaGreaterThan(Integer value) {
            addCriterion("vis_usu_alta >", value, "visUsuAlta");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaGreaterThanOrEqualTo(Integer value) {
            addCriterion("vis_usu_alta >=", value, "visUsuAlta");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaLessThan(Integer value) {
            addCriterion("vis_usu_alta <", value, "visUsuAlta");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaLessThanOrEqualTo(Integer value) {
            addCriterion("vis_usu_alta <=", value, "visUsuAlta");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaIn(List<Integer> values) {
            addCriterion("vis_usu_alta in", values, "visUsuAlta");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaNotIn(List<Integer> values) {
            addCriterion("vis_usu_alta not in", values, "visUsuAlta");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaBetween(Integer value1, Integer value2) {
            addCriterion("vis_usu_alta between", value1, value2, "visUsuAlta");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaNotBetween(Integer value1, Integer value2) {
            addCriterion("vis_usu_alta not between", value1, value2, "visUsuAlta");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaIsNull() {
            addCriterion("vis_usu_baja is null");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaIsNotNull() {
            addCriterion("vis_usu_baja is not null");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaEqualTo(Integer value) {
            addCriterion("vis_usu_baja =", value, "visUsuBaja");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaNotEqualTo(Integer value) {
            addCriterion("vis_usu_baja <>", value, "visUsuBaja");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaGreaterThan(Integer value) {
            addCriterion("vis_usu_baja >", value, "visUsuBaja");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaGreaterThanOrEqualTo(Integer value) {
            addCriterion("vis_usu_baja >=", value, "visUsuBaja");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaLessThan(Integer value) {
            addCriterion("vis_usu_baja <", value, "visUsuBaja");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaLessThanOrEqualTo(Integer value) {
            addCriterion("vis_usu_baja <=", value, "visUsuBaja");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaIn(List<Integer> values) {
            addCriterion("vis_usu_baja in", values, "visUsuBaja");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaNotIn(List<Integer> values) {
            addCriterion("vis_usu_baja not in", values, "visUsuBaja");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaBetween(Integer value1, Integer value2) {
            addCriterion("vis_usu_baja between", value1, value2, "visUsuBaja");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaNotBetween(Integer value1, Integer value2) {
            addCriterion("vis_usu_baja not between", value1, value2, "visUsuBaja");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionIsNull() {
            addCriterion("vis_usu_modificacion is null");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionIsNotNull() {
            addCriterion("vis_usu_modificacion is not null");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionEqualTo(Integer value) {
            addCriterion("vis_usu_modificacion =", value, "visUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionNotEqualTo(Integer value) {
            addCriterion("vis_usu_modificacion <>", value, "visUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionGreaterThan(Integer value) {
            addCriterion("vis_usu_modificacion >", value, "visUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionGreaterThanOrEqualTo(Integer value) {
            addCriterion("vis_usu_modificacion >=", value, "visUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionLessThan(Integer value) {
            addCriterion("vis_usu_modificacion <", value, "visUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionLessThanOrEqualTo(Integer value) {
            addCriterion("vis_usu_modificacion <=", value, "visUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionIn(List<Integer> values) {
            addCriterion("vis_usu_modificacion in", values, "visUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionNotIn(List<Integer> values) {
            addCriterion("vis_usu_modificacion not in", values, "visUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionBetween(Integer value1, Integer value2) {
            addCriterion("vis_usu_modificacion between", value1, value2, "visUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionNotBetween(Integer value1, Integer value2) {
            addCriterion("vis_usu_modificacion not between", value1, value2, "visUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andCarCodigoIsNull() {
            addCriterion("car_codigo is null");
            return (Criteria) this;
        }

        public Criteria andCarCodigoIsNotNull() {
            addCriterion("car_codigo is not null");
            return (Criteria) this;
        }

        public Criteria andCarCodigoEqualTo(Integer value) {
            addCriterion("car_codigo =", value, "carCodigo");
            return (Criteria) this;
        }

        public Criteria andCarCodigoNotEqualTo(Integer value) {
            addCriterion("car_codigo <>", value, "carCodigo");
            return (Criteria) this;
        }

        public Criteria andCarCodigoGreaterThan(Integer value) {
            addCriterion("car_codigo >", value, "carCodigo");
            return (Criteria) this;
        }

        public Criteria andCarCodigoGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_codigo >=", value, "carCodigo");
            return (Criteria) this;
        }

        public Criteria andCarCodigoLessThan(Integer value) {
            addCriterion("car_codigo <", value, "carCodigo");
            return (Criteria) this;
        }

        public Criteria andCarCodigoLessThanOrEqualTo(Integer value) {
            addCriterion("car_codigo <=", value, "carCodigo");
            return (Criteria) this;
        }

        public Criteria andCarCodigoIn(List<Integer> values) {
            addCriterion("car_codigo in", values, "carCodigo");
            return (Criteria) this;
        }

        public Criteria andCarCodigoNotIn(List<Integer> values) {
            addCriterion("car_codigo not in", values, "carCodigo");
            return (Criteria) this;
        }

        public Criteria andCarCodigoBetween(Integer value1, Integer value2) {
            addCriterion("car_codigo between", value1, value2, "carCodigo");
            return (Criteria) this;
        }

        public Criteria andCarCodigoNotBetween(Integer value1, Integer value2) {
            addCriterion("car_codigo not between", value1, value2, "carCodigo");
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