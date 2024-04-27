package uxtj.apiinvernadero.apiinvernadero.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uxtj.apiinvernadero.apiinvernadero.models.Report;
import uxtj.apiinvernadero.apiinvernadero.service.ReportService;

import java.util.List;

@RestController
@RequestMapping("/api/invernadero/v1/report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    // Método GET para obtener todos los informes
    @GetMapping
    public List<Report> getAllReports() {
        return reportService.getAllReports();
    }

    // Método POST para agregar un nuevo informe
    @PostMapping
    public Report addReport(@RequestBody Report report) {
        return reportService.saveReport(report);
    }

    // Método PUT para actualizar un informe existente
    @PutMapping("/{id_report}")
    public Report updateReport(@PathVariable Long id_report, @RequestBody Report updatedReport) {
        return reportService.updateReport(id_report, updatedReport);
    }

    // Método DELETE para eliminar un informe por su ID
    @DeleteMapping("/{id_report}")
    public void deleteReport(@PathVariable Long id_report) {
        reportService.deleteReport(id_report);
    }
}
