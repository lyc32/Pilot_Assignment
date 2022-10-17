package com.pilot.humanresource.controller;

import com.pilot.humanresource.model.SalaryReport;
import com.pilot.humanresource.server.SalaryReportServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import javax.websocket.server.PathParam;
import java.util.Date;
import java.util.List;
import java.util.Map;


@RestController
public class SalaryReportController
{
    @Autowired
    private SalaryReportServer salaryReportServer;

    @GetMapping("/get_salary_report/{job}")
    public List<SalaryReport> getSalaryReport(@PathVariable String job)
    {
        return salaryReportServer.findByJob(job);
    }
    @PostMapping("/add_salary_report/{job}")
    public void addSalaryReport(@PathVariable String job)
    {
        salaryReportServer.spGenerateReport(job);
    }
}
