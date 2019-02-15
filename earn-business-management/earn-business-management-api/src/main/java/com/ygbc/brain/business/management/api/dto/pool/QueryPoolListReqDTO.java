package com.ygbc.brain.business.management.api.dto.pool;

import com.ygbc.brain.base.dto.BaseDTO;

import java.util.Date;

public class QueryPoolListReqDTO extends BaseDTO {
    /**
     * 初始奖励积分
     */
    private Integer initIntegration;

    /**
     * 初始参与挑战积分
     */
    private Integer initParticipateIntegration;

    /**
     * 奖池累积上限
     */
    private Integer integrationMax;

    /**
     * 奖池累积下限
     */
    private Integer integrationMin;

    /**
     * 计划成功率
     */
    private Integer planRate;

    /**
     * 当前成功率
     */
    private Integer currentRate;

    /**
     * 当前累积积分
     */
    private Integer currentIntegration;

    /**
     * 当前挑战所需积分
     */
    private Integer currentParticipateIntegration;

    /**
     * 参与人数
     */
    private Integer participantNum;

    /**
     * 参与次数
     */
    private Integer participationTimes;

    /**
     * 成功人数
     */
    private Integer winnerNum;

    /**
     * 持续时长
     */
    private Integer period;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 奖励积分
     */
    private Integer awardIntegration;

    /**
     * 利润
     */
    private Integer profitIntegration;

    /**
     * 是否盈利
     */
    private Boolean isEarn;

    /**
     * 是否需要干预
     */
    private Boolean needMeddle;

    /**
     * 状态 C:新建;O:进行中;L:锁定;D:完成
     */
    private String status;

    public Integer getInitIntegration() {
        return initIntegration;
    }

    public void setInitIntegration(Integer initIntegration) {
        this.initIntegration = initIntegration;
    }

    public Integer getInitParticipateIntegration() {
        return initParticipateIntegration;
    }

    public void setInitParticipateIntegration(Integer initParticipateIntegration) {
        this.initParticipateIntegration = initParticipateIntegration;
    }

    public Integer getIntegrationMax() {
        return integrationMax;
    }

    public void setIntegrationMax(Integer integrationMax) {
        this.integrationMax = integrationMax;
    }

    public Integer getIntegrationMin() {
        return integrationMin;
    }

    public void setIntegrationMin(Integer integrationMin) {
        this.integrationMin = integrationMin;
    }

    public Integer getPlanRate() {
        return planRate;
    }

    public void setPlanRate(Integer planRate) {
        this.planRate = planRate;
    }

    public Integer getCurrentRate() {
        return currentRate;
    }

    public void setCurrentRate(Integer currentRate) {
        this.currentRate = currentRate;
    }

    public Integer getCurrentIntegration() {
        return currentIntegration;
    }

    public void setCurrentIntegration(Integer currentIntegration) {
        this.currentIntegration = currentIntegration;
    }

    public Integer getCurrentParticipateIntegration() {
        return currentParticipateIntegration;
    }

    public void setCurrentParticipateIntegration(Integer currentParticipateIntegration) {
        this.currentParticipateIntegration = currentParticipateIntegration;
    }

    public Integer getParticipantNum() {
        return participantNum;
    }

    public void setParticipantNum(Integer participantNum) {
        this.participantNum = participantNum;
    }

    public Integer getParticipationTimes() {
        return participationTimes;
    }

    public void setParticipationTimes(Integer participationTimes) {
        this.participationTimes = participationTimes;
    }

    public Integer getWinnerNum() {
        return winnerNum;
    }

    public void setWinnerNum(Integer winnerNum) {
        this.winnerNum = winnerNum;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getAwardIntegration() {
        return awardIntegration;
    }

    public void setAwardIntegration(Integer awardIntegration) {
        this.awardIntegration = awardIntegration;
    }

    public Integer getProfitIntegration() {
        return profitIntegration;
    }

    public void setProfitIntegration(Integer profitIntegration) {
        this.profitIntegration = profitIntegration;
    }

    public Boolean getEarn() {
        return isEarn;
    }

    public void setEarn(Boolean earn) {
        isEarn = earn;
    }

    public Boolean getNeedMeddle() {
        return needMeddle;
    }

    public void setNeedMeddle(Boolean needMeddle) {
        this.needMeddle = needMeddle;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
