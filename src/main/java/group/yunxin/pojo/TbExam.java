package group.yunxin.pojo;

import java.util.Date;

public class TbExam {
    private Long id;

    private String title;

    private Long teacherId;

    private Date createTime;

    private Integer needCamera;

    private Integer isPublic;

    private Double price;

    private Integer diff;

    private Date timeStart;

    private Date timeStop;

    private Date timePublicMarks;

    private Long timeLast;

    private Integer maxSwitch;

    private Integer allowBrowseAfterTime;

    private String marks;

    private Integer totalMark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getNeedCamera() {
        return needCamera;
    }

    public void setNeedCamera(Integer needCamera) {
        this.needCamera = needCamera;
    }

    public Integer getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getDiff() {
        return diff;
    }

    public void setDiff(Integer diff) {
        this.diff = diff;
    }

    public Date getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    public Date getTimeStop() {
        return timeStop;
    }

    public void setTimeStop(Date timeStop) {
        this.timeStop = timeStop;
    }

    public Date getTimePublicMarks() {
        return timePublicMarks;
    }

    public void setTimePublicMarks(Date timePublicMarks) {
        this.timePublicMarks = timePublicMarks;
    }

    public Long getTimeLast() {
        return timeLast;
    }

    public void setTimeLast(Long timeLast) {
        this.timeLast = timeLast;
    }

    public Integer getMaxSwitch() {
        return maxSwitch;
    }

    public void setMaxSwitch(Integer maxSwitch) {
        this.maxSwitch = maxSwitch;
    }

    public Integer getAllowBrowseAfterTime() {
        return allowBrowseAfterTime;
    }

    public void setAllowBrowseAfterTime(Integer allowBrowseAfterTime) {
        this.allowBrowseAfterTime = allowBrowseAfterTime;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks == null ? null : marks.trim();
    }

    public Integer getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(Integer totalMark) {
        this.totalMark = totalMark;
    }
}