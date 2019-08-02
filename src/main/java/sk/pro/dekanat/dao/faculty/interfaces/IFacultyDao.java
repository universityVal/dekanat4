package sk.pro.dekanat.dao.faculty.interfaces;

import sk.pro.dekanat.model.Faculty;

import java.util.List;

public interface IFacultyDao {
    Faculty create(Faculty faculty);
    Faculty get(int id);
    Faculty update(Faculty faculty);
    Faculty delete(int id);
    List<Faculty> getAll();
}
