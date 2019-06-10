package com.bfd.webappgzga.enums;

/**
 * 业务异常枚举
 *
 * @author zhanyong
 * @Date ${dateString}
 */
public enum BizExceptionEnum {

    SYS_EXCEPTION(1000, "系统异常"),
    BIZ_EXCEPTION(2000, "业务异常"),

    PARAM_EXCEPTION(100, "参数错误："),

    PHONE_BEEN_USED_EXECPTION(401,"该手机号已被注册,是否覆盖"),
    INVALID_IS_VIP_EXCEPTION(401, "用户已经是会员，不需要再次注册"),
    INVALID_EXITPHONE_EXCEPTION(401, "用户已经绑定手机号"),
    INVALID_VERIFYCODE_EXCEPTION(401, "手机验证码错误"),
    VARIFY_CODE_EXCEPTION(401,"验证码错误"),
    INVALID_UNION_ID_EXCEPTION(401, "微信账号不存在"),
    INVALID_ACCOUNT_EXCEPTION(401, "账号被删除"),
    ACCOUNT_CLOSE_EXCEPTION(401, "账号被禁用"),
    INVALID_ORG_EXCEPTION(401, "组织机构被删除"),
    ORG_CLOSE_EXCEPTION(401, "组织机构被禁用"),
    AUTHOR_CHANGE_EXCEPTION(401, "权限信息变更重新登录"),
    POST_NULL_EXCEPTION(401, "当前登录人无岗位信息，请设置岗位后重试"),
    POST_GROUP_CREATING_EXCEPTION(401, "岗位被锁定（群组创建中），请稍后再试"),
    POST_GROUP_CREATE_FAIL_EXCEPTION(401, "岗位被锁定（群组创建失败），请联系管理员"),
    POST_CLOSE_EXCEPTION(401, "岗位已禁用，请联系管理员"),
    POST_ILLEGAL(401, "非法岗位"),
    LICENSE_EXPIRED(401, "许可过期"),
    OPER_PERMISSION_DENIED(403, "无操作权限"),
    PRODUCT_PERMISSION_DENIED(401, "功能超出许可授权"),
    ENTITY_OPER_PERMISSION_DENIED(403, "无实体操作权限"),


    SQL_EXCEPTION(4000, "SQL异常"),
    SQL_COLUMN_EXCEPTION(4001, "后台数据还没有对接，请在数据介入后使用"),
    GROUP_EXPRESSION_EXCEPTION(4002, "用户群表达式异常"),
    NAME_REPEATED(4003, "名称重复"),
    FIELD_VALUE_REPEAT_EXCEPTION(3000, "字段值重复");


    private final Integer errorCode;
    private final String errordesc;

    BizExceptionEnum(Integer errorCode, String errordesc) {
        this.errorCode = errorCode;
        this.errordesc = errordesc;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getErrordesc() {
        return errordesc;
    }
}