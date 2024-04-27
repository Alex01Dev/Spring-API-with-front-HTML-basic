package uxtj.apiinvernadero.apiinvernadero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uxtj.apiinvernadero.apiinvernadero.models.Report;

@Repository
public interface ReportRepository extends JpaRepository <Report,Long> {
}