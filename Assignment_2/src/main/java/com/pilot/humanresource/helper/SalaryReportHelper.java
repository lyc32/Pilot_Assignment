package com.pilot.humanresource.helper;

import com.pilot.humanresource.dao.SalaryReportRepository;
import com.pilot.humanresource.model.SalaryReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SalaryReportHelper
{
    @Autowired
    SalaryReportRepository salaryReportRepository;

    public List<SalaryReport> findByJob(String job)
    {
        List<SalaryReport> result = new ArrayList<>();
        salaryReportRepository.findByJob(job).forEach(result::add);
        return result;
    }

    public void spGenerateReport(String job_in)
    {
        salaryReportRepository.spGenerateReport(job_in);
    }
}
