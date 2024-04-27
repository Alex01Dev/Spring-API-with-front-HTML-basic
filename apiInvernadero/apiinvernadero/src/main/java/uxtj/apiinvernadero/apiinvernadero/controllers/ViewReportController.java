package uxtj.apiinvernadero.apiinvernadero.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uxtj.apiinvernadero.apiinvernadero.models.Report;
import uxtj.apiinvernadero.apiinvernadero.projections.ViewReportProjection;
import uxtj.apiinvernadero.apiinvernadero.repository.ViewReportRepository;

import java.util.List;

@RestController
@RequestMapping("/api/invernadero/v1/viewreport")
public class ViewReportController {

    @Autowired
    private ViewReportRepository viewReportRepository;

    // Método GET para obtener todos los informes con datos seleccionados
    @GetMapping
    public List<ViewReportProjection> getAllViewReports() {
        return viewReportRepository.findAllProjectedBy();
    }

    // Método GET para obtener un informe por su ID
    @GetMapping("/{id_report}")
    public ViewReportProjection getViewReportById(@PathVariable Long id_report) {
        return viewReportRepository.findByReportIDProjectedBy(id_report);
    }
}
