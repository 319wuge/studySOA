package com.wuge.study.exception;

/**
 * Created by sky91 on 2015-03-30.
 *
 * @author sky91 - feitiandaxia1991@163.com
 * @since 0.0.1
 */
public class ExceptionKey {
    /**
     * 默认消息
     */
    public static final String DEFAULT_MSG = "服务访问失败，请稍后再试！";
    /**
     * 默认消息key
     */
    public static final String DEFAULT_KEY = "900009";

    /**
     * 业务过时，请刷新页面或更换方案！
     */
    public static final String ALREADY_DEPRECATED                  = "900011";
    /**
     * 参数错误
     */
    public static final String PARAMS_ERROR                        = "100001";
    /**
     * UUMSOA异常
     */
    public static final String UUM_SOA_GENERAL_EXCEPTION_KEY       = "100002";
    /**
     * 房源不存在
     */
    public static final String HOUSE_NOT_EXISTS                    = "200001";
    /**
     * 房源不是出售状态
     */
    public static final String HOUSE_NOT_SALE                      = "200002";
    /**
     * 房源不是出售状态
     */
    public static final String HOUSE_TRADING                       = "200003";
    /**
     * 房源锁定出错
     */
    public static final String HOUSE_TRADING_ERROR                 = "200004";
    /**
     * 房源状态转为不售
     */
    public static final String HOUSE_TRAD_SUCCESS_ERROR            = "200005";
    /**
     * 房源状态转为在售
     */
    public static final String HOUSE_TRAD_FAILURE_ERROR            = "200006";
    /**
     * 订单不存在
     */
    public static final String ORDER_NOT_EXISTS                    = "200101";
    /**
     * 订单状态错误
     */
    public static final String ORDER_STATE_ERROR                   = "200102";
    /**
     * 总价和佣金不能为空
     */
    public static final String ORDER_PRICE_COMMISSION_NULL         = "200103";
    /**
     * 未完成收佣
     */
    public static final String ORDER_PAID_COMMISSION_ERROR         = "200104";
    /**
     * 订单状态不允许修改
     */
    public static final String ORDER_NOT_UPDATE                    = "200105";
    /**
     * 订单状态不允许收佣
     */
    public static final String ORDER_NOT_RECIEVE_COMMISSION        = "200106";
    /**
     * 单据不存在
     */
    public static final String ORDER_RECEIPT_NOT_EXISTS            = "200107";
    /**
     * 单据不允许打印
     */
    public static final String ORDER_RECEIPT_NOT_PRINT             = "200108";
    /**
     * 订单状态不允许作废
     */
    public static final String ORDER_NOT_INVALIDATE                = "200109";
    /**
     * 文档不存在
     */
    public static final String ORDER_DOC_NOT_EXISTS                = "200110";
    /**
     * 订单已被标记为异常，请选取消异常
     */
    public static final String ORDER_ALREADY_EXCEPTION_STATE       = "200111";
    /**
     * 该订单尚未指定交易员/贷款员/签约员，无法进行下一步操作！
     */
    public static final String ORDER_HAS_NO_TRADOR_OR_LOANER       = "200112";
    /**
     * 该订单没有送订报备记录
     */
    public static final String ORDER_HAS_NO_PUT_ON_RECORDS         = "200113";
    /**
     * 该订单已收佣，不允许作废
     */
    public static final String HAS_TAKE_COMMISSION_RECEIPT         = "200114";
    /**
     * 该订单收佣财务未全部确认，不允许结单！
     */
    public static final String HAS_WAIT_CONFIRM_COMMISSION_RECEIPT = "200115";
    /**
     * 流水登记异常，请联系技术人员
     */
    public static final String TRADE_EXCEPTION_KEY                 = "200116";

    /**
     * 订单所属门店没有指定的交易组长、签约组长、贷款组长
     */
    public static final String ORDER_HAS_NOT_TRADE_LEADER = "200117";

