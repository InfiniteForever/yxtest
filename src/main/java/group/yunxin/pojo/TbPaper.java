package group.yunxin.pojo;

import java.util.Date;

public class TbPaper {
    private Long id;

    private Long examId;

    private Long studentId;

    private Date timeEnter;

    private Date timeSubmit;

    private Integer actualMarks;

    private Integer numSwitch;

    private Integer num1;

    private Integer num2;

    private Integer num3;

    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getExamId() {
        return examId;
    }

    public void setExamId(Long examId) {
        this.examId = examId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Date getTimeEnter() {
        return timeEnter;
    }

    public void setTimeEnter(Date timeEnter) {
        this.timeEnter = timeEnter;
    }

    public Date getTimeSubmit() {
        return timeSubmit;
    }

    public void setTimeSubmit(Date timeSubmit) {
        this.timeSubmit = timeSubmit;
    }

    public Integer getActualMarks() {
        return actualMarks;
    }

    public void setActualMarks(Integer actualMarks) {
        this.actualMarks = actualMarks;
    }

    public Integer getNumSwitch() {
        return numSwitch;
    }

    public void setNumSwitch(Integer numSwitch) {
        this.numSwitch = numSwitch;
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public Integer getNum3() {
        return num3;
    }

    public void setNum3(Integer num3) {
        this.num3 = num3;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}