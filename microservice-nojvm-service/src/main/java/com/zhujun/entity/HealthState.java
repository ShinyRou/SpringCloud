package com.zhujun.entity;

/**
 * className: HealthState
 * create by: zhujun
 * description: TODO
 * create time: 2019/5/13 10:04
 */
public class HealthState {
    String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HealthState(String status) {
        this.status = status;
    }
}