    /**
     * 目标交易服务区没有 交易/网签/贷款 组长
     */
    public static final String NO_TARGET_LEADER_IN_TRADE_MENDIAN = "200118";
    /**
     * 居间合同资料未收齐，无法结单，请先确认居间合同资料已收齐！
     */
    public static final String ERROR_ORDER_DATA_STATE            = "200119";
    /**
     * 网签合同资料未收齐，无法结单，请先确认网签合同资料已收齐！
     */
    public static final String ERROR_FOLMAL_ORDER_DATA_STATE     = "200120";
    /**
     * 订单当前状态不允许结单！
     */
    public static final String ERROR_COMMIT_ORDER                = "200126";
    /**
     * 订单当前状态不允许解约
     */
    public static final String ERROR_CANCEL_ORDER                = "200127";
    /**
     * tradeSOA请求失败,请稍后再试!
     */
    public static final String TRADE_SOA_EXCEPTION_KEY           = "900010";

    /**
     * 该订单当前不允许代收资金
     */
    public static final String ORDER_DISALLOW_RECEIVE_MONEY = "200121";

    /**
     * 该订单 贷款部未确认
     */
    public static final String ORDER_WITHOUT_LOANCONFIRM = "200122";

    /**
     * 订单状态不允许更改客户资质状态
     */
    public static final String ORDER_NOT_CUSTOMER_CERTIFY_STATE = "200123";

    /**
     * 订单附加属性不存在
     */
    public static final String ORDER_ATTRIBUTE_NOT_EXISTS  = "200124";
    /**
     * 订单交易详情不存在
     */
    public static final String ORDER_LOAN_TRADE_NOT_EXISTS = "200125";
    /**
     * 成本费用已经确认无法修改
     */
    public static final String ORDER_NOT_FOR_REVENUE_COST  = "200128";

    /**
     * 上传图片出错
     */
    public static final String UPLOAD_HOUSE_IMG_ERROR = "124100";

    /**
     * 通用不存在
     */
    public static final String NOT_EXIST = "100003";

    /**
     * 通用异常
     */
    public static final String ERROR = "200100";

    /**
     * 应收佣金不等于已收佣金，请修改应收佣金或等已收佣金财务确认到账！
     */
    public static final String COMMISSION_NOT_EQ_PAIDCOMMISSION = "200129";

    /**
     * 需要先确认服务费才能结单！
     */
    public static final String MENG_DIAN_DAI_SHOU_FU_WU_ERROR = "200130";

    /**
     * 未关注，无法取消关注
     */
    public static final String HAS_NOT_AGENT_FOLLOW      = "200131";
    /**
     * 有已收款的服务费记录
     */
    public static final String HAS_RECEIVE_MONEY_RECORDS = "200132";

    /**
     * 当前流水状态不允许#var
     */
    public static final String TRADE_STATE_NOT_ALLOW_TODO = "200133";

    /**
     * 当前流水不存在
     */
    public static final String HAS_NO_TRADE = "200134";

    /**
     * 当前交易无收费项
     */
    public static final String HAS_NO_RECEIPT = "200135";

    /**
     * 佣金不合规
     */
    public static final String COMMISSION_IS_UNCOMPLIANCE = "200136";
    /**
     * 收取{类型}总额小于零，请重新确认收费金额！
     */
    public static final String TOTAL_MONEY_LESS_THAN_ZERO = "200137";
    /**
     * 收取{类型}金额大于应收金额，请修改应收金额或重新确认收费金额！
     */
    public static final String RECEIPT_TAKE_MONEY_ERROR   = "200138";

    /**
     * 收取{类型}金额与已确认金额之和小于零，请重新确认收费金额！
     */
    public static final String RECEIPT_CONFIRM_MONEY_ERROR = "900138";

