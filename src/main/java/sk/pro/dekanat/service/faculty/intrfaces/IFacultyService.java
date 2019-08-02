package sk.pro.dekanat.service.faculty.intrfaces;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import sk.pro.dekanat.model.Faculty;

import java.util.List;

@Repository
public interface IFacultyService {
    List<Faculty> getAll();
}
