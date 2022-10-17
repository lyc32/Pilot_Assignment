package com.pilot.humanresource.server;

import com.pilot.humanresource.dao.SalaryReportRepository;
import com.pilot.humanresource.helper.SalaryReportHelper;
import com.pilot.humanresource.model.SalaryReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SalaryReportServer
{
    @Autowired
    private SalaryReportHelper salaryReportHelper;

    public List<SalaryReport> findByJob(String job)
    {
        List<SalaryReport> result = new ArrayList<>();
        salaryReportHelper.findByJob(job).forEach(result::add);
        return result;
    }

    public void spGenerateReport(String job_in)
    {
        salaryReportHelper.spGenerateReport(job_in);
    }

}