    /**
     * 总计金额需要大于等于零！
     */
    public static final String TOTAL_MONEY_MUST_BE_NOT_MORE_THAN_OR_EQUAL_ZERO = "200139";
    /**
     * 总计金额需要大于零！
     */
    public static final String TOTAL_MONEY_MUST_BE_NOT_MORE_THAN_ZERO          = "200140";
    /**
     * 已收业主独家服务费用 不足  / 业主置顶费
     */
    public static final String YEZHUFUWU_MONEY_NOT_EQ_PAID_YEZHUFUWU_MONEY     = "200141";

    /**
     * 该银行卡已绑定其他账户，不可重复绑定
     */
    public static final String CARD_CANNOT_REBIND      = "900002";
    /**
     * 请绑定本账户所属身份证的银行卡
     */
    public static final String CARD_BIND_SELF          = "900003";
    /**
     * 为了您的账号资金安全，只能绑定合同签署人本人的银行卡，获取更多帮助请致电客服400-700-6622
     */
    public static final String CARD_BIND_CONTRACT_SELF = "900004";

    /**
     * 订单状态不允许签居间后作废
     */
    public static final String ORDER_NOT_CONFIRM_INVALIDATE          = "200142";
    /**
     * 有收款记录未确认，请删除该记录
     */
    public static final String INVALIDATE_CONFIRM_COMMISSION_RECEIPT = "200143";
    /**
     * 有收入，无法作废
     */
    public static final String INVALIDATE_COMMISSION_RECEIPT         = "200144";
    /**
     * 订单状态不允许法务介入
     */
    public static final String ORDER_NOT_LEGAL_INTER                 = "200145";
    /**
     * 订单已经法务介入
     */
    public static final String ORDER_LEGAL_INTER_ERROR               = "200146";
    /**
     * 报告状态错误
     */
    public static final String REPORT_STATE_ERROR                    = "200150";
    /**
     * 报告备注不能为空
     */
    public static final String REMARK_NOT_BLANK                      = "200151";
    /**
     * 作业报告不存在
     */
    public static final String REPORT_NOT_EXIST                      = "200152";
    /**
     * 当前不可以创建作业报告
     */
    public static final String REPORT_NOT_CREATE_ERROR               = "200153";
    /**
     * 已存在作业报告
     */
    public static final String REPORT_EXISTS_ERROR                   = "200154";
    /**
     * 作业报告当前不能删除
     */
    public static final String REPORT_NOT_DEL_ERROR                  = "200155";
    /**
     * 作业报告成本大于已收金额
     */
    public static final String REPORT_COST_ERROR                     = "200156";

    /**
     * 该订单有未审批的记录，请确认申请通过后再重新申请。
     */
    public static final String HAS_NOT_SHENPI_RECORD = "200157";

    /**
     * 提示 当前综合收佣比例不需要佣金审批，可直接确认佣金
     */
    public static final String DONT_NEED_APPLY_DISCOUNT = "200158";

    /**
     * 综合收佣比例过低，你需要申请折佣才能成功签署居间合同！
     */
    public static final String ZONG_HE_SHOU_YONG_RATE_NEED_APPLY_DISCOUNT = "200159";

    /**
     * 综合收佣比例过高，你需要申请折佣才能成功签署居间合同！
     */
    public static final String ZONG_HE_SHOU_YONG_RATE_TOO_HIGH_NEED_APPLY_DISCOUNT = "200959";

    /**
     * 获取城市收佣比例配置错误！
     */
    public static final String ZONG_HE_SHOU_YONG_RATE_NO_CONFIG = "200160";

    /**
     * 综合收佣比例过低，请提醒组长申请折佣！（填写跟进经纪人会收到消息）
     */
    public static final String ZONG_HE_SHOU_YONG_RATE_NEED_APPLY_DISCOUNT2 = "200161";

    /**
     * 综合收佣比例过高，请提醒组长申请超佣！（填写跟进经纪人会收到消息）
     */
    public static final String ZONG_HE_SHOU_YONG_RATE_TOO_HIGH_NEED_APPLY_DISCOUNT2 = "200961";

