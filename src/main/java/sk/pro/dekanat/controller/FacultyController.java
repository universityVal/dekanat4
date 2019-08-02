package sk.pro.dekanat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.pro.dekanat.dao.faculty.impls.FacultyDaoImpl;
import sk.pro.dekanat.model.Faculty;

import java.util.List;

@RestController
public class FacultyController {

    @Autowired
    FacultyDaoImpl facultyDao;

    @RequestMapping("/faculty/list")
    List<Faculty> showAll(){
        return facultyDao.getAll();
    }

}
