package com.pilot.humanresource.dao;

import com.pilot.humanresource.model.SalaryReport;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



public interface SalaryReportRepository extends Repository<SalaryReport, String>
{
    List<SalaryReport> findByJob(String job_in);

    @Transactional
    @Procedure(name = "spGenerateReport")
    public void spGenerateReport(@Param("job_in") String job_in);
}