    /**
     * 创建外部流水号失败
     */
    public static final String CREATE_OUT_SERIAL_NUM_FAILD = "200162";
    /**
     * 当前出款状态不允许#var#
     */
    public static final String OUT_ACCOUNT_STATE_ERROR                     = "300000";
    /**
     * 当前订单状态不允许新增出款
     */
    public static final String ORDER_STATE_NOT_ALLOW_OUT_ACCOUNT           = "300001";

    /**
     * 该订单有收款记录或出款记录未完成，请删除或等待财务确认！
     */
    public static final String HAS_NOT_COMPLETE_RECORD       = "300002";
    /**
     * 该订单有代收资金未出款，请完成出款后再操作！
     */
    public static final String HAS_NOT_OUTACCOUNT_RECORD     = "300003";
    /**
     * 被转费用收款金额不能大于已收金额，请修改应收金额或出款金额！
     */
    public static final String IN_MONEY_HAS_OUT_OF_YING_SHOU = "300004";

    /**
     * 读取城市配置出错！
     */
    public static final String ERROR_GET_CITYCONFIG = "300005";

    /**
     * 获取交易记录失败
     */
    public static final String GET_OUT_TRADE_FAILED = "300006";

    /**
     *  网签资料合同件齐后才能创建网签作业报告
     */
    public static final String NETSIGN_REPORT_NOT_CREATE_ERROR = "300007";
    /**
     * 订单过户后才能创建贷款作业报告
     */
    public static final String LOAN_REPORT_NOT_CREATE_ERROR = "300008";
    /**
     * 订单过户后才能创建交易作业报告
     */
    public static final String TRADE_REPORT_NOT_CREATE_ERROR = "300009";

    public static final String OUT_LOANBONUS = "300010";

    public static final String OUT_NETSIGNBONUS = "300011";

    public static final String OUT_TRADEBONUS = "300012";

    public  static final String VISAINTERVIEW_ERROR = "300013";

    public static final String GRANTLOAN_ERROR = "300014";

    public static final String ORDERDATA_STATE_ERROR = "300015";

    public static final String ORDERDATA_REJECT_ERROR = "300016";

    public static final String NO_DATA_INFO = "300017";

    public static final String COLLECT_BILL_NOT_EXISTS = "200201";
    /**
     * 签居间校验预付款
     */
    public static final String VALID_PRESHOUKUAN_ERROR = "300018";
    /**
     * 该订单有预收资金未出款，请完成出款后再操作！
     */
    public static final String HAS_PRE_NOT_OUTACCOUNT = "300019";
    /**
     * 在线退款失败
     */
    public static final String ON_LINE_BACK_ERROR = "300020";

    /**
     * 业主客户资料未填写，请填写后结单！
     */
    public static final String NO_CUSTOMER_OWNER_ERROR = "300021";
    /**
     * 未添加业主资料信息，请填写后结单！
     */
    public static final String NO_OWNER_ERROR = "300022";
    /**
     * 未添加客户资料信息，请填写后结单！
     */
    public static final String NO_CUSTOMER_ERROR = "300023";
    /**
     * 居间合同编号未填写，请填写后结单！
     */
    public static final String NO_MEDIACY_CONTRACT_CODE_ERROR = "300024";
    /**
     * 居间合同签署日期未填写，请填写后结单！
     */
    public static final String NO_MEDIACY_CONTRACT_COMPLETETIME_ERROR = "300025";
    /**
     * 时间选择器选择错误
     */
    public static final String TIME_CHOOSE_ERROR = "300026";
    /**
     * 租房合同出款参数错误
     */
    public static final String RENT_OUTACCOUNT_PARAM = "400001";
    /**
     * 租房合同出款金额大于已收金额
     */
    public static final String RENT_OUTACCOUNT_MONEY_ERROR = "400002";
    /**
     * 租房合同出款状态错误
     */
    public static final String RENT_OUTACCOUNT_STATE_ERROR = "400003";
}
