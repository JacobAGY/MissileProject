package edu.szu.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "task_plan_result_point_info")
public class TaskPlanResultPointInfo {
    @Id
    private Integer id;

    /**
     * 任务名称
     */
    @Column(name = "t_name")
    private String tName;

    /**
     * agv id
     */
    @Column(name = "agv_name")
    private String agvName;

    @Column(name = "shelf_id")
    private Integer shelfId;

    /**
     * 装备 id
     */
    @Column(name = "equipment_id")
    private String equipmentId;

    /**
     * agv执行的动作
     */
    @Column(name = "agv_action")
    private String agvAction;

    /**
     * agv动作序号
     */
    @Column(name = "agv_action_num")
    private Integer agvActionNum;

    /**
     * 点位
     */
    private String point;

    /**
     * 执行时间
     */
    @Column(name = "finish_timestamp")
    private String finishTimestamp;

    /**
     * 点位占用开始时间
     */
    @Column(name = "start_timestamp")
    private Date startTimestamp;

    /**
     * 正常规划、重规划
     */
    @Column(name = "plan_source")
    private String planSource;

    /**
     * 站位占用结束时间
     */
    @Column(name = "end_timestamp")
    private Date endTimestamp;

    /**
     * 是否有效
     */
    private Integer valid;

    /**
     * 入表时间
     */
    @Column(name = "insert_timestamp")
    private String insertTimestamp;

    @Column(name = "update_timestamp")
    private Date updateTimestamp;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取任务名称
     *
     * @return t_name - 任务名称
     */
    public String gettName() {
        return tName;
    }

    /**
     * 设置任务名称
     *
     * @param tName 任务名称
     */
    public void settName(String tName) {
        this.tName = tName;
    }

    /**
     * 获取agv id
     *
     * @return agv_name - agv id
     */
    public String getAgvName() {
        return agvName;
    }

    /**
     * 设置agv id
     *
     * @param agvName agv id
     */
    public void setAgvName(String agvName) {
        this.agvName = agvName;
    }

    /**
     * @return shelf_id
     */
    public Integer getShelfId() {
        return shelfId;
    }

    /**
     * @param shelfId
     */
    public void setShelfId(Integer shelfId) {
        this.shelfId = shelfId;
    }

    /**
     * 获取装备 id
     *
     * @return equipment_id - 装备 id
     */
    public String getEquipmentId() {
        return equipmentId;
    }

    /**
     * 设置装备 id
     *
     * @param equipmentId 装备 id
     */
    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    /**
     * 获取agv执行的动作
     *
     * @return agv_action - agv执行的动作
     */
    public String getAgvAction() {
        return agvAction;
    }

    /**
     * 设置agv执行的动作
     *
     * @param agvAction agv执行的动作
     */
    public void setAgvAction(String agvAction) {
        this.agvAction = agvAction;
    }

    /**
     * 获取agv动作序号
     *
     * @return agv_action_num - agv动作序号
     */
    public Integer getAgvActionNum() {
        return agvActionNum;
    }

    /**
     * 设置agv动作序号
     *
     * @param agvActionNum agv动作序号
     */
    public void setAgvActionNum(Integer agvActionNum) {
        this.agvActionNum = agvActionNum;
    }

    /**
     * 获取点位
     *
     * @return point - 点位
     */
    public String getPoint() {
        return point;
    }

    /**
     * 设置点位
     *
     * @param point 点位
     */
    public void setPoint(String point) {
        this.point = point;
    }

    /**
     * 获取执行时间
     *
     * @return finish_timestamp - 执行时间
     */
    public String getFinishTimestamp() {
        return finishTimestamp;
    }

    /**
     * 设置执行时间
     *
     * @param finishTimestamp 执行时间
     */
    public void setFinishTimestamp(String finishTimestamp) {
        this.finishTimestamp = finishTimestamp;
    }

    /**
     * 获取点位占用开始时间
     *
     * @return start_timestamp - 点位占用开始时间
     */
    public Date getStartTimestamp() {
        return startTimestamp;
    }

    /**
     * 设置点位占用开始时间
     *
     * @param startTimestamp 点位占用开始时间
     */
    public void setStartTimestamp(Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * 获取正常规划、重规划
     *
     * @return plan_source - 正常规划、重规划
     */
    public String getPlanSource() {
        return planSource;
    }

    /**
     * 设置正常规划、重规划
     *
     * @param planSource 正常规划、重规划
     */
    public void setPlanSource(String planSource) {
        this.planSource = planSource;
    }

    /**
     * 获取站位占用结束时间
     *
     * @return end_timestamp - 站位占用结束时间
     */
    public Date getEndTimestamp() {
        return endTimestamp;
    }

    /**
     * 设置站位占用结束时间
     *
     * @param endTimestamp 站位占用结束时间
     */
    public void setEndTimestamp(Date endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    /**
     * 获取是否有效
     *
     * @return valid - 是否有效
     */
    public Integer getValid() {
        return valid;
    }

    /**
     * 设置是否有效
     *
     * @param valid 是否有效
     */
    public void setValid(Integer valid) {
        this.valid = valid;
    }

    /**
     * 获取入表时间
     *
     * @return insert_timestamp - 入表时间
     */
    public String getInsertTimestamp() {
        return insertTimestamp;
    }

    /**
     * 设置入表时间
     *
     * @param insertTimestamp 入表时间
     */
    public void setInsertTimestamp(String insertTimestamp) {
        this.insertTimestamp = insertTimestamp;
    }

    /**
     * @return update_timestamp
     */
    public Date getUpdateTimestamp() {
        return updateTimestamp;
    }

    /**
     * @param updateTimestamp
     */
    public void setUpdateTimestamp(Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }
}