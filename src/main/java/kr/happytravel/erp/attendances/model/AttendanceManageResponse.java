package kr.happytravel.erp.attendances.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttendanceManageResponse {
    private String attendanceCode;
    private String empId;
    private String empName;
    private String positionName;
    private String departmentName;
    private String attendanceTypeName;
    private String startDate;
    private String endDate;
    private String reason;
    private String creationDate;
    private String title;
}
